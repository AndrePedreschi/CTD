package TourMapa;

public class Bicicleta implements StrategyTempo{

    @Override
    public double calcularTempo(Distancia distancia) {
        return (distancia.getDistancia()/0.050366)*1.5;
    }
}
