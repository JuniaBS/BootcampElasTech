package Observer.ExQuatroECinco;

public class Passageiro implements ObservadorVoo{

    @Override
    public void atualizar(String status){
        System.out.println("Passageiro avisado: " + status);
    }
}
