package DBConnect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

    public static Connection getConnection()
            throws SQLException, ClassNotFoundException {

        Class.forName("com.mysql.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/soc";
        String user = "soc";
        String password = "password";

        Connection connection = DriverManager.getConnection(url, user, password);
        System.out.println("Connected to the Mysql server successfully.");
        return connection;
    }
}
