package unit2;

import java.sql.*;
import java.util.Scanner;

public class TwentyFour {
	public static void main(String[] args) {
		try {
			Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
			Connection con = DriverManager.getConnection("jdbc:ucanaccess://2024.accdb");
			Statement stmt = con.createStatement();
			
			Scanner sc = new Scanner(System.in);
			Double salary;
			int empid;
			String dept;
			
			System.out.print("Enter Employee id: ");
			empid = sc.nextInt();
			System.out.print("Enter updated salary: ");
			salary = sc.nextDouble();
			String q = "UPDATE Employees SET Salary=" + salary + " WHERE Employeeid=" + empid + ";";
			int result = stmt.executeUpdate(q);
			if(result > 0) {
				System.out.println(result + " rows updated");
			}
			
			System.out.print("Enter department: ");
			dept = sc.next();
			q = "SELECT * FROM Employees WHERE Department='" + dept + "';";
			ResultSet rs = stmt.executeQuery(q);
			System.out.println("Employee info from department: " + dept);
			while(rs.next()) {
				System.out.println("Employee ID: " + rs.getInt("EmployeeID"));
				System.out.println("Name: " + rs.getString("Name"));
				System.out.println("Salary: " + rs.getDouble("Salary"));
			}
		} catch(Exception e) {
			System.out.println(e);
		}
	}
}
