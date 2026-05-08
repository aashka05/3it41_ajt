import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class Calculator extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator frame = new Calculator();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Calculator() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JTextArea ta = new JTextArea();
		ta.setBounds(39, 20, 255, 27);
		contentPane.add(ta);

		
		JButton btnNewButton_0 = new JButton("0");
		btnNewButton_0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ta.setText(ta.getText() + "0");
			}
		});
		btnNewButton_0.setBounds(91, 226, 40, 40);
		contentPane.add(btnNewButton_0);
		
		JButton btnNewButton_1 = new JButton("1");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ta.setText(ta.getText() + "1");
			}
		});
		btnNewButton_1.setBounds(39, 180, 40, 40);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("2");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ta.setText(ta.getText() + "2");
			}
		});
		btnNewButton_2.setBounds(91, 180, 40, 40);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("3");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ta.setText(ta.getText() + "3");
			}
		});
		btnNewButton_3.setBounds(143, 180, 40, 40);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("4");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ta.setText(ta.getText() + "4");
			}
		});
		btnNewButton_4.setBounds(39, 139, 40, 40);
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("5");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ta.setText(ta.getText() + "5");
			}
		});
		btnNewButton_5.setBounds(91, 139, 40, 40);
		contentPane.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("6");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ta.setText(ta.getText() + "6");
			}
		});
		btnNewButton_6.setBounds(143, 139, 40, 40);
		contentPane.add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("7");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ta.setText(ta.getText() + "7");
			}
		});
		btnNewButton_7.setBounds(39, 101, 40, 40);
		contentPane.add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("8");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ta.setText(ta.getText() + "8");
			}
		});
		btnNewButton_8.setBounds(91, 101, 40, 40);
		contentPane.add(btnNewButton_8);
		
		JButton btnNewButton_9 = new JButton("9");
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ta.setText(ta.getText() + "9");
			}
		});
		btnNewButton_9.setBounds(143, 101, 40, 40);
		contentPane.add(btnNewButton_9);
		
		JButton btnNewButton_add = new JButton("+");
		btnNewButton_add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ta.setText(ta.getText() + "+");
			}
		});
		btnNewButton_add.setBounds(195, 101, 99, 40);
		contentPane.add(btnNewButton_add);
		
		JButton btnNewButton_sub = new JButton("-");
		btnNewButton_sub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ta.setText(ta.getText() + "-");
			}
		});
		btnNewButton_sub.setBounds(195, 139, 99, 40);
		contentPane.add(btnNewButton_sub);
		
		JButton btnNewButton_mul = new JButton("x");
		btnNewButton_mul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ta.setText(ta.getText() + "x");
			}
		});
		btnNewButton_mul.setBounds(195, 180, 99, 40);
		contentPane.add(btnNewButton_mul);
		
		JButton btnNewButton_div = new JButton("/");
		btnNewButton_div.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ta.setText(ta.getText() + "/");
			}
		});
		btnNewButton_div.setBounds(195, 59, 99, 40);
		contentPane.add(btnNewButton_div);
		
		JButton btnNewButton_c = new JButton("C");
		btnNewButton_c.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ta.setText("");
			}
		});
		btnNewButton_c.setBounds(39, 59, 144, 40);
		contentPane.add(btnNewButton_c);
		
		JButton btnNewButton_dot = new JButton(".");
		btnNewButton_dot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ta.setText(ta.getText() + ".");
			}
		});
		btnNewButton_dot.setBounds(39, 226, 40, 40);
		contentPane.add(btnNewButton_dot);
		
		JButton btnNewButton_ans = new JButton("=");
		btnNewButton_ans.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String exp = ta.getText();
				String opd1 = "", opd2 = "", op = "";
				int i = 0;
				double result = 0;
				while(exp.charAt(i) != '+' && exp.charAt(i) != '-' && exp.charAt(i) != 'x' && exp.charAt(i) != '/') {
					opd1 += exp.charAt(i);
					i++;
				}
				op += exp.charAt(i);
				opd2 = exp.substring(i+1, exp.length());
				
				double n1 = Double.parseDouble(opd1);
				double n2 = Double.parseDouble(opd2);
				try {
					if(op.equals("+")) {
						result = n1 + n2;
					} else if (op.equals("-")) {
						result = n1 - n2;
					} else if (op.equals("x")) {
						result = n1 * n2;
					} else if (op.equals("/")) {
						result = n1 / n2;
					}
					ta.setText(String.valueOf(result));
				} catch (Exception ex) {
					ta.setText(ex.toString());
				}
			}
		});
		btnNewButton_ans.setBounds(195, 226, 99, 40);
		contentPane.add(btnNewButton_ans);
		
	}
}
