package Interfaces;

public class MySql implements BancoDeDados {

    private int numero;

    public MySql(int numero) {
        this.numero = numero;
    }

    @Override
    public String chamarBanco() {
        return "O Banco conectado é o MySql.";
    }

    @Override
    public int getNumero() {
        return numero;
    }

}
