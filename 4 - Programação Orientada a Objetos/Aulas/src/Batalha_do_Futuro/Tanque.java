package Batalha_do_Futuro;

public class Tanque extends SistemaArmas implements Atacar, Defender{
    @Override
    public void atacar() {
        System.out.println("PEEEEEEEWWWWWW");
    }

    @Override
    public void defender() {
        System.out.println("Nem doeu!");
    }
}
