package Trem;

public class Circulo extends Formas{
    private final double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public double calculaArea() {
        return raio * raio * 3.14;
    }
}
