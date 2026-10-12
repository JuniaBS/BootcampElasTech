/*
4 - Peça um número e mostre a tabuada dele de 1 a 10.
 */
package Scanner;

import java.util.Scanner;

public class ExercicioQuatro {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        int numero = sc.nextInt();

        System.out.println("==== TABUADA ====");

        for (int i = 1; i <= 10; i++){
            System.out.println(numero + " x " + i + " = " + (numero * i));

        }

    }
}
