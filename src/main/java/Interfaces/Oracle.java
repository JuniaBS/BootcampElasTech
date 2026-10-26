package Interfaces;

public class Oracle implements BancoDeDados {

    private int numero;

    public Oracle(int numero) {
        this.numero = numero;
    }

    @Override
    public String chamarBanco() {
        return "O Banco conectado é o Oracle.";
    }

    @Override
    public int getNumero() {
        return numero;
    }

}
