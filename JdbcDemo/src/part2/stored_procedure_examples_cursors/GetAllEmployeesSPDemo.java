package part2.stored_procedure_examples_cursors;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import oracle.jdbc.OracleTypes;
import part2.SqlConnectionSchema;

public class GetAllEmployeesSPDemo {

	public static void main(String[] args) throws SQLException {
		SqlConnectionSchema sql = new SqlConnectionSchema("store");
		Connection con = DriverManager.getConnection(sql.getJdbcUrl(), sql.getUserName(), sql.getPwd());
		CallableStatement cst = con.prepareCall("{call getallempinfo(?)}");
		cst.registerOutParameter(1, OracleTypes.CURSOR);
		cst.execute();
		ResultSet rs = (ResultSet) cst.getObject(1);
		boolean flag = false;
		while(rs.next()) {
			System.out.println(rs.getInt(1)+"\t"+rs.getInt(2)+"\t"+rs.getString(3)
			+"\t"+rs.getString(4)+"\t"+rs.getString(5)+"\t"+rs.getInt(6));
			flag=true;
		}
		if(!flag)
			System.out.println("No records found");

	}

}
