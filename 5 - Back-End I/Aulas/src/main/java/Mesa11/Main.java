package Mesa11;

import java.sql.*;

public class Main {
    //Instrução para criar a tabela Figuras, caso já exista, dar um drop
    private static final String sqlCreateTable = "DROP TABLE IF EXISTS Figuras; CREATE TABLE Figuras"+
            "("
            +"id INT PRIMARY KEY NOT NULL,"
            +"Figura varchar(50),"
            +"Cor varchar(50)"
            +")";

    private static final String sqlInsert1 = "INSERT INTO Figuras(id, Figura, Cor) VALUES (1, 'Circulo', 'Vermelha')";
    private static final String sqlInsert2 = "INSERT INTO Figuras(id, Figura, Cor) VALUES (2, 'Circulo', 'Verde')";
    private static final String sqlInsert3 = "INSERT INTO Figuras(id, Figura, Cor) VALUES (3, 'Quadrado', 'Vermelha')";
    private static final String sqlInsert4 = "INSERT INTO Figuras(id, Figura, Cor) VALUES (4, 'Quadrado', 'Verde')";
    private static final String sqlInsert5 = "INSERT INTO Figuras(id, Figura, Cor) VALUES (5, 'Quadrado', 'Roxo')";

    public static void main(String[] args) throws SQLException {
        Connection connection = null;

        try{
            connection = getConnectionDB();
            Statement statement = connection.createStatement();

            statement.execute(sqlCreateTable);
            statement.execute(sqlInsert1);
            statement.execute(sqlInsert2);
            statement.execute(sqlInsert3);
            statement.execute(sqlInsert4);
            statement.execute(sqlInsert5);

            ShowFiguras(connection);
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            if (connection == null){
                return;
            }
            connection.close();
        }
    }

    private static void ShowFiguras(Connection connection) throws SQLException {
        String sqlQuery = "SELECT * FROM Figuras WHERE Figura = 'Circulo' AND Cor = 'Vermelha'";

        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sqlQuery);


        while (resultSet.next()){

            System.out.println(resultSet.getInt(1)+" - "+
                    resultSet.getString(2)+" | "+
                    resultSet.getString(3)
                    );
        }

    }

    private static Connection getConnectionDB() throws Exception {
        Class.forName("org.h2.Driver").getDeclaredConstructor().newInstance();
        return DriverManager.getConnection("jdbc:h2:~/usuario", "sa", "");
    }




}
