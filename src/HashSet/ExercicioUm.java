/*
1. Crie um HashSet de nomes e adicione quatro valores, sendo um deles
   repetido. Imprima o conjunto e o tamanho. Repare no que aconteceu
   com o repetido.
 */
package HashSet;

import java.util.HashSet;

public class ExercicioUm {
    public static void main(String[] args) {

        HashSet<String> nomes = new HashSet<>();

        nomes.add("Ana");
        nomes.add("Sara");
        nomes.add("Ana");
        nomes.add("Carlos");

        System.out.println("Os nomes são: " + nomes);
        System.out.println( "A quantidade é " + nomes.size());


    }
}
