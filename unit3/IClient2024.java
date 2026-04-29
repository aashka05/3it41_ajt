package unit3;

import java.io.*;
import java.net.*;

public class IClient2024 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Socket s = new Socket("localhost", 888);
			PrintStream ps = new PrintStream(s.getOutputStream());
			BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
			
			String s1 = br.readLine();
			String alpha = "", digit = "";
			for(int i = 0; i < s1.length(); i++) {
				char x = s1.charAt(i);
				if(x =='1'||x=='2'||x=='3'||x=='4'||x=='5'||x=='6'||x=='7'||x=='8'||x=='9'||x=='0') {
					digit += x;
				} else {
					alpha += x;
				}
			}
			ps.println(alpha);
			ps.println(digit);
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
