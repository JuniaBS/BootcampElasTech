/*
2 - Peça dois números inteiros e mostre a soma, a subtração, a multiplicação, a divisão e o resto.
 */
package Scanner;

import java.util.Scanner;

public class ExercicioDois {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int numeroUm = sc.nextInt();

        sc.nextLine();

        System.out.println("Digite o segundo número: ");
        int numeroDois = sc.nextInt();

        System.out.println("A soma dos dois números é: " + (numeroUm + numeroDois));
        System.out.println("A subtração dos dois números é: " + (numeroUm - numeroDois));
        System.out.println("A multiplicação dos dois números é: " + (numeroUm * numeroDois));
        System.out.println("A divisão dos dois números é: " + (numeroUm / numeroDois));
        System.out.println("O resto da divisão dos dois números é: " + (numeroUm % numeroDois));

        sc.close();
    }
}
