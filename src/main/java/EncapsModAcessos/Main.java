package EncapsModAcessos;

public class Main {

    public static void main(String[] args) {

        ContaBancaria c = new ContaBancaria();

        c.setTitular("Ana");

        c.depositar(500);
        System.out.println("Saldo: " + c.getSaldo());

        c.depositar(-100);

        c.sacar(2000);

        c.sacar(200);
        System.out.println("Saldo: " + c.getSaldo());

       c.getNumeroConta();
       System.out.println("Número da conta: " + c.getNumeroConta());

        Produtos p = new Produtos();

        //System.out.println(p.codigoInterno);
        System.out.println(p.nome);
        System.out.println(p.preco);


    }
}
