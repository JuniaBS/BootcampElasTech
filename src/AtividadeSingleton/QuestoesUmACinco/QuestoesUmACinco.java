package AtividadeSingleton.QuestoesUmACinco;

public class QuestoesUmACinco {
}

/*
1. O que o padrão Singleton garante?
a) Que a classe tenha vários construtores
Resposta -> b) Que exista apenas um objeto da classe no programa
c) Que a classe não tenha atributos
d) Que a classe possa ser herdada

2. Por que o construtor de um Singleton é private?
Para outras classes não criem ojetos diretamente
garantindo que a própria classe controle a criação de uma única instância.

3. Complete a lacuna:
java
private ______ Configuracao instancia;
a) final
b) public
Restposta -> c) static
d) void

4. O que acontece se alguém tentar escrever isto fora da classe?
java
Configuracao c = new Configuracao();
Resposta-> Vai dar erro de compilação, pois o construtor da classe é private.

5. Qual é a forma correta de obter o objeto de um Singleton chamado Configuracao?
a) new Configuracao()
Resposta -> b) Configuracao.getInstancia()
c) Configuracao.instancia
d) this.getInstancia()
 */
