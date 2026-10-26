/*
3 — Com o mesmo array de notas, calcule e mostre a soma e a média.
 */
package AtividadeArrays;

public class ExercicioTres {
    public static void main(String[] args) {

        int[] notas = {8, 6, 10, 7, 9};

        int soma = 0;

        for(int i = 0; i < notas.length; i++) {
            soma += notas[i];
        }

        double media = (double) soma / notas.length;

        System.out.println("A soma de notas é " + soma );
        System.out.println("A média das notas é " + media);

    }
}