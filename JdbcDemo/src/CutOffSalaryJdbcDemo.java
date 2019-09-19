import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class CutOffSalaryJdbcDemo {

	public static void main(String[] args) throws SQLException {
		String jdbcUrl = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "store";
		String password = "123";
		Connection con = DriverManager.getConnection(jdbcUrl, user, password);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter cutoff salary");
		int sal = sc.nextInt();
		Statement st = con.createStatement();
		boolean flag = false;
		
		String sqlQuery = String.format("select employee_id,first_name,last_name,title,salary from employees where salary>%d", sal);
		ResultSet rs = st.executeQuery(sqlQuery);
		while(rs.next()) {
			if(!flag) {
				System.out.println("EmployeedID\tFirstName\tLast_name\tTitle\tSalary");
				System.out.println("-----------------------------------------------------------------------");
				
			}
			System.out.println("\t"+rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getString(4)+"\t"+rs.getInt(5));
			flag=true;
		}
		if(!flag)
			System.out.println("No record found");
	}

}
