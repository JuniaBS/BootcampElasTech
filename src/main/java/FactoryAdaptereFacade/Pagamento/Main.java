package FactoryAdaptereFacade.Pagamento;

public class Main {
    public static void main(String[] args) {

        // Esta linha não compila:
        // Pagamento pagamento = new PayPalAPI();

        // Criando o pagamento usando o Adapter
        Pagamento pagamento = new PayPalAdapter();

        // Executando o pagamento
        pagamento.pagar();
    }
}
