package part2_batch_updates;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import part2.SqlConnectionSchema;

public class InsertStatementWithoutBatchDemo {

	public static void main(String[] args) throws SQLException {
		SqlConnectionSchema sch = new SqlConnectionSchema("store");
		Connection con = DriverManager.getConnection(sch.getJdbcUrl(), sch.getUserName(), sch.getPwd());
		Statement st = con.createStatement();
		long startTime = System.currentTimeMillis();
		for(int i=1000;i<=9000;i++) {
			String firstName = "Goku"+i;
			String query = String.format("insert into employees values(%d,null,'%s','WILL','Worker',%d)",i,firstName,i);
			st.executeUpdate(query);
		}
		long endTime= System.currentTimeMillis();
		System.out.println("The duration of the program is "+((endTime-startTime)/1000));
		con.close();

	}

}
