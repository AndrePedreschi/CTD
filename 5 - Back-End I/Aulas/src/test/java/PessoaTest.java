import Aula05_ProxyPattern.Pessoa;
import Aula05_ProxyPattern.ServicoVacinarProxy;
import Aula05_ProxyPattern.Vacinar;
import org.junit.jupiter.api.Test;

import java.util.Date;

public class PessoaTest {

    Date data = new Date();

    @Test
    public void vacinar1(){
        Pessoa p1 = new Pessoa("Juca", "Silva", "3546978564", data, "Pfizer");
        Vacinar vacinar = new ServicoVacinarProxy();

        vacinar.vacinarPessoa(p1.getRg(), p1.getDataVacina(), p1.getNomeVacina());
        System.out.println(p1.toString());
    }
}
