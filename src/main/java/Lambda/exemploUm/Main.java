package Lambda.exemploUm;

public class Main {
    public static void main(String[] args) {

        Saudacao saudacao = () ->
                System.out.println("Oi");

        saudacao.executar();
    }
}
