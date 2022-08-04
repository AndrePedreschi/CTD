package Aula04_chain_of_responsibility;

public class GerenciadorComercial extends Gerenciador{


    @Override
    public void verificar(Mail email) {
        if((email.getDestino().equalsIgnoreCase("comercial@colmeia.com")) || (email.getAssunto().equalsIgnoreCase("Comercial"))){
            System.out.println("Enviando ao departamento comercial");
        }else {
            if(this.getSeguinte()!=null){
                this.getSeguinte().verificar(email);
            }
        }
    }
}
