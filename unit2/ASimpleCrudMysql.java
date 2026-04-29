package unit2;

import java.sql.*;
import java.util.Scanner;

public class ASimpleCrudMysql {

	public static void main(String[] args) throws Exception{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "your_pwd");
			Statement stmt = con.createStatement();
			
			String n;
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter name to insert: ");
			n = sc.next();
			String qi = "INSERT INTO stu VALUES (3, '" + n + "');";
			int i = stmt.executeUpdate(qi);
			
			String q = "SELECT * FROM stu";
			//stmt.execute(q);
			//ResultSet rs = stmt.getResultSet();
			ResultSet rs = stmt.executeQuery(q);
			while(rs.next()) {
				System.out.println("Id: " + rs.getInt("Id"));
				System.out.println("Name: " + rs.getString("Name"));
			}
			
			String qu = "UPDATE stu SET name='hahah' WHERE id=2";
			int j = stmt.executeUpdate(qu);
			
			String qd = "DELETE FROM stu WHERE id=1";
			int k = stmt.executeUpdate(qd);
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
