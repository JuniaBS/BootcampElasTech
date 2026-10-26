/*
Crie uma interface BancoDeDados que implementa chamarBanco() e getNumero().
Depois classes chamadas Oracle e MySql e Main. MySql e Oracle devem implementar
a interface e ter um atributo int numero. chamarBanco() deve retornar uma mensagem
de acordo com o banco conectado, e getNumero deve retornar o numero.

Exemplo:

O Banco conectado é o MySql.

Na sua Main crie um método conectarBanco() para receber um dos bancos e dentro dele
                       chamar o método chamarBanco() .
 */

package Interfaces;

import java.util.Scanner;

public class Main {
    /*public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual o banco deseja utilizar? Digite: \n 1 - MySql \n 2- MongoDb");
        int opcao = sc.nextInt();

        BancoDeDados banco = BancoDeDadosFactory.criar(opcao);

        banco.proibidoBarulhoAposDezHoras();

    }*/


}

    /*public static void conectarBanco(BancoDeDados banco) {
        System.out.println(banco.chamarBanco());
        System.out.println("Número: " + banco.getNumero());
    }

    public static void main(String[] args) {

        MySql mysql = new MySql(10);
        Oracle oracle = new Oracle(20);

        conectarBanco(mysql);
        conectarBanco(oracle);
    }*/

