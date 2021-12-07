import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) throws SQLException {

        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test_db_jbdl23", "root", "");

        Statement statement = connection.createStatement();
        statement.executeQuery("create table dummy(name varchar(20),age int,id int)");
    }
}
