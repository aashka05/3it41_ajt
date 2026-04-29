package unit2;

import java.sql.*;

public class CCallableStatement {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "");
			CallableStatement cs = con.prepareCall("{call insertMarks(?, ?, ?)}");
			cs.setString(1, "Aashka");
			cs.setInt(2,  30);
			cs.setInt(3,  25);
			cs.execute();
			
			CallableStatement cs1 = con.prepareCall("{? = call getAverage(?, ?)}");
			cs1.registerOutParameter(1, java.sql.Types.DOUBLE);
			cs1.setInt(2,  30);
			cs1.setInt(3,  25);
			cs1.execute();
			double result = cs1.getInt(1);
			System.out.println("Average: " + result);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
