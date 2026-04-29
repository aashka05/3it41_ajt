package unit2;

import java.sql.*;
import java.util.Scanner;

public class BPreparedStatement {
	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			int id = sc.nextInt();
			String name = sc.next();
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "System", "");
			PreparedStatement ps = con.prepareStatement("UPDATE stu SET name=? WHERE id=?");
			ps.setString(1, name);
			ps.setInt(2, id);
			int result = ps.executeUpdate();
			ps.close();
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
