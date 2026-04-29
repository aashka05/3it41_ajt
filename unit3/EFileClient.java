package unit3;

import java.io.*;
import java.net.*;

public class EFileClient {
	public static void main(String[] args) {
		try {
			Socket s = new Socket("localhost", 777);
			
			BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
			BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));
			PrintStream ps = new PrintStream(s.getOutputStream());
			
			String s1 = kb.readLine(), s2;
			ps.println(s1);
			while((s2 = br.readLine()) != null) {
				System.out.println(s2);
			}
			br.close();
			ps.close();
			kb.close();
			s.close();
		} catch(Exception e) {
			System.out.println(e);
		}
	}

}
