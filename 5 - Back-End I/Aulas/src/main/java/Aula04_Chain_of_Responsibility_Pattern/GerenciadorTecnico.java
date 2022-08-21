package Aula04_Chain_of_Responsibility_Pattern;

public class GerenciadorTecnico extends Gerenciador{
    @Override
    public void verificar(Mail email) {
        if((email.getDestino().equalsIgnoreCase("tecnica@colmeia.com")) || (email.getAssunto().equalsIgnoreCase("Técnico"))){
            System.out.println("Enviando ao departamento técnico");
        }else {
            if(this.getSeguinte()!=null){
                this. getSeguinte().verificar(email);
            }
        }
    }
}
