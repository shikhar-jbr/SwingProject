package com.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LoginForm extends JFrame {

	private JPanel contentPane;
	private JPanel contentPane_1;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JTextField Unametxt;
	private JPasswordField Pswtxt;
	private JButton Loginbtn;
	private JButton Cancelbtn;
	private JLabel Register;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginForm frame = new LoginForm();
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
	public LoginForm() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 704, 535);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getContentPane_1());
	}
	private JPanel getContentPane_1() {
		if (contentPane_1 == null) {
			contentPane_1 = new JPanel();
			contentPane_1.setLayout(null);
			contentPane_1.setBorder(new EmptyBorder(5, 5, 5, 5));
			contentPane_1.setBackground(new Color(255, 153, 0));
			contentPane_1.setBounds(0, 0, 690, 498);
			contentPane_1.add(getLblNewLabel());
			contentPane_1.add(getLblNewLabel_1());
			contentPane_1.add(getUnametxt());
			contentPane_1.add(getPswtxt());
			contentPane_1.add(getLoginbtn());
			contentPane_1.add(getCancelbtn());
			contentPane_1.add(getRegister());
		}
		return contentPane_1;
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("Username");
			lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 20));
			lblNewLabel.setBounds(40, 100, 127, 38);
		}
		return lblNewLabel;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("Password");
			lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
			lblNewLabel_1.setBounds(40, 225, 127, 38);
		}
		return lblNewLabel_1;
	}
	private JTextField getUnametxt() {
		if (Unametxt == null) {
			Unametxt = new JTextField();
			Unametxt.setColumns(10);
			Unametxt.setBounds(291, 106, 295, 38);
		}
		return Unametxt;
	}
	private JPasswordField getPswtxt() {
		if (Pswtxt == null) {
			Pswtxt = new JPasswordField();
			Pswtxt.setBounds(291, 227, 295, 38);
		}
		return Pswtxt;
	}
	private JButton getLoginbtn() {
		if (Loginbtn == null) {
			Loginbtn = new JButton("Login");
			Loginbtn.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					String uname= Unametxt.getText();
					String password= Pswtxt.getText();
					
					if(uname.isEmpty()) {
						
							JOptionPane.showMessageDialog(null,"Enter Username");
							return;
						}
					if(password.isEmpty()) {
						JOptionPane.showMessageDialog(null,"Enter Password");
						return;
					}
					
//					check user in database
					try {
						Class.forName("com.mysql.jdbc.Driver");
						Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root", "");
						
						String sql="select * from register where username='"+uname+"' and password='"+password+"'";
						Statement stm= con.createStatement();
						ResultSet rs= stm.executeQuery(sql);
						
						if(rs.next()) {
							new CashierLogin().setVisible(true);
							dispose();
						}
						else {
							JOptionPane.showMessageDialog(null, "login failed");
						}
						
						
					} catch (Exception e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					
					
				}
			});
			Loginbtn.setFont(new Font("Times New Roman", Font.BOLD, 20));
			Loginbtn.setBackground(new Color(255, 102, 51));
			Loginbtn.setBounds(143, 334, 119, 43);
		}
		return Loginbtn;
	}
	private JButton getCancelbtn() {
		if (Cancelbtn == null) {
			Cancelbtn = new JButton("Cancel");
			Cancelbtn.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					new Index().setVisible(true);
					dispose();
				}
			});
			Cancelbtn.setFont(new Font("Times New Roman", Font.BOLD, 20));
			Cancelbtn.setBackground(new Color(255, 102, 51));
			Cancelbtn.setBounds(392, 334, 119, 43);
		}
		return Cancelbtn;
	}
	private JLabel getRegister() {
		if (Register == null) {
			Register = new JLabel("Click Here to Register");
			Register.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					new Register().setVisible(true);
					dispose();
				}
			});
			Register.setHorizontalAlignment(SwingConstants.CENTER);
			Register.setFont(new Font("Times New Roman", Font.BOLD, 20));
			Register.setBounds(116, 434, 437, 32);
		}
		return Register;
	}
}
