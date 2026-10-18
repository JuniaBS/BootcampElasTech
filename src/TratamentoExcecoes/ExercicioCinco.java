/*
5 — Peça um número para a pessoa e mostre o resto da divisão de 100 por esse número.
Trate a ArithmeticException para o caso de ela digitar 0.
 */

package TratamentoExcecoes;

import java.util.Scanner;

public class ExercicioCinco {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");

        try {
            int numero = sc.nextInt();

            int resto = 100 % numero;

            System.out.println("O resto da divisão por de 100 é " + resto);

        } catch (ArithmeticException e ) {
            System.out.println("Número inválido, não digite 0");
        }

        sc.close();

    }
}
