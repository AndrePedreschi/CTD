package TourMapa;

public class Caminhando implements StrategyTempo{


    @Override
    public double calcularTempo(Distancia distancia) {
        return (distancia.getDistancia()/0.20366)*13;
    }
}
