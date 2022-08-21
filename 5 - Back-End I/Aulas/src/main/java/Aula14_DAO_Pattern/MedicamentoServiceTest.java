package Aula14_DAO_Pattern;

//import org.junit.FixMethodOrder;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

//@FixMethodOrder(MethodSorters.NAME_ASCENDING);
public class MedicamentoServiceTest {

    MedicamentoService medicamentoService;

    @BeforeEach
    void doBefore(){
        medicamentoService = new MedicamentoService(new MedicamentoDAOH2(new ConfiguracaoJDBC()));
    }
    @Test
    public void guardarMedicamento(){
        Medicamento medicamento = new  Medicamento("Ibuprofeno","Aché",395,23.0);
        medicamentoService.salvar(medicamento);
        assertTrue(medicamento.getId()!=null);

        Medicamento medicamento1 = new Medicamento("Dorflex","SanofiLascou", 555, 20.12);
        medicamentoService.salvar(medicamento1);
        assertTrue(medicamento1.getId()!=null);
    }

}
