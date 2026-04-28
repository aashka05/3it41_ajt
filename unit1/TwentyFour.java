package unit1;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TwentyFour extends JFrame implements ActionListener {
	JLabel jl;
	JTextField jtf;
	JButton submit;
	JTextArea jta;
	
	public TwentyFour() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 500);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.setBackground(Color.white);
		c.setVisible(true);
		
		jl = new JLabel("Enter text: ");
		c.add(jl);
		
		jtf = new JTextField(30);
		c.add(jtf);
		
		submit = new JButton("Submit");
		c.add(submit);
		submit.addActionListener(this);
		
		jta = new JTextArea(5, 30);
		c.add(jta);
	}
	
	public void actionPerformed(ActionEvent ae) {
		String s = jtf.getText();
		s = s.toUpperCase();
		String s_rev = "";
		for(int i = (s.length() - 1); i >= 0; i--) {
			s_rev += s.charAt(i);
		}
		jta.setText("Upper case: " + s + "\nReverse: " + s_rev);
	}
	public static void main(String[] args) {
		TwentyFour f = new TwentyFour();
		f.setVisible(true);
		f.setTitle("Exam");
	}
}
