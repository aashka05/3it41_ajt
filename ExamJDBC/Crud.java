import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;

import java.sql.*;
import javax.sql.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class Crud extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField tfName;
	private JTextField tfId;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) throws Exception {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Crud frame = new Crud();
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
	public Crud() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		tfName = new JTextField();
		tfName.setBounds(92, 52, 130, 26);
		contentPane.add(tfName);
		tfName.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Enter name");
		lblNewLabel.setBounds(19, 57, 83, 16);
		contentPane.add(lblNewLabel);
		
		JLabel lblEnterId = new JLabel("Enter id");
		lblEnterId.setBounds(19, 16, 83, 16);
		contentPane.add(lblEnterId);
		
		tfId = new JTextField();
		tfId.setColumns(10);
		tfId.setBounds(92, 11, 130, 26);
		contentPane.add(tfId);

		
		JTextArea result = new JTextArea();
		result.setBounds(21, 207, 239, 230);
		contentPane.add(result);
		
		JButton btnDelete = new JButton("delete");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id = tfId.getText();
				try {
					Class.forName("com.mysql.jdbc.Driver");
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "");
					Statement stmt = con.createStatement();
					
					String query = "DELETE FROM stu WHERE id=" + id;
					
					int rs = stmt.executeUpdate(query);
					if(rs > 0) {
						result.setText("Data deleted");
					}
				} catch (Exception ex) {
					result.setText(ex.toString());
				}
			}
		});
		btnDelete.setBounds(140, 171, 117, 29);
		contentPane.add(btnDelete);
		
		JButton btnSelect = new JButton("select");
		btnSelect.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = tfName.getText();
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "admin@123");
					Statement stmt = con.createStatement();
					
					String query = "SELECT * FROM stu";
					String ans = "";
					
					ResultSet rs = stmt.executeQuery(query);
					while(rs.next()) {
						ans += ("ID: " + rs.getInt(1) + " ");
						ans += ("Name: " + rs.getString(2) + "\n");
					}
					result.setLineWrap(true);
					result.setWrapStyleWord(true);
					result.setText(ans);
				} catch (Exception ex) {
					result.setText(ex.toString());
				}
				
			}
		});
		btnSelect.setBounds(11, 130, 117, 29);
		contentPane.add(btnSelect);
		
		JButton btnInsert = new JButton("insert");
		btnInsert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = tfName.getText();
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "admin@123");
					Statement stmt = con.createStatement();
					
					String query = "INSERT INTO stu (name) VALUES ('" + name + "')";
					String ans = "";
					
					long rs = stmt.executeUpdate(query);
					if(rs > 0) {
						result.setText("Data inserted");
					}
				} catch (Exception ex) {
					result.setText(ex.toString());
				}
			}
		});
		btnInsert.setBounds(140, 130, 117, 29);
		contentPane.add(btnInsert);
		
		JButton btnUpdate = new JButton("update");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id = tfId.getText();
				String name = tfName.getText();
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "admin@123");
					Statement stmt = con.createStatement();
					
					String query = "UPDATE stu SET name='" + name + "' WHERE id=" + id;
					
					int rs = stmt.executeUpdate(query);
					if(rs > 0) {
						result.setText("Data updated");
					}
				} catch (Exception ex) {
					result.setText(ex.toString());
				}
			}
		});
		btnUpdate.setBounds(11, 171, 117, 29);
		contentPane.add(btnUpdate);

	}

}
