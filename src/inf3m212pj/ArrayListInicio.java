/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inf3m212pj;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author 182020025
 */
public class ArrayListInicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leia = new Scanner(System.in);
        ArrayList<String> nomes = new ArrayList<>();

        System.out.println("Tamanho do array: " + nomes.size());
        System.out.println("ArrayList vasio?");
        System.out.println(nomes.isEmpty());
        nomes.add("Andre");
        System.out.println("Tamanho array: " + nomes.size());
        System.out.println("Digite um nome: ");
        nomes.add(leia.next());

        System.out.println("Tamanho array: " + nomes.size());

        System.out.println(nomes.toString());

        nomes.add(0, "Camila");
        System.out.println("Tamanho array" + nomes.size());
        System.out.println(nomes.toString());

        nomes.add(3, "Alice");
        System.out.println("Tamanho array" + nomes.size());
        System.out.println(nomes.toString());

        nomes.remove(1);
        System.out.println("Tamanho array" + nomes.size());
        System.out.println(nomes.toString());

        System.out.println("Impressão do Arry");
        for (String nome : nomes) {
            System.out.println("Nome: " + nome);

        }

        System.out.println("ArrayList vasio?");
        System.out.println(nomes.isEmpty());

        System.out.println("Index da Kiara é" + nomes.indexOf("Kiara"));

        System.out.println("Ordenação de Array");
        nomes.add("Andre");
        nomes.add("Jy");
        nomes.add("João");
        nomes.add("Juca");

        System.out.println(nomes.toString());
        Collections.sort(nomes);
        System.out.println("Ordenado" + nomes.toString());
        Collections.reverse(nomes);
        System.out.println("Ordenado" + nomes.toString());

        nomes.remove("Jy");
        Collections.sort(nomes);
        System.out.println("Nomes sem o Jy: " + nomes.toString());
    }

}
