/*
2 — Crie um array com 5 notas. Peça uma posição para a pessoa e mostre a nota daquela posição.
Se a posição não existir, trate a ArrayIndexOutOfBoundsException e avise que o array só vai de 0 a 4.
 */

package TratamentoExcecoes;

import java.util.Scanner;

public class ExercicioDois {
    public static void main(String[] args) {

        double[] notas = {7.5, 8.0, 6.5, 9.0, 10.0};

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a posição da nota (0 a 4): ");
        int posicao = sc.nextInt();

        try {
            System.out.println("Nota escolhida: " + notas[posicao]);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Posição inválida! O array só vai de 0 a 4.");
        }

        sc.close();

    }
}
