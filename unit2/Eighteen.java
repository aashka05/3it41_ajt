package unit2;

import java.sql.*;
import java.util.Scanner;

public class Eighteen {
	public static void main(String[] args) {
		try {
			Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
			Connection con = DriverManager.getConnection("jdbc:ucanaccess://2018.accdb");
			Statement stmt = con.createStatement();
			
			Scanner sc = new Scanner(System.in);
			int id = sc.nextInt();
			
			String query = "SELECT * FROM customer WHERE id=" + id;
			ResultSet rs = stmt.executeQuery(query);
			
			while(rs.next()) {
				System.out.println("Name: " + rs.getString("name"));
				System.out.println("Current Balance: " + rs.getInt("balance"));
			}
			stmt.close();
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
