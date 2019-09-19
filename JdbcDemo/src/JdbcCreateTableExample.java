import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcCreateTableExample {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "store", "123");
		Statement st = con.createStatement();
		st.executeUpdate("create table movies(sno number,mname varchar2(10),hero varchar2(10),heroine varchar2(10))");
		System.out.println("Table created");
		con.close();
	}

}
