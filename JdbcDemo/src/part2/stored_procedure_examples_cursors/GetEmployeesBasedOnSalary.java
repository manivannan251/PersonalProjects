package part2.stored_procedure_examples_cursors;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import oracle.jdbc.OracleTypes;
import part2.SqlConnectionSchema;

public class GetEmployeesBasedOnSalary {

	public static void main(String[] args) throws SQLException {
		SqlConnectionSchema sch = new SqlConnectionSchema("store");
		Connection con = DriverManager.getConnection(sch.getJdbcUrl(),sch.getUserName(),sch.getPwd());
		System.out.println("Enter cutoff salary");
		Scanner sc = new Scanner(System.in);
		int sal = sc.nextInt();
		CallableStatement cst = con.prepareCall("{call getempbasedonsal(?,?)}");
		cst.setInt(1, sal);
		cst.registerOutParameter(2, OracleTypes.CURSOR);
		cst.execute();
		ResultSet rs = (ResultSet) cst.getObject(2);
		boolean flag=false;
		while(rs.next()) {
		System.out.println(rs.getInt(1)+"\t"+rs.getInt(2)+"\t"+rs.getString(3)
		+"\t"+rs.getString(4)+"\t"+rs.getString(5)+"\t"+rs.getInt(6));
		flag=true;
		}
		if(!flag)
			System.out.println("No employees found with salary less than given salary");

	}

}
