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
public class NotasEscolaresVetor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leia = new Scanner(System.in);

        System.out.println("Notas Escolares");
        System.out.println("Quant. notas a inserir? ");
        int nNotas = (int) leiafloat();

        float notas[] = new float[nNotas + 1]; //vetor d 5 posições

        for (int i = 0; i < nNotas; i++) {
            do {
                System.out.print("Informe a" + (i + 1) + "ª nota: ");
                notas[i] = leiafloat();
                if (validaNota(notas[i])) {
                    System.out.println("nota invalida, tente novamente!");
                }
            } while (validaNota(notas[i]));
            notas[nNotas] += notas[i];

        }
        notas[nNotas] = notas[nNotas] / nNotas;
        System.out.printf("Sua media foi de %.2f ",notas[nNotas]);
        if (notas[nNotas] >= 7) {
            System.out.println(",parabéns você aprovou.");
        } else {
            System.out.println(",Infelizmente você não aprovou.");
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

    }

}
