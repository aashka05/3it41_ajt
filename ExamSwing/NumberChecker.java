import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.lang.Math;

public class NumberChecker extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField t1;
	private JTextField result;
	private JButton btnArmstrong;
	private JButton btnPerfect;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JLabel lblNewLabel_1;
	private JTextField t2;
	private JButton btnNewButton_3;
	private JLabel lblNewLabel_2;
	private JButton btnNewButton;
	private JLabel lblNewLabel_3;
	private JButton btnSpy;
	private JLabel lblNewLabel_4;

	int toggle = 0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NumberChecker frame = new NumberChecker();
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
	public NumberChecker() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		t1 = new JTextField();
		t1.setBounds(147, 20, 53, 26);
		contentPane.add(t1);
		t1.setColumns(10);
		

		t2 = new JTextField();
		t2.setColumns(10);
		t2.setBounds(239, 20, 53, 26);
		contentPane.add(t2);
		
		JLabel lblNewLabel = new JLabel("Fine between");
		lblNewLabel.setBounds(55, 25, 93, 16);
		contentPane.add(lblNewLabel);
		
		result = new JTextField();
		result.setBounds(55, 227, 389, 26);
		contentPane.add(result);
		result.setColumns(10);
		
		JButton btnPalindrome = new JButton("palindrome");
		btnPalindrome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int n1 = Integer.parseInt(t1.getText());
				int n2 = Integer.parseInt(t2.getText());
				String l = "";
				for(int i=n1; i <= n2; i++) {
					int rev = 0;
					int dummy = i;
					while(dummy > 0) {
						rev = (rev * 10 + (dummy % 10));
						dummy /= 10;
					}
					if(rev == i) {
						l += (i + " ");
					}
				}
				result.setText(l);
			}
		});
		btnPalindrome.setBounds(48, 58, 117, 29);
		contentPane.add(btnPalindrome);
		
		btnArmstrong = new JButton("armstrong");
		btnArmstrong.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int n1 = Integer.parseInt(t1.getText());
				int n2 = Integer.parseInt(t2.getText());
				String l = "";								
				for(int i=n1; i <= n2; i++) {
					int n = (String.valueOf(i).length());
					int dummy = i;
					int sum = 0;
					while(dummy > 0) {
						sum += Math.pow((dummy % 10), n);
						dummy /= 10;
					}
					if(sum == i) {
						l += (i + " ");
					}
				}
				result.setText(l);
			}
		});
		btnArmstrong.setBounds(172, 58, 117, 29);
		contentPane.add(btnArmstrong);
		
		btnPerfect = new JButton("perfect");
		btnPerfect.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int n1 = Integer.parseInt(t1.getText());
				int n2 = Integer.parseInt(t2.getText());
				String l = "";								
				for(int i=n1; i <= n2; i++) {
					int dummy = i;
					int sum = 0;
					int j;
					for(j = 1; j <= Math.sqrt(i); j++) {
						if(i % j == 0) {
							sum += j;
							sum += (i/j);							
						}
					}
					if(j % i == 0) {
						sum += j;
					}
					if(sum == i) {
						l += (i + " ");
					}
				}
				result.setText(l);
			}
		});
		btnPerfect.setBounds(48, 99, 117, 29);
		contentPane.add(btnPerfect);
		btnNewButton_1 = new JButton("even/odd");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int n1 = Integer.parseInt(t1.getText());
				int n2 = Integer.parseInt(t2.getText());
				String l = "";
				if (toggle == 0) {
					l = "even: ";
					for(int i=n1; i <= n2; i++) {
						if(i % 2 == 0) {
							l += (i + " ");
						}
					}
					toggle = 1;
				} else {
					l = "odd: ";
					for(int i=n1; i <= n2; i++) {
						if(i % 2 != 0) {
							l += (i + " ");
						}
					}
					toggle = 0;
				}
				result.setText(l);
			}
		});
		btnNewButton_1.setBounds(172, 99, 117, 29);
		contentPane.add(btnNewButton_1);
		
		btnNewButton_2 = new JButton("prime");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int n1 = Integer.parseInt(t1.getText());
				int n2 = Integer.parseInt(t2.getText());
				String l = "";								
				for(int i=n1; i <= n2; i++) {
					int flag = 0;
					int dummy = i;
					for(int j = 2; j <= (i/2); j++) {
						if(i % j == 0) {
							flag = 1;
							break;
						}
					}
					if(flag == 0) {
						l += (i + " ");
					}
				}
				result.setText(l);
			}
		});
		btnNewButton_2.setBounds(48, 140, 117, 29);
		contentPane.add(btnNewButton_2);
		
		lblNewLabel_1 = new JLabel("to");
		lblNewLabel_1.setBounds(212, 25, 61, 16);
		contentPane.add(lblNewLabel_1);
		
		btnNewButton_3 = new JButton("automorphic");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int n1 = Integer.parseInt(t1.getText());
				int n2 = Integer.parseInt(t2.getText());
				String l = "";								
				for(int i=n1; i <= n2; i++) {
					int sq = i * i;
					int len_n = String.valueOf(i).length();
					double cmp = sq % (Math.pow(10, len_n));
					if(cmp == i) {
						l += (i + " ");
					}
				}
				result.setText(l);
			}
		});
		btnNewButton_3.setBounds(172, 140, 117, 29);
		contentPane.add(btnNewButton_3);
		
		lblNewLabel_2 = new JLabel("sq's last digits is itself ");
		lblNewLabel_2.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
		lblNewLabel_2.setBounds(182, 127, 117, 16);
		contentPane.add(lblNewLabel_2);
		
		btnNewButton = new JButton("pronic");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int n1 = Integer.parseInt(t1.getText());
				int n2 = Integer.parseInt(t2.getText());
				String l = "";								
				for(int i=n1; i <= n2; i++) {
					int flag = 0;
					for(int j = 1; j < i; j++) {
						if(j * (j+1) == i) {
							flag = 1;
							break;
						}
					}
					if(flag == 1) {
						l += (i + " ");
					}
				}
				result.setText(l);
			}
		});
		btnNewButton.setBounds(172, 181, 117, 29);
		contentPane.add(btnNewButton);
		
		lblNewLabel_3 = new JLabel("product of 2 consecutives");
		lblNewLabel_3.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
		lblNewLabel_3.setBounds(182, 169, 130, 16);
		contentPane.add(lblNewLabel_3);
		
		btnSpy = new JButton("spy");
		btnSpy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int n1 = Integer.parseInt(t1.getText());
				int n2 = Integer.parseInt(t2.getText());
				String l = "";								
				for(int i=n1; i <= n2; i++) {
					int sum = 0;
					int product = 1;
					int dummy = i;
					while(dummy > 0) {
						int last = dummy % 10;
						sum += last;
						product *= last;
						dummy /= 10;
					}
					if(sum == product) {
						l += (i + " ");
					}
				}
				result.setText(l);
			}
		});
		btnSpy.setBounds(48, 181, 117, 29);
		contentPane.add(btnSpy);
		
		lblNewLabel_4 = new JLabel("sum = product of digits");
		lblNewLabel_4.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
		lblNewLabel_4.setBounds(35, 169, 130, 16);
		contentPane.add(lblNewLabel_4);

	}
}
