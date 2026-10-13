/*
1 — Crie um array com os nomes de 5 pessoas. Mostre o primeiro, o terceiro e o último.
 */
package AtividadeArrays;

public class ExercicioUm {
    public static void main(String[] args) {

        String[] nomes = {"Ana", "Pedro", "Marina", "Claudia", "Fabio"};

        System.out.println("O primeiro nome é " + nomes[0]);
        System.out.println("O terceiro nome é "+ nomes[2]);
        System.out.println("O último nome é " + nomes [nomes.length - 1]);
    }
}
