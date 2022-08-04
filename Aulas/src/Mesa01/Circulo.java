package Mesa01;

public class Circulo implements Figura{
    private Double raio;

    public Circulo(Double raio) {
        this.raio = raio;
    }


    @Override
    public Double calcularPerimetro() {
    return raio * 2 * Math.PI;
    }
}
