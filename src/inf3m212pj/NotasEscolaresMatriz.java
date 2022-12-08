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
public class NotasEscolaresMatriz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.println("Notas escolares Mtriz");
        System.out.println("Quantos alunos?");
        int nAlunos = (int) leiafloat();
        System.out.println("Quantas notas?");
        int nNotas = (int) leiafloat();

        String alunos[] = new String[nAlunos];
        float notas[][] = new float[nAlunos][nNotas + 1];

        for (int i = 0; i < nAlunos; i++) {
            System.out.println("Nome do aluno:");
            alunos[i] = leia.next();
            for (int j = 0; j < nNotas; j++) {
                do {
                    System.out.println("\tDigite a" + (j + 1) + "ªnota: ");
                    notas[i][j] = leiafloat();
                    if (validaNota(notas[i][j])) {
                        System.out.println("Nota inválida, tente novamente!");
                    }
                } while (validaNota(notas[i][j]));
                notas[i][nNotas] += notas[i][j];
            }
            notas[i][nNotas] = notas[i][nNotas] / nNotas;
        }
        System.out.println("\n--Resultado--\n");
        for(int i = 0; i < nAlunos;i++){
            System.out.printf(alunos[i]+"sua média foi de %.2f", notas[i][nNotas]);
            if(notas[i][nNotas] >= 7){
                System.out.println("e você aprovou!");
            }else{
                System.out.println("e infelizmente você reprovou!");
            }
            
            
        }
        
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

}
