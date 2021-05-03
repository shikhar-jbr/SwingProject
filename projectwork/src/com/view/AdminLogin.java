package com.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AdminLogin extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JTextField Unametxt;
	private JPasswordField Pswtxt;
	private JButton Loginbtn;
	private JButton Cancelbtn;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminLogin frame = new AdminLogin();
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
	public AdminLogin() {
		setTitle("Login Form");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 704, 535);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 153, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLabel_1());
		contentPane.add(getLabel_2());
		contentPane.add(getUnametxt());
		contentPane.add(getPswtxt());
		contentPane.add(getLoginbtn());
		contentPane.add(getCancelbtn());
	}
	private JLabel getLabel_1() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("Username");
			lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 20));
			lblNewLabel.setBounds(40, 100, 127, 38);
		}
		return lblNewLabel;
	}
	private JLabel getLabel_2() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("Password");
			lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
			lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_1.setBounds(40, 225, 127, 38);
		}
		return lblNewLabel_1;
	}
	private JTextField getUnametxt() {
		if (Unametxt == null) {
			Unametxt = new JTextField();
			Unametxt.setBounds(291, 106, 295, 38);
			Unametxt.setColumns(10);
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
					
					 String username= Unametxt.getText();
					 String psw= Pswtxt.getText();
					
					if(username.contentEquals("shikhar_jbr") && psw.contentEquals("Shikhar@9")) {
						new Admin().setVisible(true);
						dispose();
					}else {
						JOptionPane.showMessageDialog(null, "Invalid Admin");
					}
					
				}
			});
			Loginbtn.setBackground(new Color(255, 102, 51));
			Loginbtn.setFont(new Font("Times New Roman", Font.BOLD, 20));
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
}
