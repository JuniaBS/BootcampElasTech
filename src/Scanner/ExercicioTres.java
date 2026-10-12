/*
3 - Peça a nota de uma aluna e mostre se ela foi aprovada (7 ou mais),
ficou de recuperação (entre 5 e 6.9) ou foi reprovada.
 */
package Scanner;

import java.util.Scanner;

public class ExercicioTres {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a nota da aluna (0 a 10): ");
        double nota = sc.nextDouble();

        while (nota < 0 || nota > 10) {
            System.out.println("Nota inválida! Digite uma nota entre 0 e 10:");
            nota = sc.nextDouble();
        }

        if (nota >= 7) {
            System.out.println("Parabéns, aluna aprovada!");

        } else if (nota >= 5 || nota <= 6.9) {
            System.out.println("A aluna está de recuperação");

        } else {
            System.out.println("A aluna foi reprovada!");
        }

        System.out.println();

        sc.close();
    }
}
