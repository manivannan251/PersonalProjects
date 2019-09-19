import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcDeleteRowDemo {

	public static void main(String[] args) throws SQLException {
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "sqlblackbook", "12345");
		Statement st = con.createStatement();
		int intRowsD = st.executeUpdate("delete from employee where ename='chennai'");
		System.out.println("The number of rows deleted "+intRowsD);
		con.close();
	}

}
