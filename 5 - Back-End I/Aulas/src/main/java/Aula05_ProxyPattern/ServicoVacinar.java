package Aula05_ProxyPattern;

import java.util.Date;

public class ServicoVacinar implements Vacinar{


    @Override
    public void vacinarPessoa(String rg, Date datavacina, String tipoVacina) {
        System.out.println("Usuário(a) "+rg+" vacinado(a) em "+datavacina+" com sucesso");
    }
}
