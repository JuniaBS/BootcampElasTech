package Polimorfismo;

public class Main {

    public static void main(String[] args) {

        Calculadora c = new Calculadora();

        System.out.println("A área do quadrado é: " + c.calcularArea(2.0));

        System.out.println("A área do retângulo é: " + c.calcularArea(2.0, 3.0));

        System.out.println("A área do círculo é: " + c.calcularArea(2));

    }
}
