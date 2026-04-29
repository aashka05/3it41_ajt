package unit3;

import java.net.*;

public class BURL {
	public static void main(String[] args) {
		try {
			URL ob = new URL("http://example.com:8080/folder/page.html?name=aashka&id=101");
			System.out.println("Protocol: " + ob.getProtocol());
			System.out.println("Host: " + ob.getHost());
			System.out.println("Port: " + ob.getPort());
			System.out.println("Path: " + ob.getPath());
			System.out.println("File: " + ob.getFile());
			System.out.println("Complete url: " + ob.toExternalForm());
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
