package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    Static Connection cc=null;

    cc=DriverManager.getConnection("jdbc:mysql://localhost:3306/tasks","root","samsam");

}
