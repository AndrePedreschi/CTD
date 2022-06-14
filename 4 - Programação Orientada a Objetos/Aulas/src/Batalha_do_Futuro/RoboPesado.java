package Batalha_do_Futuro;

public class RoboPesado extends SistemaArmas implements Atacar,Defender,Voar{


    @Override
    public void atacar() {
        System.out.println("Pew pew pew!");
    }

    @Override
    public void defender() {
        System.out.println("Aí!");
    }

    @Override
    public void voar() {
        System.out.println("Voar voar, subir subir!");
    }
}
