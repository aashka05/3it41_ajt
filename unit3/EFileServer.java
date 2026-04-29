package unit3;

import java.net.*;
import java.io.*;

public class EFileServer {
	public static void main(String[] args) {
		try {
			ServerSocket ss = new ServerSocket(777);
			Socket s = ss.accept();
			
			PrintStream ps = new PrintStream(s.getOutputStream());
			BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
			
			String fname = br.readLine();
			System.out.println(fname);
			File f = new File(fname);
			if(f.exists()) {
				FileReader fr = new FileReader(fname);
				BufferedReader file = new BufferedReader(fr);
				String str;
				while((str = file.readLine()) != null) {
					ps.println(str);
				}
			}
		} catch(Exception e) {
			System.out.println(e);
		}
	}
}
