
package Metodos;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Exercício 1 - Boas-vindas
        mostrarBoasVindas();

        // Exercício 2 - Saudações
        Utilidades.saudar("Ana");
        Utilidades.saudar("Camila");
        Utilidades.saudar("Antonia");

        // Exercício 3 - Dobro
        int resultado = Utilidades.dobro(5);
        System.out.println("O dobro do número é: " + resultado);

        // Exercício 4 - Média
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a primeira nota:");
        double n1 = sc.nextDouble();

        System.out.println("Digite a segunda nota:");
        double n2 = sc.nextDouble();

        double media = Utilidades.calcularMedia(n1, n2);
        System.out.printf("A média é: %.2f%n", media);

        // Exercício 5 - Maioridade
        System.out.println("Digite sua idade:");
        int idade = sc.nextInt();

        boolean maior = Utilidades.ehMaiorDeIdade(idade);

        if (maior) {
            System.out.println("Você é maior de idade.");
        } else {
            System.out.println("Você é menor de idade.");
        }

        // Exercício 6 - Sobrecarga do método somar
        System.out.println("Soma de dois inteiros: " + Utilidades.somar(5, 3));
        System.out.println("Soma de três inteiros: " + Utilidades.somar(5, 3, 2));
        System.out.println("Soma de dois decimais: " + Utilidades.somar(2.5, 3.7));

        // Exercício 7 - Sobrecarga do método saudacao
        Utilidades.saudacao();
        Utilidades.saudacao("Júnia");

        // Fechar o Scanner no final
        sc.close();
    }

    // Exercício 1 - Método de boas-vindas
    public static void mostrarBoasVindas() {
        System.out.println("Bem-vinda ao curso de Java!");
    }
}
