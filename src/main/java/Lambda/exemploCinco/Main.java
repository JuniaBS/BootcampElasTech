package Lambda.exemploCinco;

public class Main {
    public static void mostrarResultado (Operacao op, int valor) {
        System.out.println(op.aplicar(valor));
    }

    public static void main(String[] args) {
        int numero = 5;

        //Dobro
        mostrarResultado(n-> n * 2, numero);

        //Quadrado
        mostrarResultado(n -> n * n, numero);

        //Negativo
        mostrarResultado(n -> -n, numero);


    }

}
