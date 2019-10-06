package part2_transaction_management;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import part2.SqlConnectionSchema;

public class TransactionManagementDemo1 {

	public static void main(String[] args) throws SQLException {
		SqlConnectionSchema sch = new SqlConnectionSchema("sqlblackbook");
		Connection con = DriverManager.getConnection(sch.getJdbcUrl(), sch.getUserName(), sch.getPwd());
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("select * from account");
		while(rs.next()) {
			System.out.println("Name : "+rs.getString(1)+" Amount :"+rs.getFloat(2));
		}
		System.out.println("Enter amount to debit");
		Scanner sc = new Scanner(System.in);
		float amt = sc.nextFloat();
		con.setAutoCommit(false);
		String sqlDebitQuery = "update account set salary=salary-"+amt+" where name='Bulma'";
		System.out.println(sqlDebitQuery);
		st.executeUpdate(sqlDebitQuery);
		String sqlCreditQuery = "update account set salary=salary+"+amt+" where name='Goku'";
		System.out.println(sqlCreditQuery);
		st.executeUpdate(sqlCreditQuery);
		System.out.println("Do you wish to continue. Enter no to cancel");
		String option = sc.next();
		if(option.equalsIgnoreCase("no")) {
			con.rollback();
		}
		else {
			con.commit();
		}
		System.out.println("After transaction");
		ResultSet updated = st.executeQuery("select * from account");
		while(updated.next()) {
			System.out.println("Name : "+updated.getString(1)+" Amount :"+updated.getFloat(2));
		}
			
		con.close();
		
	}

}
