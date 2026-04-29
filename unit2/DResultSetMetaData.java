package unit2;

import java.sql.*;

public class DResultSetMetaData {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "");
			Statement stmt = con.createStatement();
			
			String q = "SELECT * FROM marks";
			ResultSet rs = stmt.executeQuery(q);
			
			ResultSetMetaData rsmd = rs.getMetaData();
			int c = rsmd.getColumnCount();
			System.out.println("Column Count: " + c);
			for(int i = 1; i <= c; i++) {
				System.out.println("Column Names: " + rsmd.getColumnName(i));
				System.out.println("Column Type: " + rsmd.getColumnTypeName(i));
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
