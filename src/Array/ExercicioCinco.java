/*
Crie uma lista com seis nomes e imprima todos usando um laço, no formato `"0: Ana"`.
(Dica: i + ": " + comando para pegar posição da lista)
 */
package Array;

import java.util.ArrayList;

public class ExercicioCinco {
    public static void main(String[] args) {

        ArrayList<String> nomes = new ArrayList<>();

        nomes.add("Ana");
        nomes.add("Maria");
        nomes.add("Joana");
        nomes.add("Pedro");
        nomes.add("Fernanda");
        nomes.add("Carla");

        for (int i = 0; i < nomes.size(); i++) {
            System.out.println(i + ": " + nomes.get(i));
        }
    }
}
