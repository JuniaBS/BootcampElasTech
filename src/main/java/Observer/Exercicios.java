package Observer;

public class Exercicios {
}

/*
1 - Qual problema o padrão Observer resolve? Dê um exemplo do dia a dia que funcione como ele.
Ele avisa automaticamente vários objetos quando ocorre uma mudança em outro objeto.
Um exemplo é um aplicativo de delivery que notifica o cliente quando o status do pedido muda.

2 - No Observer, o que é o Subject e o que é o Observer? Como o Subject avisa os observadores
sem conhecer as classes concretas deles?
O Subject é o objeto observado, responsável por manter e notificar os observadores.
O Observer é quem deseja receber as atualizações. O Subject utiliza uma interface
comum implementada pelos observadores, permitindo notificá-los sem conhecer, suas classes concretas.

3 - Se você precisar adicionar um novo interessado, por exemplo, um Entregador que também precisa saber
quando o pedido muda de status, o que é preciso alterar na classe Pedido? Por quê?
Não é necessário alterar a lógica da classe Pedido. Basta criar a classe Entregador implementando a
interface de observador e cadastrá-la no Pedido. Isso é possível porque o Pedido trabalha com uma
interface comum, reduzindo o acoplamento e facilitando a inclusão de novos observadores.
 */
