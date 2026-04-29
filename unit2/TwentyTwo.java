package unit2;

import java.util.Scanner;
import java.sql.*;

public class TwentyTwo {
	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			String prod = sc.next();
			Class.forName("net.ucanaccess.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:ucanaccess://2022.accdb");
			PreparedStatement ps = con.prepareStatement("SELECT * FROM FindPrice WHERE NAME=?");
			ps.setString(1, prod);
			
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				System.out.println("Name: " + rs.getString("NAME"));
				System.out.println("Registration number: " + rs.getInt("Reg_No"));
				System.out.println("Weight: " + rs.getDouble("weight"));
				System.out.println("Price: " + rs.getDouble("Price"));
			}
			ps.close();
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
