package unit2;

import java.sql.*;
import java.util.Scanner;

public class TwentyFive {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "your_pwd");
			Statement stmt = con.createStatement();
			int id;
			String status;
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter id: ");
			id = sc.nextInt();
			System.out.print("Enter status: ");
			status = sc.next();
			String query = "UPDATE Appointments SET Status='" + status + "' WHERE AppointmentID=" + id + ";";
			int result = stmt.executeUpdate(query);
			if(result != -1) {
				System.out.println(result + " rows updated");
			}
			
			String type;
			System.out.print("Enter service type: ");
			type = sc.next();
			String q = "SELECT * FROM Appointments WHERE ServiceType = '" + type + "';";
			ResultSet rs = stmt.executeQuery(q);
			while(rs.next()) {
				System.out.println("AppointmentID: " + rs.getInt("AppointmentID"));
				System.out.println("ClientName:" + rs.getString("ClientName"));
				System.out.println("Service Type: " + rs.getString("ServiceType"));
				System.out.println("Appointment Date" + rs.getDate("AppointmentDate"));
				System.out.println("Status" + rs.getString("Status"));
			}
			rs.close();
			sc.close();
			con.close();
		} catch (Exception e) {}
	}
}
