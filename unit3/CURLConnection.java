package unit3;

import java.net.*;

public class CURLConnection {
	public static void main(String[] args) {
		try  {
			URL ob = new URL("https://bvmengineering.ac.in");
			URLConnection con = ob.openConnection();
			System.out.println("Date: " + con.getDate());
			System.out.println("Last Modified: " + con.getLastModified());
			System.out.println("Expiration: " + con.getExpiration());
			System.out.println("Content Type: " + con.getContentType());
			System.out.println("Content Length: " + con.getContentLength());
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
