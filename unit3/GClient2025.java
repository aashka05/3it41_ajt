package unit3;

import java.io.*;
import java.net.*;

public class GClient2025 {
	
	public static int findIndex(String[][] distinct, char c) {
		for(int i = 0; i < distinct.length; i++) {
			if(distinct[i][0] != null && distinct[i][0].charAt(0) == c) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Socket s = new Socket("localhost", 777);
			
			PrintStream ps = new PrintStream(s.getOutputStream());
			BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
			BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));
			
			String s1 = br.readLine();
			System.out.println(s1);
			String[][] distinct = new String[s1.length()][2];
			int c = 0;
			for(int i = 0; i < s1.length(); i++) {
				int x = findIndex(distinct, s1.charAt(i));
				if(x == -1) {
					distinct[c][0] = String.valueOf(s1.charAt(i));
					distinct[c][1] = "1";
					c++;
				} else {
					int count = Integer.parseInt(distinct[x][1]);
					count++;
					distinct[x][1] = String.valueOf(count); 
				}
			}
			
			String result = "";
			for(int i = 0; i < distinct.length; i++) {
				if(distinct[i][0] != null) {
					result += (distinct[i][0] + distinct[i][1]);
					System.out.println(distinct[i][0]);
				}
			}
			ps.println(result);
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
