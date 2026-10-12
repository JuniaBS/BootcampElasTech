/*
- Crie uma lista vazia de nomes. Adicione três nomes e imprima a lista inteira.
 */

package ArrayList;

import java.util.ArrayList;

public class ExercicioUm {
    public static void main(String[] args) {

        ArrayList<String> lista = new ArrayList<>();

        lista.add("Monica");
        lista.add("Rafaela");
        lista.add("Ana");

        System.out.println(lista);

    }
}
