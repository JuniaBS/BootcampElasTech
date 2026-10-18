
package Metodos;

public class Utilidades {

    // Exercício 2 - Saudar uma pessoa
    public static void saudar(String nome) {
        System.out.println("Olá, " + nome + "! Tudo bem?");
    }

    // Exercício 3 - Dobro de um número
    public static int dobro(int numero) {
        return numero * 2;
    }

    // Exercício 4 - Calcular média
    public static double calcularMedia(double n1, double n2) {
        return (n1 + n2) / 2;
    }

    // Exercício 5 - Verificar maioridade
    public static boolean ehMaiorDeIdade(int idade) {
        return idade >= 18;
    }

    // Exercício 6 - Somar dois inteiros
    public static int somar(int a, int b) {
        return a + b;
    }

    // Exercício 6 - Somar três inteiros
    public static int somar(int a, int b, int c) {
        return a + b + c;
    }

    // Exercício 6 - Somar dois decimais
    public static double somar(double a, double b) {
        return a + b;
    }

    // Exercício 7 - Saudação sem parâmetro
    public static void saudacao() {
        System.out.println("Olá!");
    }

    // Exercício 7 - Saudação com nome
    public static void saudacao(String nome) {
        System.out.println("Olá, " + nome + "!");
    }
}
