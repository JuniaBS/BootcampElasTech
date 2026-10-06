/*
- Crie uma lista já preenchida com quatro frutas. Imprima a primeira, a última e quantas frutas tem.
 */

package Array;

import java.util.ArrayList;
import java.util.Arrays;

public class ExercicioDois {
    public static void main(String[] args) {

        ArrayList<String> frutas = new ArrayList<>(
                Arrays.asList("Melancia", "Banana", "Pera", "Uva")
        );

        System.out.println("Primeira fruta: " + frutas.get(0));
        System.out.println("Última fruta: " + frutas.get(frutas.size() - 1));
        System.out.println("Quantidade de frutas: " + frutas.size());

    }
}
