package part2_batch_updates;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import part2.SqlConnectionSchema;

public class InsertPreparedStatementWithoutBatchDemo {

	public static void main(String[] args) throws SQLException {
		SqlConnectionSchema sch = new SqlConnectionSchema("store");
		Connection con = DriverManager.getConnection(sch.getJdbcUrl(), sch.getUserName(), sch.getPwd());
		long startTime = System.currentTimeMillis();
		PreparedStatement pst = con.prepareStatement("insert into employees values(?,?,?,?,?,?)");
		for(int i=1000;i<=9000;i++) {
			String name = "Goku"+i;
			pst.setInt(1, i);
			pst.setInt(2, 1);
			pst.setString(3, name);
			pst.setString(4, "Gohan");
			pst.setString(5, "Worker");
			pst.setInt(6, i);
			pst.executeUpdate();
		}
		long endTime = System.currentTimeMillis();
		System.out.println("The duration of the program is "+((endTime-startTime)/1000));
		con.close();

	}

}
