package Mesa18;

import Aula13_Consulta_Transacoes_BancosDeDados.ConnectionJDBC;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class MainTest {
    PacienteService pacienteService;
    EnderecoService enderecoService;

    private static void ShowDentista(Connection connection) throws Exception {
        String sqlQuery = "SELECT * FROM Dentista";
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sqlQuery);

        while (resultSet.next()) {
            System.out.println(resultSet.getInt(1) + " - " + resultSet.getString(2) + " - " + resultSet.getString(3));
        }

    }


    private static final String sqlCreate = "DROP TABLE IF EXISTS Dentista;" +
            "CREATE TABLE Dentista" +
            "(" +
            "matricula INT PRIMARY KEY," +
            "nome VARCHAR(100) NOT NULL," +
            "sobrenome VARCHAR(100) NOT NULL" +
            ");";

    private static final String sqlInsert = "INSERT INTO Dentista(matricula,nome,sobrenome) VALUES(?,?,?);";
    private static final String sqlUpdate = "UPDATE Dentista SET matricula = ? WHERE nome = ?;";


    @BeforeEach
    void doBefore() {
        enderecoService = new EnderecoService(new EnderecoDaoH2(new ConfiguracaoJDBC()));
        pacienteService = new PacienteService(new PacienteDaoH2(new ConfiguracaoJDBC()));
    }

    @Test
    public void mesaTeste() {
        Endereco endereco = new Endereco("cristovao lins", "115", "sao paulo", "vila isolina mazzei");
        enderecoService.salvar(endereco);
        assertTrue(endereco.getEnderecoId() != null);

        System.out.println("ID do endereco: " + endereco.getEnderecoId());

        enderecoService.buscar(1);


        Paciente paciente = new Paciente("issao", "takeuchi", "123456", "16/08/2022", endereco.getEnderecoId());
        pacienteService.salvar(paciente);
        assertTrue(paciente.getPacienteId() != null);

        System.out.println("ID do paciente: " + paciente.getPacienteId());

        pacienteService.buscar(1);
        pacienteService.excluir(1);
        pacienteService.buscar(1);
    }

    void main() throws Exception {
        Dentista dentista = new Dentista("Jonathas", "Lion", 152648);

        Connection connection = null;

        try {
            connection = ConnectionJDBC.getConnection();
            Statement statement = connection.createStatement();

            statement.execute(sqlCreate);

            ShowDentista(connection);

            PreparedStatement preparedStatementInsert = connection.prepareStatement(sqlInsert);
            preparedStatementInsert.setInt(1, dentista.getMatricula());
            preparedStatementInsert.setString(2, dentista.getNome());
            preparedStatementInsert.setString(3, dentista.getSobrenome());
            preparedStatementInsert.execute();


            dentista.setMatricula(156794);

            PreparedStatement preparedStatementUpdate = connection.prepareStatement(sqlUpdate);
            preparedStatementUpdate.setInt(1, dentista.getMatricula());
            preparedStatementUpdate.setString(2, dentista.getNome());
            preparedStatementUpdate.execute();

            ShowDentista(connection);

            connection.commit();
            connection.setAutoCommit(true);


        } catch (Exception e) {
            e.printStackTrace();
            connection.rollback();
        } finally {
            connection.close();
        }
    }
}
