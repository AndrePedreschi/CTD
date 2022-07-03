package Armazem;

public class Caixa extends Produto{
    private double comprimento =10;
    private double altura =10;
    private double largura =10;
    private double volume= 1000;

    public Caixa(double peso){
        super(peso);
    }

    @Override
    public double calcularEspaco() {
        return volume;
    }
}
