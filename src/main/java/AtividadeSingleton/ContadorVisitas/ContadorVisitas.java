/*
6.  Crie uma classe Singleton chamada ContadorVisitas que:
-tenha um atributo total, começando em 0;
-tenha um método registrarVisita() que soma 1 ao total;
-tenha um método getTotal() que devolve o total.
Depois, no main, obtenha ele duas vezes em variáveis diferentes pagina1 e pagina2,
registre visitas usando as duas, e imprima o total. O resultado deve mostrar que as
duas variáveis usam o mesmo contador.
Exemplo de saída esperada:
Total de visitas: 3
Dica: Para instanciar(criar) não use o new. Classe v1 = Classe.getInstancia();
 */

package AtividadeSingleton.ContadorVisitas;

public class ContadorVisitas {

    private static ContadorVisitas instancia;

    private int total = 0;

    private ContadorVisitas() {
    }

    public static ContadorVisitas getInstance(){
        if(instancia == null) {
            instancia = new ContadorVisitas();
        }
        return instancia;
    }

    public void registrarVisita() {
        total++;
    }

    public int getTotal() {
        return total;
    }
}
