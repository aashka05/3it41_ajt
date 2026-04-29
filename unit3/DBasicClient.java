package unit3;

import java.net.*;
import java.io.*;

public class DBasicClient {
	public static void main(String[] args) {
		try {
			Socket s = new Socket("localhost", 777);
			
			PrintStream ps = new PrintStream(s.getOutputStream());
			BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
			BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));
			
			String s1, s2;
			while(!(s1 = kb.readLine()).equals("quit")) {
				ps.println(s1);
				s2 = br.readLine();
				System.out.println("Server: " + s2);				
			}
			
			ps.close();
			br.close();
			kb.close();
			s.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
