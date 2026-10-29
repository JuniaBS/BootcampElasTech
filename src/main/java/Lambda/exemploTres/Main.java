/*
//Interface Calculo com int calcular(int a, int b).
//Crie três lambdas: soma, multiplicação e a que retorna o maior dos dois.
Chame as três e imprima os resultados.
 */

package Lambda.exemploTres;

public class Main {
    public static void main(String[] args) {

        Calculo soma = (a, b) -> a + b;

        Calculo multiplicacao = (a, b) -> a * b;

        Calculo maior = (a, b) -> Math.max(a,b);

        System.out.println("Soma: " + soma.calcular(10,5));

        System.out.println("Multiplicação: " + multiplicacao. calcular(10,5));

        System.out.println("Maior: " + maior.calcular(10, 5));

    }
}











