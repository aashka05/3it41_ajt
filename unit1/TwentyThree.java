package unit1;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TwentyThree extends JFrame implements ActionListener {
	JLabel jl;
	JTextField jtf;
	JButton submit;
	JTextArea jta;
	
	public TwentyThree() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 400);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.setVisible(true);
		
		jl = new JLabel("Enter Text: ");
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
		String result = "string";
		if(s.equals("true") || s.equals("false")) {
			result = "boolean";
		}
		try {
			Double.parseDouble(s);
			result = "double";
		} catch (Exception e) {}
		try {
			Integer.parseInt(s);
			result = "integer";
		} catch (Exception e) {}
		jta.setText(result);
	}
	
	public static void main(String[] args) {
		TwentyThree f = new TwentyThree();
		f.setVisible(true);
		f.setTitle("Exam");
	}
	
}