package part2_batch_updates;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import part2.SqlConnectionSchema;

public class InsertStatementWithBatchDemo {

	public static void main(String[] args) throws SQLException {
		SqlConnectionSchema sch = new SqlConnectionSchema("store");
		Connection con = DriverManager.getConnection(sch.getJdbcUrl(), sch.getUserName(), sch.getPwd());
		Statement st = con.createStatement();
		long start= System.currentTimeMillis();
		for(int i=1000;i<9000;i++) {
			String name = "Goku"+i;
			String query = String.format("insert into employees values(%d,0,'%s','Gohan','Worker',%d)", i,name,i);
			st.addBatch(query);
		}
		st.executeBatch();
		long end = System.currentTimeMillis();
		System.out.println("The duration of the program is "+(end-start)/1000);
		con.close();

	}

}
