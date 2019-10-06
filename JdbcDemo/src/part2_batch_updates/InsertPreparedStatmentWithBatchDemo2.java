package part2_batch_updates;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import part2.SqlConnectionSchema;

public class InsertPreparedStatmentWithBatchDemo2 {

	public static void main(String[] args) throws SQLException {
		SqlConnectionSchema sch = new SqlConnectionSchema("sqlblackbook");
		Connection con = DriverManager.getConnection(sch.getJdbcUrl(), sch.getUserName(), sch.getPwd());
		PreparedStatement pst = con.prepareStatement("insert into company values (?,?)");
		while(true) {
		System.out.println("Enter company name");
		Scanner sc = new Scanner(System.in);
		String cname = sc.next();
		System.out.println("Enter city");
		String city = sc.next();
		pst.setString(1, cname);
		pst.setString(2, city);
		pst.addBatch();
		System.out.println("Do you wish to continue press y or n");
		String op = sc.next();
		if(op.equalsIgnoreCase("N"))
			break;
		}
		int[] rowsUpdated = pst.executeBatch();
		int count=0;
		for(int row:rowsUpdated) {
			count = count+row;
		}
		System.out.println("The number of rows inserted "+count);
		con.close();

	}

}
