package unit3;

import java.io.*;
import java.net.*;

public class HClient2025_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Socket s = new Socket("localhost", 777);
			
			PrintStream ps = new PrintStream(s.getOutputStream());
			BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
			BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));
			
			String n = kb.readLine();
			ps.println(n);
			if (br.readLine().equals("yes")) {
				System.out.println("It is fibonacci like series");
			} else {
				System.out.println("fibonacci series not detected.");
			}
		} catch (Exception e) {
			
		}
	}

}
