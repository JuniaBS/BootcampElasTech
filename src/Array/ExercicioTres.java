/*
Crie uma lista com quatro nomes. Troque o nome da posição 2 por outro e imprima a lista antes e depois.
 */
package Array;

import java.util.ArrayList;
import java.util.Arrays;

public class ExercicioTres {
    public static void main(String[] args) {

        ArrayList<String> nome = new ArrayList<>(
                Arrays.asList("Paula", "Maria", "Claudia", "Ana"));
        System.out.println(nome);

        nome.set(1, "Antonia");
        System.out.println(nome);

    }
}
