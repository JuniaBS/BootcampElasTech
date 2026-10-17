package AtividadeSingleton.ContadorVisitas;

public class Main {
    public static void main(String[] args) {

        ContadorVisitas pagina1 =
                ContadorVisitas.getInstance();

        ContadorVisitas pagina2 =
                ContadorVisitas.getInstance();

        pagina1.registrarVisita();
        pagina1.registrarVisita();
        pagina2.registrarVisita();

        System.out.println(
                "O total de visitas é: " + pagina1.getTotal()
        );

    }
}
