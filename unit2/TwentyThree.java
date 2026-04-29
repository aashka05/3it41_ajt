package unit2;

import java.sql.*;
import java.util.Scanner;

public class TwentyThree {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "");
			Scanner sc = new Scanner(System.in);
			con.setAutoCommit(false);
			
			int src, dest, amount;
			System.out.print("Enter source account: ");
			src = sc.nextInt();
			System.out.print("Enter destination accout: ");
			dest = sc.nextInt();
			System.out.print("Enter amount: ");
			amount = sc.nextInt();
			
			PreparedStatement ps = con.prepareStatement("UPDATE t SET balance=balance+? WHERE id=?");
			
			ps.setInt(1, -amount);
			ps.setInt(2, src);
			int i = ps.executeUpdate();
			
			ps.setInt(1, amount);
			ps.setInt(2, dest);
			int j = ps.executeUpdate();
			
			if(i == 1 && j == 1) {
				con.commit();
				System.out.println("Transaction done.");
			} else {
				System.out.println("Error.");
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
