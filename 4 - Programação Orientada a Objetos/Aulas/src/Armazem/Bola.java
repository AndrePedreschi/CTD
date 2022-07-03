package Armazem;

import java.lang.Math;

public class Bola extends Produto{
    private double raio;
    private double volume=0;


    public Bola(double peso, double raio) {
        super(peso);
        this.raio = raio;
    }

    @Override
    public double calcularEspaco() {
        volume = (4*Math.PI*raio*raio*raio)/3;
        return volume;
    }
}
