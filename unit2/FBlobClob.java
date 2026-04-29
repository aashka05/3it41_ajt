package unit2;

import java.sql.*;
import java.io.*;

public class FBlobClob {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "");
			PreparedStatement ps = con.prepareStatement("INSERT INTO lob VALUES (?, ?, ?)");
			ps.setString(1, "first");
			
			FileInputStream fis = new FileInputStream("img1.jpg");
			ps.setBinaryStream(2,  fis, fis.available());
			
			File f = new File("data.txt");
			FileReader fr = new FileReader(f);
			ps.setCharacterStream(3, fr, f.length());
			
			int result = ps.executeUpdate();
			if(result > 0) {
				System.out.println("Data Inserted");
			}
			
			PreparedStatement ps1 = con.prepareStatement("SELECT * FROM lob");
			ResultSet rs = ps1.executeQuery();
			while (rs.next()) {
				//String s = rs.getString("name");
				
				Blob b = rs.getBlob("b");
				byte bar[] = b.getBytes(1, (int)b.length());
				FileOutputStream fos = new FileOutputStream("img1_copied.jpg");
				fos.write(bar);
				
				Clob c = rs.getClob("c");
				Reader r = c.getCharacterStream();
				FileWriter fw = new FileWriter("data_copied.txt");
				int i;
				while((i = r.read()) != -1) {
					fw.write((char)i);
				}
				fos.close();
				fw.close();
			}
			ps.close();
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}