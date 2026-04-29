package unit2;

import java.sql.*;
import java.util.Scanner;
public class Nineteen {
	public static void main(String[] args) {
		try {
			Class.forName("net.ucanaccess.jdbc.UcanAccessDriver");
			Connection con = DriverManager.getConnection("jdbc:ucanaccess://2019.accdb");
			Statement stmt = con.createStatement();
			Scanner sc = new Scanner(System.in);
			int id = sc.nextInt();
			
			String query = "SELECT name, salary FROM Employee WHERE employee_id=" + id + " AND salary < 25000 AND name LIKE 'a%'";
			ResultSet rs = stmt.executeQuery(query);
			
			while(rs.next()) {
				System.out.println("Name: " + rs.getString("name"));
				System.out.println("Salary: " + rs.getInt("salary"));
			}
			stmt.close();
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
