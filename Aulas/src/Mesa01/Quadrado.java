package Mesa01;

public class Quadrado implements Figura{
    private Double lado;

    public Quadrado(Double lado) {
        this.lado = lado;
    }

    @Override
    public Double calcularPerimetro() {
        return lado*4;
    }
}
