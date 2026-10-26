/*

Crie um atributo private static do tipo da própria classe. É onde o objeto único fica guardado.
Começa como null.
Deixe o construtor private. Assim ninguém consegue usar new fora da classe.
Crie um metodo public static de acesso, geralmente chamado getInstancia().
Dentro dele, crie o objeto só se ainda não existir (if (instancia == null)).
Retorne sempre o mesmo objeto.
Acesse sempre pelo nome da classe: Classe.getInstancia(), nunca com new.
 */

package TesteSingleton;

public class ConexaoBanco {
    private static ConexaoBanco instancia; //Crie um atributo private static do tipo da própria classe

    private ConexaoBanco() { // Deixe o construtor private

    }

    public static ConexaoBanco getInstance(){
        if(instancia == null) {
            instancia = new ConexaoBanco();
        }
        return instancia;
    }
}
