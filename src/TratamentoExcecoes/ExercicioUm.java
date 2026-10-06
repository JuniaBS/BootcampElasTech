package TratamentoExcecoes;/*
1 — Faça um programa que peça dois números inteiros e mostre a divisão do primeiro pelo segundo.
Se a pessoa digitar 0 no segundo, trate a ArithmeticException e mostre uma mensagem explicando
que não dá pra dividir por zero.
 */

import java.util.Scanner;

public class ExercicioUm {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o um número inteiro: ");
        int num1 = sc.nextInt();

        sc.nextLine();

        System.out.println("Digite outro número inteiro: ");
        int num2 = sc.nextInt();

        try {
            int resultado = num1 / num2;
            System.out.println("Resultado da divisão: " + resultado);

        } catch (ArithmeticException e) {
            System.out.println("Não é possível dividir por zero!");
        }

        sc.close();

    }
}
