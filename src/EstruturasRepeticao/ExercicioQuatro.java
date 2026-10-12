/*
4 - Crie uma variável com um número e mostre a tabuada dele de 1 a 10.
 */
package EstruturasRepeticao;

public class ExercicioQuatro {

    public static void main(String[] args) {
        int numero = 5;

        System.out.println("==== TABUADA ====");

        for (int i = 1; i <= 10; i++){
            System.out.println(numero + " x " + i + " = " + (numero * i));

        }
    }
}
