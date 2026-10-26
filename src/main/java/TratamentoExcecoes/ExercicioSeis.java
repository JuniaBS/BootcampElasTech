/*
6 — Crie um array com 3 nomes. Mostre o nome da posição 5 de propósito e trate a
ArrayIndexOutOfBoundsException com a mensagem "Essa posição não existe." Depois do try/catch,
 imprima "O programa continua funcionando."
 */

package TratamentoExcecoes;

import java.util.Scanner;

public class ExercicioSeis {
    public static void main(String[] args) {

        String[] nomes = {"Ana", "Claudio","Alice"};

        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("A posição é: " + nomes[5]);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Essa posição não existe.");
        }

        System.out.println("O programa continua funcionando.");

        sc.close();

    }
}
