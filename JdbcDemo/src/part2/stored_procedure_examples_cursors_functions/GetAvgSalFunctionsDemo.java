package part2.stored_procedure_examples_cursors_functions;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;
import java.util.Scanner;

import part2.SqlConnectionSchema;

public class GetAvgSalFunctionsDemo {

	public static void main(String[] args) throws SQLException {
		SqlConnectionSchema sch = new SqlConnectionSchema("store");
		Connection con = DriverManager.getConnection(sch.getJdbcUrl(), sch.getUserName(), sch.getPwd());
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter firt employee id");
		int emp1 = sc.nextInt();
		System.out.println("Enter second employee id");
		int emp2 = sc.nextInt();
		CallableStatement cst = con.prepareCall("{?=call getavgsal(?,?)}");
		cst.setInt(2, emp1);
		cst.setInt(3, emp2);
		cst.registerOutParameter(1, Types.FLOAT);
		cst.execute();
		System.out.println("The avg is "+cst.getFloat(1));
		con.close();

	}

}
