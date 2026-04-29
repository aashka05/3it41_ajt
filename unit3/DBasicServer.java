package unit3;

import java.net.*;
import java.io.*;

public class DBasicServer {
	public static void main(String[] args) {
		try {
			ServerSocket ss = new ServerSocket(777);
			Socket s = ss.accept();
			
			PrintStream ps = new PrintStream(s.getOutputStream());
			BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
			BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));

			String s1, s2;
			while(!(s1 = br.readLine()).equals("quit")) {
				System.out.println("Client: " + s1);
				s2 = kb.readLine();
				ps.println(s2);
			}
			ps.close();
			br.close();
			kb.close();
			s.close();
			ss.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
