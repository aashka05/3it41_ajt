package unit2;

import java.sql.*;

public class EDatabaseMetaData {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "");
			
			DatabaseMetaData dbmd = con.getMetaData();
			System.out.println("Driver name: " + dbmd.getDriverName());
			System.out.println("Driver Version: " + dbmd.getDriverVersion());
			System.out.println("Username: " + dbmd.getUserName());
			System.out.println("Database Product: " + dbmd.getDatabaseProductName());
			System.out.println("Database Product Version: " + dbmd.getDatabaseProductVersion());
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
