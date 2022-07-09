package Trem;

public class Retangulo extends Formas{
    private final double altura;
    private final double largura;

    public Retangulo(double altura, double largura) {
        this.altura = altura;
        this.largura = largura;
    }

    @Override
    public double calculaArea() {
        return altura * largura;
    }
}
