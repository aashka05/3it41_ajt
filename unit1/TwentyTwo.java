package unit1;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.net.*;

public class TwentyTwo extends JFrame implements ActionListener {
	JLabel jl;
	JTextField jtf;
	JButton submit;
	JTextArea jta;
	
	public TwentyTwo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.setVisible(true);
		
		jl = new JLabel("Enter URL: ");
		c.add(jl);
		
		jtf = new JTextField(30);
		c.add(jtf);
		
		submit = new JButton("Submit");
		c.add(submit);
		submit.addActionListener(this);
		
		jta = new JTextArea(5, 50);
		c.add(jta);
	}
	
	public void actionPerformed(ActionEvent ae) {
		String s = jtf.getText();
		try {
			InetAddress ip = InetAddress.getByName(s);
			jta.setText("IP: " + ip.getHostAddress());
		} catch (Exception e) {
			jta.setText(e.toString());
		}
		
	}
	
	public static void main(String[] args) {
		TwentyTwo f = new TwentyTwo();
		f.setVisible(true);
		f.setTitle("exam");
		f.setBounds(100, 100, 400, 500);
	}
}
