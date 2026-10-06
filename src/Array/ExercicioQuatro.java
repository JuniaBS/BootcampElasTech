/*
 Crie uma lista com quatro cidades. Remova a da posição 1 e imprima quantas sobraram.
 */

package Array;

import java.util.ArrayList;
import java.util.Arrays;

public class ExercicioQuatro {
    public static void main(String[] args) {

        ArrayList<String> cidade = new ArrayList<>(
                Arrays.asList("Brasília", "São Paulo", "Piracicaba", "Goiânia"));
        System.out.println(cidade);

        cidade.remove(0);

        System.out.println(cidade);

    }
}
