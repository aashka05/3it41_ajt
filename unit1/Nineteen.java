package unit1;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Nineteen extends JFrame implements ActionListener {
	JLabel jl1, jl2;
	JTextField jtf1, jtf2;
	JButton add, sub, mul, div;
	JTextArea jta;
	
	public Nineteen() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.setVisible(true);
		
		jl1 = new JLabel("Number 1: ");
		c.add(jl1);
		
		jtf1 = new JTextField(30);
		c.add(jtf1);
		
		jl2 = new JLabel("Number 2: ");
		c.add(jl2);
		
		jtf2 = new JTextField(30);
		c.add(jtf2);
		
		add = new JButton("Add");
		sub = new JButton("Subtract");
		mul = new JButton("Multiply");
		div = new JButton("Divide");
		c.add(add);
		c.add(sub);
		c.add(mul);
		c.add(div);
		add.addActionListener(this);
		sub.addActionListener(this);
		mul.addActionListener(this);
		div.addActionListener(this);
		
		jta = new JTextArea(5, 50);
		c.add(jta);		
	}
	
	public void actionPerformed(ActionEvent ae) {
		String op = ae.getActionCommand(); //gets the button name
		double result = 0;
		double n1 = Double.parseDouble(jtf1.getText());
		double n2 = Double.parseDouble(jtf2.getText());
		if(op.equals("Add")) {
			result = n1 + n2;
		} else if (op.equals("Subtract")) { 
			result = n1 - n2;
		} else if (op.equals("Multiply")) {
			result = n1 * n2;
		} else if (op.equals("Divide")) {
			result = n1 / n2;
		}
		jta.setText(String.valueOf(result));
	}
	public static void main(String[] args) {
		Nineteen f = new Nineteen();
		f.setVisible(true);;
		f.setBounds(100, 100, 500, 400);
		f.setTitle("Exam");
	}
}
