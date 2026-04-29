package unit3;

import java.net.*;
import java.io.*;

public class HServer2025_2 {
	public static void main(String[] args) {
		try {
			ServerSocket ss = new ServerSocket(777);
			Socket s = ss.accept();

			PrintStream ps = new PrintStream(s.getOutputStream());
			BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
			
			String[] list = br.readLine().split(" ");
			
			int[] num = new int[list.length];
			
			for(int i = 0; i < list.length; i++) {
				num[i] = Integer.parseInt(list[i]);
			}
			int flag = 1;
			for(int i = 2; i < num.length; i++) {
				if(num[i] != num[i-1] + num[i-2]) {
					flag = 0;
					break;
				}
			}
			if(flag == 1) {
				ps.println("yes");
			} else {
				ps.println("no");
			}
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	

}
