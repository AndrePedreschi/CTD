package Mesa13;

import Aula13_Consulta_Transacoes_BancosDeDados.ConnectionJDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;



public class Main {

    private static void ShowDentista(Connection connection) throws Exception {
        String sqlQuery = "SELECT * FROM Dentista";
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sqlQuery);

        while (resultSet.next()) {
            System.out.println(resultSet.getInt(1) + " - " + resultSet.getString(2) + " - " + resultSet.getString(3));
        }

    }


        private static final String sqlCreate = "DROP TABLE IF EXISTS Dentista;"+
            "CREATE TABLE Dentista"+
            "("+
            "matricula INT PRIMARY KEY,"+
            "nome VARCHAR(100) NOT NULL,"+
            "sobrenome VARCHAR(100) NOT NULL"+
            ");";

    private static final String sqlInsert = "INSERT INTO Dentista(matricula,nome,sobrenome) VALUES(?,?,?);";
    private static final String sqlUpdate = "UPDATE Dentista SET matricula = ? WHERE nome = ?;";

    public static void main(String[] args) throws Exception {
        Dentista dentista = new Dentista("Jonathas","Lion", 152648);

        Connection connection = null;

        try {
            connection = ConnectionJDBC.getConnection();
            Statement statement = connection.createStatement();

            statement.execute(sqlCreate);

            ShowDentista(connection);

            PreparedStatement preparedStatementInsert = connection.prepareStatement(sqlInsert);
            preparedStatementInsert.setInt(1,dentista.getMatricula());
            preparedStatementInsert.setString(2,dentista.getNome());
            preparedStatementInsert.setString(3,dentista.getSobrenome());
            preparedStatementInsert.execute();



            dentista.setMatricula(156794);

            PreparedStatement preparedStatementUpdate = connection.prepareStatement(sqlUpdate);
            preparedStatementUpdate.setInt(1,dentista.getMatricula());
            preparedStatementUpdate.setString(2,dentista.getNome());
            preparedStatementUpdate.execute();

            ShowDentista(connection);

            connection.commit();
            connection.setAutoCommit(true);



        }catch (Exception e){
            e.printStackTrace();
            connection.rollback();
        }finally {
            connection.close();
        }

    }


/*
André Pedreschi
Lucas Ferreira Nogueira
Michel Nunes
Issao Takeuchi
Jonathas Magalhães
 */

}
