package Construtores;

public class Main {
    public static void main(String[] args) {

        Agendamento thor = new Agendamento(
                "Thor",
                "Banho",
                "14h",
                true,
                true,
                false,
                "alérgico a shampoo",
                10.0
        );

        Agendamento luna = new Agendamento(
                "Luna",
                "Tosa",
                "10h",
                false,
                false,
                false,
                "",
                0.0
        );

        Agendamento mel = new Agendamento(
                "Mel",
                "Banho",
                "16h",
                false,
                false,
                true,
                "",
                0.0
        );

        thor.mostrar();
        luna.mostrar();
        mel.mostrar();

        thor.setDesconto(20.0);

        System.out.println("Novo desconto do Thor: "
                + thor.getDesconto() + "%");
    }
}
