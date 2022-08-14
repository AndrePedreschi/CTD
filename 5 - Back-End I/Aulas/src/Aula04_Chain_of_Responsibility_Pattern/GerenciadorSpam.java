package Aula04_Chain_of_Responsibility_Pattern;

public class GerenciadorSpam extends Gerenciador{


    @Override
    public void verificar(Mail email) {
        System.out.println("Marcado como spam");
    }
}
