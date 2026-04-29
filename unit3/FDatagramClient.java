package unit3;

import java.net.*;
import java.io.*;

public class FDatagramClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			DatagramSocket ds = new DatagramSocket(777);
			BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));
			String reply = "";
			while(!(reply.equals("quit"))) {
				String msg = kb.readLine();
				byte[] s1 = msg.getBytes();
				
				DatagramPacket dp = new DatagramPacket(s1, s1.length, InetAddress.getByName("localhost"), 888);
				ds.send(dp);
				
				byte s2[] = new byte[1024];
				DatagramPacket dpr = new DatagramPacket(s2, s2.length);
				ds.receive(dpr);
				reply = new String(dpr.getData(), 0, dpr.getLength());
				System.out.println("Server: " + reply);
			}
			ds.close();
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
