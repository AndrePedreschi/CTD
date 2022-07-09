package Trem;

import java.util.ArrayList;
import java.util.List;

public class Trem {
    private Double areaTrem=0.0;
    private final List<Formas> tremComposicao;

    public Trem() {
        this.tremComposicao = new ArrayList<>();
    }
    public void addItens(Formas trem){
        tremComposicao.add(trem);
    }

    public void calcularArea(){
        for(Formas composicao: tremComposicao){
            this.areaTrem += composicao.calculaArea();
        }
        areaTrem= areaTrem/2;
        System.out.println("A área total do trem é: "+areaTrem);
    }



}
