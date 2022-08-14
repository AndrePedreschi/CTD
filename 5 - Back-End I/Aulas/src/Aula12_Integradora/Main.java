package Aula12_Integradora;

import java.sql.*;

import static java.sql.DriverManager.getConnection;


import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

import java.sql.Statement;


public class Main {
    //Instrução para pegar a tabela Usuário, caso já exista, criar uma nova
    private static final String sqlCreateTable = "DROP TABLE IF EXISTS Usuario; CREATE TABLE Usuario"+
            "("
            +"id INT PRIMARY KEY,"
            +"Primeiro_Nome varchar(100) NOT NULL,"
            +"Sobrenome varchar(100) NOT NULL,"
            +"Idade INT NOT NULL"
            +")";

    //Instruções para inserir dados na tabela do usuário
    private static final String sqlInsert1 = "INSERT INTO Usuario(id, Primeiro_Nome, Sobrenome, Idade) VALUES (1,'Maria', 'Almeida', 50)";

    private static final String sqlInsert2 = "INSERT INTO Usuario(id, Primeiro_Nome, Sobrenome, Idade) VALUES (2,'José', 'Silva', 40)";

    private static final String sqlInsert3 = "INSERT INTO Usuario(id, Primeiro_Nome, Sobrenome, Idade) VALUES (3,'Juliana', 'Barbosa', 20)";

    //Instrução para excluir um registro da tabela Usuário

    private static final String sqlDelete = "DELETE FROM Usuario WHERE id =2";

    private static final Logger logger = Logger.getLogger(Main.class);

    //Main
    public static void main(String[] args) throws Exception{

        BasicConfigurator.configure();

        //Connection connection = null;

        Class.forName("org.h2.Driver").newInstance();

        Connection connection = DriverManager.getConnection("jdbc:h2:~/test","sa","");
        Statement statement = connection.createStatement();

        try{
            //connection=getConnectionInstance();
            //Statement statement = connection.createStatement();

            //Executa a instrução da criação da tabela no banco de dados
            statement.execute(sqlCreateTable);

            //Executa as instruções para inserir dados na tabela
            statement.execute(sqlInsert1);
            statement.execute(sqlInsert2);
            statement.execute(sqlInsert3);

            //Execução da instrução para excluir um registro da tabela
            statement.execute(sqlDelete);

            //Registra o log do usuários que foi excluído da tabela
            logger.info("Excluído o usuário com o id 2");
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            if(connection==null){
                return;
            }
            connection.close();

        }


    }
/*
    public static Connection getConnectionInstance() throws Exception{
        Class.forName("org.h2.Driver").newInstance();

        //return DriverManager.getConnection("jdbc:h2:tcp//localhost/~/test","sa","");

        return DriverManager.getConnection("jdbc:h2:~/test","sa","");
    }

 */


}

/*
catch(org.h2.jdbc.JdbcSQLIntegrityConstraintViolationException e)

Thalles Denner Ferreira Cabral
Daniel Costa Santiago Teixeira Martins
Marcos De Jesus
Luiz Henrique Espicalsky
André Pedreschi
Daniel
 */
