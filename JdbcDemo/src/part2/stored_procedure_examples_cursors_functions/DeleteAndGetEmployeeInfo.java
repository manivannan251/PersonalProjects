package part2.stored_procedure_examples_cursors_functions;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.Scanner;

import oracle.jdbc.internal.OracleTypes;
import part2.SqlConnectionSchema;

public class DeleteAndGetEmployeeInfo {

	public static void main(String[] args) throws SQLException {
		SqlConnectionSchema sch = new SqlConnectionSchema("store");
		Connection con = DriverManager.getConnection(sch.getJdbcUrl(), sch.getUserName(), sch.getPwd());
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter employee id to delete");
		int empid = sc.nextInt();
		CallableStatement cst = con.prepareCall("{?=call deleteandgetempinfor(?,?)}");
		cst.setInt(2, empid);
		cst.registerOutParameter(1, OracleTypes.CURSOR);
		cst.registerOutParameter(3, Types.INTEGER);
		cst.execute();
		System.out.println("The number of rows deleted "+cst.getInt(3));
		boolean flag = false;
		ResultSet rs = (ResultSet) cst.getObject(1);
		while(rs.next()) {
			System.out.println(rs.getInt(1)+"\t"+rs.getInt(2)+"\t"+rs.getString(3)
			+"\t"+rs.getString(4)+"\t"+rs.getString(5)+"\t"+rs.getInt(6));
			flag=true;
			}
			if(!flag)
				System.out.println("No employees found with id "+empid);

	}

}
