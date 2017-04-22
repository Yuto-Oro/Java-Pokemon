package Principal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conectar 
{
    static final String driver = "com.mysql.jdbc.Driver";
    static final String url = "//localhost/users";
    
    static final String user = "root";
    static final String pass = "";
    public static Connection getConnection()throws SQLException
    {
        return DriverManager.getConnection(url, user, pass);
    }
}
