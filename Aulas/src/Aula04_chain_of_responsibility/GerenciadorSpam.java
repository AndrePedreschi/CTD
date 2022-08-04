package Aula04_chain_of_responsibility;

public class GerenciadorSpam extends Gerenciador{


    @Override
    public void verificar(Mail email) {
        System.out.println("Marcado como spam");
    }
}
