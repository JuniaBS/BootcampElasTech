/*
7. Crie uma classe Singleton chamada Carrinho que:
-tenha um atributo quantidadeItens, começando em 0;
-tenha um método adicionarItem() que soma 1 à quantidade;
-tenha um método getQuantidadeItens() que devolve a quantidade.
No main, obtenha o carrinho em duas variáveis diferentes, telaProdutos e telaPromocoes,
adicione itens usando as duas, e imprima a quantidade final. O resultado deve mostrar
que as duas telas usam o mesmo carrinho.
Exemplo de saída esperada:
Itens no carrinho: 4
 */

package AtividadeSingleton.Carrinho;

public class Carrinho {

    private static Carrinho instancia;

    private int quantidadeItens = 0;

    private Carrinho(){
    }

    public static Carrinho getInstance() {

        if (instancia == null) {
            instancia = new Carrinho();
        }

        return instancia;
    }

    public void adicionarItem() {
        quantidadeItens++;
    }

    public int getQuantidadeItens() {
        return quantidadeItens;
    }

}
