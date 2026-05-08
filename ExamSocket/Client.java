import java.awt.EventQueue;

import java.io.*;
import java.net.*;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.awt.event.ActionEvent;

public class Client extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Client frame = new Client();
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
	public Client() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Client");
		lblNewLabel.setBounds(188, 6, 61, 16);
		contentPane.add(lblNewLabel);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(33, 35, 379, 160);
		contentPane.add(textArea);
		
		textField = new JTextField();
		textField.setBounds(33, 210, 250, 26);
		contentPane.add(textField);
		textField.setColumns(10);
		
		ServerSocket ss;
		Socket s;
		PrintStream ps;
		BufferedReader br;
		BufferedReader kb;
		
		try {
			s = new Socket("localhost", 888);
			
			ps = new PrintStream(s.getOutputStream());
			br = new BufferedReader(new InputStreamReader(s.getInputStream()));
			
			
			new Thread(() -> {
				try {
					String x;
					while((x = br.readLine()) != null) {
						textArea.setText(textArea.getText() + x + "\n");
					}
				} catch (Exception ex) {
					textArea.setText(ex.toString());
				}
			}).start();
			

			
			JButton btnNewButton = new JButton("send");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String x = "Client: " + textField.getText();
					textArea.setText(textArea.getText() + x + "\n");
					ps.println(x);
					textField.setText("");
				}
			});
			btnNewButton.setBounds(295, 207, 117, 29);
			contentPane.add(btnNewButton);
			
			
		} catch (Exception ex) {
			textArea.setText(ex.toString());
		}

	}
}
