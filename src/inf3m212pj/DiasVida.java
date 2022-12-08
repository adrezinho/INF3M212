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
public class DiasVida {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int   idade, diasVida;
    String nome;
    Scanner leia = new Scanner(System.in);
    
        System.out.print("Informe se nome:");
        nome = leia.next();
        
        System.out.print("Inforeme idade: ");
        idade = leia.nextInt();
        
        diasVida = idade * 365;
        
        System.out.println(nome +" sua idade é " +idade);
        System.out.println("e ja viveu "+diasVida+ " dias de vida");
        
// TODO code application logic here
    }
    
}
