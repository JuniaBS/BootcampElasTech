/*
4 — Crie uma variável String nome = null; e tente imprimir nome.length().
Trate a NullPointerException e mostre "O nome não foi preenchido."
 */
package TratamentoExcecoes;

import java.util.InputMismatchException;

public class ExercicioQuatro {
    public static void main(String[] args) {

        try {

            String nome = null;

            System.out.println(nome.length());

        } catch (NullPointerException e ) {
            System.out.println("O nome não foi preenchido.");
        }

    }
}
