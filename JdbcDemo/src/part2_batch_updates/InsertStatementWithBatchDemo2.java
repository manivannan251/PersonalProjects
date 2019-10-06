package part2_batch_updates;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import part2.SqlConnectionSchema;

public class InsertStatementWithBatchDemo2 {

	public static void main(String[] args) throws SQLException {
		SqlConnectionSchema sch = new SqlConnectionSchema("sqlblackbook");
		Connection con = DriverManager.getConnection(sch.getJdbcUrl(), sch.getUserName(), sch.getPwd());
		Statement st = con.createStatement();
		st.addBatch("insert into employee values('Piccolo','Namek')");
		st.addBatch("delete from employee where ename like 'test%'");
		st.addBatch("update employee set city='earth' where ename='Piccolo'");
		int[] rowsUpdated = st.executeBatch();
		int count=0;
		for(int row:rowsUpdated) {
			count=count+row;
		}
		System.out.println("The total rows affected are "+count);
		con.close();
	}

}
