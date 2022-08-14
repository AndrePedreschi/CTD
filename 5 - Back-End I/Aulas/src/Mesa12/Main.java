package Mesa12;


import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

import java.sql.*;


public class Main {
    //Instrução para pegar a tabela Usuario, caso já exista, criar uma nova
    private static final String sqlCreateTable = "DROP TABLE IF EXISTS Usuario; CREATE TABLE Usuario"+
            "("
            +"id INT PRIMARY KEY NOT NULL,"
            +"Primeiro_Nome varchar(100),"
            +"Sobrenome varchar(100),"
            +"Idade INT,"
            +"Sexo varchar(24)"
            +")";

    //Instruções para inserir dados na tabela do usuário
    private static final String sqlInsert1 = "INSERT INTO Usuario(id, Primeiro_Nome, Sobrenome, Idade, Sexo) VALUES (1,'Maria', 'Almeida', 50, 'Masculino')";

    private static final String sqlInsert2 = "INSERT INTO Usuario(id, Primeiro_Nome, Sobrenome, Idade, Sexo) VALUES (2,'José', 'Silva', 40, 'Feminino')";

    private static final String sqlInsert3 = "INSERT INTO Usuario(id, Primeiro_Nome, Sobrenome, Idade, Sexo) VALUES (3,'Juliana', 'Barbosa', 20, 'Feminino')";

    private static final String sqlInsert4 = "INSERT INTO Usuario(id, Primeiro_Nome, Sobrenome, Idade, Sexo) VALUES (3,'Cleide', 'Queirós', 22, 'Feminino2')";

    private static final String sqlUpdate = "UPDATE Usuario SET id=4 WHERE Sobrenome = 'Queirós'";

    private static final String sqlDelete1 = "DELETE FROM Usuario WHERE id =3";
    private static final String sqlDelete2 = "DELETE FROM Usuario WHERE Idade = 50";

    private static final Logger logger = Logger.getLogger(Main.class);

    public static void main(String[] args) throws SQLException {
        Connection connection = null;
        BasicConfigurator.configure();

        try{
            connection = getConnectionInterface();
            Statement statement = connection.createStatement();

            //Executa a instrução da criação da tabela no banco de dados
            statement.execute(sqlCreateTable);

            //Executa as instruções para inserir dados na tabela
            statement.execute(sqlInsert1);
            statement.execute(sqlInsert2);
            statement.execute(sqlInsert3);
            //statement.execute(sqlInsert4);

            //Execução do update de linha
            statement.execute(sqlUpdate);
            logger.debug("Infos do usuário 4 atualizadas");

            //Execução da instrução para excluir um registro da tabela
            statement.execute(sqlDelete1);
            logger.info("Excluído o usuário com o id 3");
            statement.execute(sqlDelete2);
            logger.info("Excluído o usuário com a idade de 50 anos");

            ShowTable(connection);
        }

        catch (Exception e){

            e.printStackTrace();
        }finally {
            if (connection == null){
                return;
            }
            connection.close();
        }

    }

    private static void ShowTable(Connection connection) throws SQLException{
        String sqlQuery = "SELECT * FROM Usuario";
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sqlQuery);

        while(resultSet.next()){
            System.out.println(
                    resultSet.getInt(1)+" - "+
                            resultSet.getString(2)+" | "+
                            resultSet.getString(3)+" | "+
                            resultSet.getInt(4)+" | "+
                            resultSet.getString(5)
                    );


        }
    }
    private static Connection getConnectionInterface() throws Exception {
        Class.forName("org.h2.Driver").getDeclaredConstructor().newInstance();
        return DriverManager.getConnection("jdbc:h2:~/usuario", "sa", "");
    }







}
