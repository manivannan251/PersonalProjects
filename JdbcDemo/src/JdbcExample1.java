import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcExample1 {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		
		
		  Connection con=DriverManager.getConnection(
		  "jdbc:oracle:thin:@localhost:1521:xe","store","123");
		  
		
		
		
		Statement stmt=con.createStatement();  
		  
		//step4 execute query  
		ResultSet rs=stmt.executeQuery("select * from employees"); 
		//ResultSet rs1=stmt.executeQuery("select * from coupons"); 
		while(rs.next())  
		//System.out.println(rs.getInt(1)+"  "+rs.getInt(2)+"  "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getString(5)+" "+rs.getInt(6));
			System.out.println(rs.getInt("employee_id")+"  "+rs.getString("first_name"));
		  
		//step5 close the connection object  
		con.close(); 

	}

}
