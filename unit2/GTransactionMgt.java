package unit2;

import java.sql.*;

public class GTransactionMgt {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "");
			
			con.setAutoCommit(false);
			
			int src = 2, dest = 1;
			
			PreparedStatement ps = con.prepareStatement("UPDATE t SET balance=balance+? WHERE id=?");
			ps.setInt(1, 200);
			ps.setInt(2, 1);
			int i = ps.executeUpdate();
			
			ps.setInt(1, -200);
			ps.setInt(2,  2);
			int j = ps.executeUpdate();
			
			if(i > 0 && j > 0) {
				con.commit();
				System.out.print("Transaction done");
			} else {
				con.rollback();
				System.out.println("Error");
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
