package Interfaces;

public class BancoDeDadosFactory {

    public static BancoDeDados criar(int opcao) {
        if (opcao == 1) {
            return new MySql(10);
        } else if (opcao == 2) {
            return new MongoDb(20);
        } else {
            throw new IllegalArgumentException("Opção inválida.");
        }
    }
}
