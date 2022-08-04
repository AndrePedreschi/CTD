package Aula04_chain_of_responsibility;

public class ProcessaMail {

    public static void main(String[] args) {
        CheckMail processo = new CheckMail();

        processo.verificar(new Mail("email@email.com","tecnica@digitalhouse.com","Reclamaçâo"));
        processo.verificar(new Mail("email@email.com","sds@digitalhouse.com", "Gerência"));
        processo.verificar(new Mail("email@email.com","juan@pepelegal.com", "Comercial"));
        processo.verificar(new Mail("email@email.com","tecnica@colmeia.com", "Reclamação"));
    }
}
