/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inf3m212pj;

import java.util.Scanner;

/**
 *
 * @author 182020025
 */
public class NotasEscolaresMatrizMenu {

    static String alunos[];
    static float notas[][];
    static int nAlunos, nNotas, contAlunos;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opM;
        System.out.println("Notas Escolares Matriz");
        System.out.println("Quantos alunos?");
        nAlunos = (int) leiafloat();
        System.out.println("Quantas notas?");
        nNotas = (int) leiafloat();

        alunos = new String[nAlunos];
        notas = new float[nAlunos][nNotas + 1];

        do {
            menu();
            opM = (int) leiafloat();
            switch (opM) {
                case 1:
                    InserirAlunoNotas();
                    break;
                case 2:
                    imprimirAlunosNotas();
                    break;
                case 0:
                    System.out.println("Aplicação encerrada pelo usuário!");
                default:
                    System.out.println("Opção invalida, tente novamente!");
                    break;
            }
        } while (opM != 0);

    }

    public static boolean validaNota(float nota) {
        return nota < 0 || nota > 10;

    }

    public static float leiafloat() {
        Scanner leia = new Scanner(System.in);
        try {
            return leia.nextFloat();
        } catch (Exception e) {
            System.out.println("Valor não é núm., tente novamente: ");
            return leiafloat();
        }
        // TODO code application logic here
    }

    public static void menu() {
        System.out.println("1-Inserir notas do aluno");
        System.out.println("2-Imprimir notas");
        System.out.println("0- Sair");
        System.out.println("Digite aqui: ");
    }

    public static void InserirAlunoNotas() {
        Scanner leia = new Scanner(System.in);
        if (contAlunos < nAlunos) {
            System.out.println("Nome do aluno:");
            alunos[contAlunos] = leia.next();
            for (int j = 0; j < nNotas; j++) {
                do {
                    System.out.println("\tDigite a" + (j + 1) + "ªnota: ");
                    notas[contAlunos][j] = leiafloat();
                    if (validaNota(notas[contAlunos][j])) {
                        System.out.println("Nota inválida, tente novamente!");
                    }
                } while (validaNota(notas[contAlunos][j]));
                notas[contAlunos][nNotas] += notas[contAlunos][j];
            }
            notas[contAlunos][nNotas] = notas[contAlunos][nNotas] / nNotas;
            contAlunos++;
        } else {
            System.out.println("Não é mais possível lançar notas"
                    + "\nTodas posições ocupadas.");
        }

    }

    public static void imprimirAlunosNotas() {
        System.out.println("\n--Resultado--\n");
        for (int i = 0; i < contAlunos; i++) {
            System.out.printf(alunos[i] + " sua média foi %.2f", notas[i][nNotas]);
            if (notas[i][nNotas] >= 7) {
                System.out.println(" e você aprovou!");
            } else {
                System.out.println("e infelizmente você reprovou!");
            }

        }

    }

}
