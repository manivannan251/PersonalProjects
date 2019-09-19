package part2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class PreparedStatementDemo {

	public static void main(String[] args) throws SQLException {
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "store", "123");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter product type id");
		int prdId = sc.nextInt();
		PreparedStatement pst = con.prepareStatement("select product_type_id,name,description from products where product_type_id=?");
		pst.setInt(1, prdId);
		boolean flag=false;
		ResultSet rs = pst.executeQuery();
		while(rs.next()) {
			System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(2));
			flag=true;
		}
		if(!flag) {
			System.out.println("No record found");
		}
	}

}
