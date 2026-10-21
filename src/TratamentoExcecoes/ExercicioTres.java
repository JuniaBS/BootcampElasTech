/*
3 — Peça a idade da pessoa com scanner.nextInt().
Se ela digitar um texto em vez de um número, trate a InputMismatchException e
mostre uma mensagem pedindo um número.
 */

package TratamentoExcecoes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExercicioTres {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite sua idade: ");

        try {
            int idade = sc.nextInt();

            System.out.println("A sua idade é " + idade + " anos.");

        } catch (InputMismatchException e ) {
            System.out.println("Idade inválida, digite números");
        }

        sc.close();
    }
}
