package unit1;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Eighteen extends JFrame implements ActionListener {
	JButton r, g, b;
	JTextArea jta;
	public Eighteen() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setVisible(true);
		c.setLayout(new FlowLayout());
		
		r = new JButton("Red");
		g = new JButton("Green");
		b = new JButton("Blue");
		
		r.addActionListener(this);
		g.addActionListener(this);
		b.addActionListener(this);
		
		c.add(r);
		c.add(g);
		c.add(b);
		
		jta = new JTextArea(5,5);
		c.add(jta);
	}
	public void actionPerformed(ActionEvent ae) {
		String color = ae.getActionCommand();
		if(color.equals("Red")) {
			jta.setBackground(Color.red);
		} else if(color.equals("Green")) {
			jta.setBackground(Color.green);
		} else if(color.equals("Blue")) {
			jta.setBackground(Color.blue);
		}
	}
	
	public static void main(String[] args) {
		Eighteen f = new Eighteen();
		f.setVisible(true);
		f.setTitle("Exam");
		f.setBounds(100, 100, 500, 400);
	}
}
