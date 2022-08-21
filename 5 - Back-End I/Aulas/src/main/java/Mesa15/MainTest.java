package Mesa15;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class MainTest {
    PacienteService pacienteService;
    EnderecoService enderecoService;

    @BeforeEach
    void doBefore(){
        enderecoService = new EnderecoService(new EnderecoDaoH2(new ConfiguracaoJDBC()));
        pacienteService = new PacienteService(new PacienteDaoH2(new ConfiguracaoJDBC()));
    }

    @Test
    public void mesaTeste(){
        Endereco endereco = new Endereco("cristovao lins","115","sao paulo","vila isolina mazzei");
        enderecoService.salvar(endereco);
        assertTrue(endereco.getEnderecoId()!=null);

        System.out.println("ID do endereco: " + endereco.getEnderecoId());

        enderecoService.buscar(1);


        Paciente paciente = new Paciente("issao","takeuchi","123456", "16/08/2022",endereco.getEnderecoId());
        pacienteService.salvar(paciente);
        assertTrue(paciente.getPacienteId()!=null);

        System.out.println("ID do paciente: " + paciente.getPacienteId());

        pacienteService.buscar(1);
        pacienteService.excluir(1);
        pacienteService.buscar(1);
    }

}
