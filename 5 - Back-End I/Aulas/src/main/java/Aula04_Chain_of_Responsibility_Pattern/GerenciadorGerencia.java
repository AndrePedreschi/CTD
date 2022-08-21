package Aula04_Chain_of_Responsibility_Pattern;

public class GerenciadorGerencia extends Gerenciador{

    @Override
    public void verificar(Mail email) {
        if((email.getDestino().equalsIgnoreCase("gerencia@colmeia.com")) || (email.getAssunto().equalsIgnoreCase("Gerência"))){
            System.out.println("Enviando ao departamento gerencial");
        }else {
            if(this.getSeguinte()!=null){
                this. getSeguinte().verificar(email);
            }
        }
    }
}
