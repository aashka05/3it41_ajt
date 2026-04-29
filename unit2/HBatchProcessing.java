package unit2;

import java.sql.*;
import java.util.Scanner;

public class HBatchProcessing {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "");
			PreparedStatement ps = con.prepareStatement("INSERT INTO stu VALUES(?, ?)");
			Scanner sc = new Scanner(System.in);
			while(true) {
				System.out.print("Enter id: ");
				int id = sc.nextInt();
				System.out.print("Enter name: ");
				String name = sc.next();
				
				ps.setInt(1, id);
				ps.setString(2, name);
				ps.addBatch();
				System.out.print("Press q to quit: ");
				String x = sc.next();
				if(x.equals("q")) {
					break;
				}
			}
			ps.executeBatch();
			ps.close();
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
