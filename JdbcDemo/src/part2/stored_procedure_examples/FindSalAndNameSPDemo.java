package part2.stored_procedure_examples;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;
import java.util.Scanner;

import part2.SqlConnectionSchema;

public class FindSalAndNameSPDemo {

	public static void main(String[] args) throws SQLException {
		SqlConnectionSchema sc = new SqlConnectionSchema("store");
		Connection con = DriverManager.getConnection(sc.getJdbcUrl(), sc.getUserName(), sc.getPwd());
		Scanner s = new Scanner(System.in);
		System.out.println("Enter employee id");
		int empno = s.nextInt();
		CallableStatement cst = con.prepareCall("{call getempnameandsal(?,?,?)}");
		cst.setInt(1, empno);
		cst.registerOutParameter(2, Types.VARCHAR);
		cst.registerOutParameter(3, Types.INTEGER);
		cst.execute();
		System.out.println("The name is "+cst.getString(2));
		System.out.println("The salary is "+cst.getInt(3));
		con.close();
		

	}

}
