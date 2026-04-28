package unit1;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TwentyFive extends JFrame implements ActionListener{

	JLabel jl;
	JTextField jtf;
	JButton submit;
	JTextArea jta;

	public TwentyFive() {
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
		
		jta = new JTextArea(5, 50);
		c.add(jta);
		
		submit.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent ae) {
		String s = jtf.getText();
		s = s.replace(' ', '-');
		jta.setText(s);
		int c_vowel = 0;
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u') {
				c_vowel++;
			}
		}
		jta.setText("Replaced string: " + s + "\nVowel count: " + c_vowel);
	}
	
	public static void main(String[] args) {
		TwentyFive f = new TwentyFive();
		f.setVisible(true);
		f.setTitle("Exam");
	}
}