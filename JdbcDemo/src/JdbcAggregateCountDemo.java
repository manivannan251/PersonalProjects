import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcAggregateCountDemo {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		String jdbcUrl = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "store";
		String pwd = "123";
		Connection con = DriverManager.getConnection(jdbcUrl,user,pwd);
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("select count(*) from employees");
		if(rs.next()) {
			System.out.println("The total number of employees are "+rs.getInt(1));
		}

	}

}
