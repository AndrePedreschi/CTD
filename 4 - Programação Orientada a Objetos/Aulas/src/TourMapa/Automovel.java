package TourMapa;

public class Automovel implements StrategyTempo{


    @Override
    public double calcularTempo(Distancia distancia) {
        return (distancia.getDistancia() / 0.40366)*4;
    }
}
