package part2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class StatementSqlInjectionDemo {

	public static void main(String[] args) throws SQLException {
		SqlConnectionSchema scl = new SqlConnectionSchema("sqlblackbook");
		Connection con = DriverManager.getConnection(scl.getJdbcUrl(), scl.getUserName(), scl.getPwd());
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter username");
		String user = sc.next();
		System.out.println("Enter pwd");
		String pwd = sc.next();
		Statement st = con.createStatement();
		String sqlQuery = String.format("select count(*) from users where name='%s' and pwd='%s'", user,pwd);
		ResultSet rs = st.executeQuery(sqlQuery);
		if(rs.next()) {
			if(rs.getInt(1)==1)
			System.out.println("User is authenticated");
			else
				System.out.println("User not present");
				
		}
		
		con.close();

	}

}
