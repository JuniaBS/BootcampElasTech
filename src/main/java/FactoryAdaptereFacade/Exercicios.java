/*
Questão 1. Explique com suas palavras qual problema o Factory resolve.
O que aconteceria se os ifs que decidem qual objeto criar ficassem espalhados
pelo main e por outras partes do programa, e depois surgisse um tipo novo?

Resposta: Se os if ficassem espalhados pelo main e por outras classes, o código ficaria mais difícil de manter.
Quando surgisse um novo tipo de objeto, precisaríamos alterar vários lugares do programa.
Com a Factory, a lógica de criação fica concentrada em um só lugar, facilitando as mudanças.
 */

/*
Questão 2. O método da fábrica normalmente devolve o objeto criado com qual tipo?
• a) O tipo da classe concreta (ex.: Cachorro)
Resposta -> • b) O tipo da interface (ex.: Animal)
• c) String
• d) Não devolve nada (void)
 */

/*
Questão 4. Seu sistema precisa usar uma classe de pagamento de outra empresa, mas ela não implementa a sua interface.
Por que não dá para simplesmente escrever implements na classe dela? O que você faz no lugar?

Não podemos alterar a classe original então a solução é criar uma classe Adapter que implementa a nossa interface
e utiliza a classe externa por dentro, adaptando seus métodos para que funcionem com o nosso sistema.

Questão 5. Em um Adapter, onde fica a tradução (por exemplo, a conversão de dólar para real)?
• a) Na classe de fora
• b) Na interface
Resposta -> • c) No método implementado da interface, dentro do adapter
• d) No main, antes de chamar o método
*/

/*
Questão 7. Explique com suas palavras qual problema o Facade resolve. Se quiser, use o exemplo do
síndico do condomínio ou crie outro.

O padrão Facade serve para simplificar o uso de várias classes, oferecendo um único ponto de acesso para executar um processo.
Por exemplo, em um sistema de compra online, precisamos verificar o estoque do produto, processar o pagamento e
organizar a entrega. Em vez de chamar cada uma dessas classes separadamente, podemos criar uma fachada que coordene
todas essas etapas. Assim, o usuário do sistema só precisa chamar um método para realizar a compra, sem precisar
conhecer todos os detalhes internos.

Questão 8. Marque V (verdadeiro) ou F (falso):
• (F) A fachada precisa implementar uma interface.
• (V) A fachada guarda as classes envolvidas no processo em atributos.
• (F) Depois que a fachada existe, é proibido usar as outras classes diretamente.
 */


package FactoryAdaptereFacade;

public class Exercicios {
}
