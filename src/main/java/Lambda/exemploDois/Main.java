package Lambda.exemploDois;

public class Main {
    public static void main(String[] args) {

        Impressora maiuscula = texto ->
                System.out.println(texto.toUpperCase());

        Impressora minuscula = texto ->
                System.out.println(texto.toLowerCase());

        maiuscula.imprimir("Olá!");
        minuscula.imprimir("Olá!");
    }
}
