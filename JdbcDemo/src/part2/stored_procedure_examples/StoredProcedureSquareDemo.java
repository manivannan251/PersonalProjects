package part2.stored_procedure_examples;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;
import java.util.Scanner;

import part2.SqlConnectionSchema;

public class StoredProcedureSquareDemo {

	public static void main(String[] args) throws SQLException {
		SqlConnectionSchema sql = new SqlConnectionSchema("sqlblackbook");
		Connection con = DriverManager.getConnection(sql.getJdbcUrl(), sql.getUserName(), sql.getPwd());
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number ");
		int numb = sc.nextInt();
		CallableStatement cst = con.prepareCall("{call square(?,?)}");
		cst.setInt(1, numb);
		cst.registerOutParameter(2, Types.INTEGER);
		cst.execute();
		System.out.println("The square of number is "+cst.getInt(2));

	}

}
