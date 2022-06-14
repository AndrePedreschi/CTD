package Batalha_do_Futuro;

public class RoboLeve extends SistemaArmas implements Atacar, Defender, Voar{
    @Override
    public void atacar() {
        System.out.println("Pew Pew");
    }

    @Override
    public void defender() {
        System.out.println("Aí, aí, aí");
    }

    @Override
    public void voar() {
        System.out.println("Estou voando!!!");
    }
}
