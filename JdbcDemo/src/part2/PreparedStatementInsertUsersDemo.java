package part2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class PreparedStatementInsertUsersDemo {

	public static void main(String[] args) throws SQLException {
		SqlConnectionSchema scl = new SqlConnectionSchema("sqlblackbook");
		Connection con = DriverManager.getConnection(scl.getJdbcUrl(), scl.getUserName(), scl.getPwd());
		PreparedStatement pst = con.prepareStatement("insert into users values(?,?)");
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("Enter username");
			String user = sc.next();
			System.out.println("Enter password");
			String pwd = sc.next();
			pst.setString(1, user);
			pst.setString(2, pwd);
			int rowsUpdated = pst.executeUpdate();
			System.out.println("Numbers of rows inserted "+rowsUpdated);
			System.out.println("Do you wish to insert more records. Press No to exit");
			String choice = sc.next();
			if(choice.equalsIgnoreCase("no"))
				break;
			
		}

	}

}
