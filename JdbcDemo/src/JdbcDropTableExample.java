import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcDropTableExample {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "store", "123");
		Statement st = con.createStatement();
		st.executeUpdate("drop table movies");
		System.out.println("Table dropped");
		con.close();

	}

}
