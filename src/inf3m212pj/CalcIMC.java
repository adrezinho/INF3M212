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
public class CalcIMC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double A, P, imc;
        Scanner leia = new Scanner(System.in);
        System.out.print("Informe seu Altura: ");
        A = leia.nextFloat();
        System.out.print("Informe seu peso: ");
        P = leia.nextFloat();
        imc = P / (A * A);
        
        System.out.printf("Seu imc é de : %.2f ",imc);

        if (imc < 18.5) {
            System.out.println("Classificação: magreza");
        } else if (imc < 24.9) {
            System.out.println("Classificação: normal");
        } else if (imc < 29.9) {
            System.out.println("Classificação: sobre peso");
        } else if (imc < 34.9) {
            System.out.println("Classificação: Obesidade 1");
        } else if (imc < 39.9) {
            System.out.println("Classificação: Obesidade 2");
        } else {
            System.out.println("Classificação: obesidade 3");
        }

        // TODO code application logic here
    }

}
