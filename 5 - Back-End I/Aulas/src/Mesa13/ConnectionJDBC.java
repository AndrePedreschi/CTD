package Mesa13;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionJDBC {
    public static Connection getConnection() throws Exception{
        Class.forName("org.h2.Driver").getConstructor().newInstance();

        return DriverManager.getConnection("jdbc:h2:~/test","sa","");
    }
}
