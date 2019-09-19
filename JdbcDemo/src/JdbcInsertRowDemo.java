import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcInsertRowDemo {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","sqlblackbook","12345");
		Statement st = con.createStatement();
		int rows = st.executeUpdate("insert into employee values('anil','nagpur')");
		System.out.println("The number of rows updated is "+rows);
		con.close();

	}

}
