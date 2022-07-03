package Armazem;

public abstract class Produto {
    private double peso;

    public Produto(double peso) {
        this.peso = peso;
    }

    public abstract double calcularEspaco();


}
