package unit1;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class RegistrationForm extends JFrame implements ActionListener {
	JLabel jlname, jlhobby, jlgender, jlinterest;
	JTextField jtf;
	JButton submit;
	JCheckBox jcbSing;
	JCheckBox jcbDance;
	ButtonGroup gender;
	JRadioButton m, f;
	JToggleButton interest;
	JList subject;
	JTextArea jta;
	public RegistrationForm() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.setVisible(true);
		
		jlname = new JLabel("Name: ");
		c.add(jlname);
		
		jtf = new JTextField(30);
		c.add(jtf);
		
		jlhobby = new JLabel("Hobby");
		c.add(jlhobby);
		
		jcbSing = new JCheckBox("Sing", true);
		jcbSing.addActionListener(this);
		c.add(jcbSing);
		
		jcbDance = new JCheckBox("Dance");
		jcbDance.addActionListener(this);
		c.add(jcbDance);
		
		jlgender = new JLabel("Gender");
		c.add(jlgender);
		
		gender = new ButtonGroup();
		
		m = new JRadioButton("Male");
		f = new JRadioButton("Female");
		gender.add(m);
		gender.add(f);
		c.add(m);
		c.add(f);
		
		jlinterest = new JLabel("Receive updates: ");
		c.add(jlinterest);
		
		interest = new JToggleButton("ON");
		interest.addActionListener(this);
		c.add(interest);
		
		subject = new JList(new String[] {"Math", "Sci", "Eng"});
		c.add(subject);
		
		submit = new JButton("Submit");
		submit.addActionListener(this);
		c.add(new JScrollPane(submit));
		
		jta = new JTextArea(5, 50);
		c.add(jta);
	}
	public void actionPerformed(ActionEvent ae) {
		if (interest.isSelected()) {
			interest.setText("ON");
		} else {
			interest.setText("OFF");
		}
		String op = ae.getActionCommand();
		if(op.equals("Submit")) {
			String result = "";
			result += ("Name: " + jtf.getText() + "\n");
			result += "Hobbies: ";
			if(jcbSing.getModel().isSelected()) {
				result += ("Sing ");
			}
			if(jcbDance.getModel().isSelected()) {
				result += ("Dance ");
			}
			result += "\n";
			if(m.getModel().isSelected()) {
				result += ("Gender: Male\n");
			} else {
				result += ("Gender: Female\n");
			}
			if(interest.isSelected()) {
				result += ("Interested\n");
			} else {
				result += ("Not interested\n");
			}
			result += "Subject: ";
			Object[] x = subject.getSelectedValues();
			for(int i = 0; i < x.length; i++) {
				result += (x[i] + " ");
			}
			jta.setText(result);
		}
	}
	public static void main(String[] args) {
		RegistrationForm f = new RegistrationForm();
		f.setVisible(true);
		f.setTitle("Form");
		f.setBounds(100,100,500,400);
	}
	
}