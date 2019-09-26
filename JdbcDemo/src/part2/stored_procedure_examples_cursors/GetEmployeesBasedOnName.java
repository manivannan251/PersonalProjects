package part2.stored_procedure_examples_cursors;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import oracle.jdbc.internal.OracleTypes;
import part2.SqlConnectionSchema;

public class GetEmployeesBasedOnName {

	public static void main(String[] args) throws SQLException {
		SqlConnectionSchema sch = new SqlConnectionSchema("store");
		Connection con = DriverManager.getConnection(sch.getJdbcUrl(), sch.getUserName(), sch.getPwd());
		System.out.println("Enter initial charecters of name");
		Scanner sc = new Scanner(System.in);
		String let = sc.next()+"%";
		CallableStatement cst = con.prepareCall("{call getempbasedoninitchar(?,?)}");
		cst.setString(1, let);
		cst.registerOutParameter(2, OracleTypes.CURSOR);
		cst.execute();
		boolean present = false;
		ResultSet rs = (ResultSet) cst.getObject(2);
		while(rs.next()) {
			System.out.println(rs.getInt(1)+"\t"+rs.getInt(2)+"\t"+rs.getString(3)
			+"\t"+rs.getString(4)+"\t"+rs.getString(5)+"\t"+rs.getInt(6));
			present=true;
			}
		if(!present)
			System.out.println("No employees found with that name");
	}

}
