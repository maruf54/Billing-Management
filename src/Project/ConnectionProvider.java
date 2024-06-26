package Project;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionProvider {
    public static Connection getCon() throws ClassNotFoundException, SQLException{
    
        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/buyersinfo","root","");
        //Connection connection = (Connection) DriverManager.getConnection("jdbc:mysql://sql12.freesqldatabase.com:3306/sql12376291","sql12376291","RZV521WLyp");
        
        return connection;
    }
}
