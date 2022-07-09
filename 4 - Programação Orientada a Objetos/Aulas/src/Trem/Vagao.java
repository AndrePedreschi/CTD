package Trem;

import java.util.ArrayList;
import java.util.List;

public class Vagao extends Formas{
    private Double areaTotal=0.0;

    private final List<Formas> vagaoFormas;

    public Vagao() {
        this.vagaoFormas = new ArrayList<>();
        addFormas();
        calculaArea();
    }

    public void addFormas(){
        vagaoFormas.add(retangulo);
        vagaoFormas.add(circulo1);
        vagaoFormas.add(circulo2);
        vagaoFormas.add(circulo3);
    }

    public Double getAreaTotal() {
        return areaTotal;
    }

    @Override
    public double calculaArea() {
        for(Formas vagaoFormas: vagaoFormas){
            areaTotal += vagaoFormas.calculaArea();
        }

        return areaTotal;
    }

    Retangulo retangulo =new Retangulo(5, 4);
    Circulo circulo1 = new Circulo(1);
    Circulo circulo2 = new Circulo(1);
    Circulo circulo3 = new Circulo(1);

}
