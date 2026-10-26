package AtividadeSingleton.Carrinho;

public class Main {
    public static void main(String[] args) {

        Carrinho telaProdutos = Carrinho.getInstance();

        Carrinho telaPromocoes = Carrinho.getInstance();

        telaProdutos.adicionarItem();
        telaProdutos.adicionarItem();

        telaPromocoes.adicionarItem();
        telaPromocoes.adicionarItem();

        System.out.println(
                "Itens no carrinho: " + telaProdutos.getQuantidadeItens()
        );

    }
}
