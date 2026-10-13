/*
4 — Peça 5 números para a pessoa, guarde num array, e depois mostre todos de trás pra frente.
 */

package AtividadeArrays;

import java.util.Scanner;

public class ExercicioQuatro {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[5];

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Digite um número inteiro:");
            numeros[i] = sc.nextInt();
        }

        System.out.println("Números na ordem inversa:");

        for (int i = numeros.length - 1; i >= 0; i--) {
            System.out.println(numeros[i]);
        }

        sc.close();

    }
}
