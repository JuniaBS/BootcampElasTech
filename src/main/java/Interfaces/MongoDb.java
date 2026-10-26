package Interfaces;

public class MongoDb implements BancoDeDados {

    private int numero;

    public MongoDb(int numero) {
        this.numero = numero;
    }

    @Override
    public String chamarBanco() {
        return "O Banco conectado é o .";
    }

    @Override
    public int getNumero() {
        return numero;
    }

}






