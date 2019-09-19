
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcUpdateMultipleRows {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "sqlblackbook", "12345");
		Statement st = con.createStatement();
		int rowsUpd = st.executeUpdate("update employee set city='bang' where ename like 'test%'");
		System.out.println("The number of rows updated are "+rowsUpd);
		con.close();

	}

}
