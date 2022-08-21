package Mesa15;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Logger;

public class PacienteDaoH2 implements  IDao<Paciente>{
    private ConfiguracaoJDBC configuracaoJDBC;
    final static Logger log = Logger.getLogger(PacienteDaoH2.class.getName());

    public PacienteDaoH2(ConfiguracaoJDBC configuracaoJDBC){
        this.configuracaoJDBC = configuracaoJDBC;
    }


    @Override
    public Paciente salvar(Paciente paciente) {
        log.info("registrando um novo paciente: " + paciente.toString());
        Connection connection = configuracaoJDBC.conectarComBancoDeDados();
        Statement statement = null;
        String query = String.format(
                "INSERT INTO paciente(nome, sobrenome, rg, dataCadastro,enderecoId) VALUES('%s','%s','%s','%s','%s')",
                paciente.getNome(), paciente.getSobrenome(), paciente.getRg(), paciente.getDataCadastro(), paciente.getEnderecoId()
        );

        try {
            statement = connection.createStatement();
            statement.executeUpdate(query,Statement.RETURN_GENERATED_KEYS);
            ResultSet keys = statement.getGeneratedKeys();

            if (keys.next()){
                paciente.setPacienteId(keys.getInt(1));
                statement.close();
                connection.close();
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        return paciente;
    }

    @Override
    public Paciente buscar(Integer id) {
        log.info("buscando o paciente de id: " + id);
        Connection connection = configuracaoJDBC.conectarComBancoDeDados();
        Statement statement = null;
        String query = String.format(
                "SELECT * FROM paciente WHERE pacienteId = %s", id);

        Paciente paciente = null;

        try {
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);


            while (resultSet.next()){
                System.out.println(paciente = new Paciente(resultSet.getInt("pacienteId"), resultSet.getString("nome"), resultSet.getString("sobrenome"), resultSet.getString("rg"), resultSet.getString("dataCadastro"), resultSet.getInt("enderecoId")));
            }
            statement.close();
        }catch (SQLException throwables){
            throwables.printStackTrace();
        }
        return paciente;
    }

    @Override
    public Paciente excluir(Integer id) {
        log.info("excluindo o paciente de id: " + id);
        Connection connection = configuracaoJDBC.conectarComBancoDeDados();
        Statement statement = null;
        String query = String.format(
                "DELETE FROM paciente WHERE pacienteId = %s;", id);

        Paciente paciente = null;

        try {
            statement = connection.createStatement();
            int retorno = statement.executeUpdate(query);

            statement.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return paciente;
    }
}
