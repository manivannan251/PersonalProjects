package part2_transaction_management;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Savepoint;
import java.sql.Statement;

import part2.SqlConnectionSchema;

public class SavepointDemo {

	public static void main(String[] args) throws SQLException {
		SqlConnectionSchema sch = new SqlConnectionSchema("sqlblackbook");
		Connection con = DriverManager.getConnection(sch.getJdbcUrl(), sch.getUserName(), sch.getPwd());
		con.setAutoCommit(false);
		Statement st = con.createStatement();
		st.executeUpdate("insert into politicians values('stalin','dmk')");
		st.executeUpdate("insert into politicians values('kamal','mnm')");
		Savepoint sp = con.setSavepoint();
		st.executeUpdate("insert into politicians values('vaiko','bjp')");
		System.out.println("The guy is unstable so rolling back");
		con.rollback(sp);
		System.out.println("Going to commit rest of the changes");
		con.commit();
		con.close();
		
	}

}
