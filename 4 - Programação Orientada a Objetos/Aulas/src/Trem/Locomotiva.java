package Trem;

import java.util.ArrayList;
import java.util.List;

public class Locomotiva extends Formas{
    private Double areaTotal=0.0;

    private final List<Formas> locomotivaFormas;

    public Locomotiva() {
        this.locomotivaFormas = new ArrayList<>();

        addFormas();
        calculaArea();
    }

    public void addFormas(){
        locomotivaFormas.add(triangulo);
        locomotivaFormas.add(retangulo);
        locomotivaFormas.add(circulo1);
        locomotivaFormas.add(circulo2);
    }


    public Double getAreaTotal() {
        return areaTotal;
    }

    @Override
    public double calculaArea() {
        for(Formas locomotivaFormas: locomotivaFormas){
            areaTotal += locomotivaFormas.calculaArea();
        }
        return areaTotal;
    }


    Triangulo triangulo = new Triangulo(2,2);
    Retangulo retangulo =new Retangulo(6, 4);
    Circulo circulo1 = new Circulo(1);
    Circulo circulo2 = new Circulo(1);


}
