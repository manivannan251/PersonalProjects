package part2.stored_procedure_examples;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;
import java.util.Scanner;

import part2.SqlConnectionSchema;

public class FindSalSPDemo {

	public static void main(String[] args) throws SQLException {
		SqlConnectionSchema sql = new SqlConnectionSchema("store");
		Connection con = DriverManager.getConnection(sql.getJdbcUrl(),sql.getUserName(),sql.getPwd());
		System.out.println("Enter employee id");
		Scanner sc = new Scanner(System.in);
		int empId = sc.nextInt();
		CallableStatement cst = con.prepareCall("{call findsal(?,?)}");
		cst.setInt(1, empId);
		cst.registerOutParameter(2, Types.INTEGER);
		cst.execute();
		System.out.println("The salary of the employee is "+cst.getInt(2));
		con.close();
	}

}
