package unit3;

import java.net.*;

public class AInetAddress {
	public static void main(String[] args) {
		try {
			String site = "github.com";
			InetAddress ip = InetAddress.getByName(site);
			String ipAddr = ip.getHostAddress();
			System.out.println("IP Address: " + ipAddr);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
