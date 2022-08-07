package Aula05_ProxyPattern;

import java.util.Date;

public class ServicoVacinarProxy implements Vacinar{

    @Override
    public void vacinarPessoa(String rg, Date datavacina, String tipoVacina) {
         if (datavacina.before(new Date())){
             ServicoVacinar servicoVacinar = new ServicoVacinar();
             servicoVacinar.vacinarPessoa(rg,datavacina,tipoVacina);
             System.out.println("Cidadão(ã) vacinado(a) com sucesso.");
         }else{
             System.out.println("A data de hoje é anterior a data marcada");
         }

    }
}
