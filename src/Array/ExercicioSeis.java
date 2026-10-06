/*
Crie uma lista com cinco nomes.
Peça um nome à pessoa e diga se ele está na lista e em qual posição. Se não estiver, avise.
 */

package Array;

import java.util.ArrayList;
import java.util.Scanner;

public class ExercicioSeis {
    public static void main(String[] args) {

        ArrayList<String> nomes = new ArrayList<>();

        nomes.add("Ana");
        nomes.add("Maria");
        nomes.add("Joana");
        nomes.add("Pedro");
        nomes.add("Fernanda");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um nome: ");
        String nome = scanner.nextLine();

        int posicao = nomes.indexOf(nome);

        if (posicao != -1) {
            System.out.println("Nome encontrado na posição: " + posicao);
        } else {
            System.out.println("Nome não encontrado.");
        }

        scanner.close();

    }
}
