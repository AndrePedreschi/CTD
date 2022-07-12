package TourMapa;

public class CalculaTempo {
    private StrategyTempo tempo;

    public CalculaTempo(StrategyTempo tempo) {
        this.tempo = tempo;
    }

    public double valorTempo(Distancia distancia){
        return tempo.calcularTempo(distancia);
    }
}
