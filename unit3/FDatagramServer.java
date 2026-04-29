package unit3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class FDatagramServer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			DatagramSocket ds = new DatagramSocket(888);
			BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));	
			
			while(true) {
				byte[] s1 = new byte[1024];
				DatagramPacket dp = new DatagramPacket(s1, s1.length);
				ds.receive(dp);
				
				String reply = new String(dp.getData(), 0, dp.getLength());
				System.out.println("Client: " + reply);
				
				String msg = kb.readLine();
				byte[] s2 = msg.getBytes();
				
				DatagramPacket dpsend = new DatagramPacket(s2, s2.length, dp.getAddress(), dp.getPort());
				ds.send(dpsend);
			}
			
		} catch(Exception e) {
			System.out.println(e);
		}
	}

}
