package unit3;


import java.net.*;
import java.io.*;

public class GServer2025 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			ServerSocket ss = new ServerSocket(777);
			Socket s = ss.accept();
			
			PrintStream ps = new PrintStream(s.getOutputStream());
			BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
			BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));
			
			String s1 = kb.readLine();
			ps.println(s1);
			
			String result = br.readLine();
			System.out.println(result);			
			
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
