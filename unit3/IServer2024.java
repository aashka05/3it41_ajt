package unit3;

import java.io.*;
import java.net.*;

public class IServer2024 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			ServerSocket ss = new ServerSocket(888);
			Socket s = ss.accept();
			
			PrintStream ps = new PrintStream(s.getOutputStream());
			BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
			BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));
			
			String s1 = kb.readLine();
			ps.println(s1);
			
			String r1 = br.readLine();
			String r2 = br.readLine();
			
			System.out.println("Alpha: " + r1);
			System.out.println("Digit: " + r2);
			
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
