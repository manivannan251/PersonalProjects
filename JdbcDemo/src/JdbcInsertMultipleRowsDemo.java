import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JdbcInsertMultipleRowsDemo {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "sqlblackbook", "12345");
		Statement st = con.createStatement();
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("Going to insert rows into employee table");
			System.out.println("Enter employee name");
			String ename = sc.next();
			System.out.println("Enter employee city");
			String city = sc.next();
			String sqlQuery = String.format("insert into employee values('%s','%s')", ename,city);
			st.executeUpdate(sqlQuery);
			System.out.println("The row has been inserted");
			System.out.println("Do you wish to continue press Yes to continue or no to Exit");
			String choice = sc.next();
			if(choice.equalsIgnoreCase("No"))
				break;
		}

	}

}
