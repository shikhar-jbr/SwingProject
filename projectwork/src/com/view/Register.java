package com.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;

import com.model.Cashier;
import com.service.CashierService;
import com.service.CashierServiceImpl;
import com.toedter.calendar.JDateChooser;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.Date;
import java.awt.event.ActionEvent;

public class Register extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_6;
	private JLabel lblNewLabel_7;
	private JTextField Fnametxt;
	private JTextField Lnametxt;
	private JTextField Emailtxt;
	private JTextField Unametxt;
	private JPasswordField Pswtxt;
	private JPasswordField Repswtxt;
	private JTextArea Addresstxt;
	private JDateChooser Dobc;
	private JButton Registerbtn;
	private JButton Cancelbtn;
	private JLabel lblNewLabel_8;
	private JTextField Phonetxt;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Register frame = new Register();
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
	public Register() {
		setTitle("Register");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 667, 732);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 153, 51));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblNewLabel());
		contentPane.add(getLblNewLabel_1());
		contentPane.add(getLblNewLabel_2());
		contentPane.add(getLblNewLabel_3());
		contentPane.add(getLblNewLabel_4());
		contentPane.add(getLblNewLabel_5());
		contentPane.add(getLblNewLabel_6());
		contentPane.add(getLblNewLabel_7());
		contentPane.add(getFnametxt());
		contentPane.add(getLnametxt());
		contentPane.add(getEmailtxt());
		contentPane.add(getUnametxt());
		contentPane.add(getPswtxt());
		contentPane.add(getRepswtxt());
		contentPane.add(getAddresstxt());
		contentPane.add(getDobc());
		contentPane.add(getRegisterbtn());
		contentPane.add(getCancelbtn());
		contentPane.add(getLblNewLabel_8());
		contentPane.add(getPhonetxt());
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("First Name");
			lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 20));
			lblNewLabel.setBounds(25, 50, 110, 32);
		}
		return lblNewLabel;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("Last Name");
			lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
			lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_1.setBounds(25, 110, 110, 32);
		}
		return lblNewLabel_1;
	}
	private JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("Email");
			lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 20));
			lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_2.setBounds(25, 170, 110, 32);
		}
		return lblNewLabel_2;
	}
	private JLabel getLblNewLabel_3() {
		if (lblNewLabel_3 == null) {
			lblNewLabel_3 = new JLabel("Username");
			lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 20));
			lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_3.setBounds(25, 230, 110, 32);
		}
		return lblNewLabel_3;
	}
	private JLabel getLblNewLabel_4() {
		if (lblNewLabel_4 == null) {
			lblNewLabel_4 = new JLabel("Password");
			lblNewLabel_4.setFont(new Font("Times New Roman", Font.BOLD, 20));
			lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_4.setBounds(25, 290, 110, 32);
		}
		return lblNewLabel_4;
	}
	private JLabel getLblNewLabel_5() {
		if (lblNewLabel_5 == null) {
			lblNewLabel_5 = new JLabel("Retype Pass");
			lblNewLabel_5.setFont(new Font("Times New Roman", Font.BOLD, 20));
			lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_5.setBounds(25, 350, 110, 32);
		}
		return lblNewLabel_5;
	}
	private JLabel getLblNewLabel_6() {
		if (lblNewLabel_6 == null) {
			lblNewLabel_6 = new JLabel("D.O.B");
			lblNewLabel_6.setFont(new Font("Times New Roman", Font.BOLD, 20));
			lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_6.setBounds(25, 410, 110, 32);
		}
		return lblNewLabel_6;
	}
	private JLabel getLblNewLabel_7() {
		if (lblNewLabel_7 == null) {
			lblNewLabel_7 = new JLabel("Address");
			lblNewLabel_7.setFont(new Font("Times New Roman", Font.BOLD, 20));
			lblNewLabel_7.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_7.setBounds(25, 470, 110, 32);
		}
		return lblNewLabel_7;
	}
	private JTextField getFnametxt() {
		if (Fnametxt == null) {
			Fnametxt = new JTextField();
			Fnametxt.setBounds(229, 50, 279, 32);
			Fnametxt.setColumns(10);
		}
		return Fnametxt;
	}
	private JTextField getLnametxt() {
		if (Lnametxt == null) {
			Lnametxt = new JTextField();
			Lnametxt.setBounds(229, 110, 279, 32);
			Lnametxt.setColumns(10);
		}
		return Lnametxt;
	}
	private JTextField getEmailtxt() {
		if (Emailtxt == null) {
			Emailtxt = new JTextField();
			Emailtxt.setBounds(229, 170, 279, 32);
			Emailtxt.setColumns(10);
		}
		return Emailtxt;
	}
	private JTextField getUnametxt() {
		if (Unametxt == null) {
			Unametxt = new JTextField();
			Unametxt.setBounds(229, 230, 279, 32);
			Unametxt.setColumns(10);
		}
		return Unametxt;
	}
	private JPasswordField getPswtxt() {
		if (Pswtxt == null) {
			Pswtxt = new JPasswordField();
			Pswtxt.setBounds(229, 290, 279, 32);
		}
		return Pswtxt;
	}
	private JPasswordField getRepswtxt() {
		if (Repswtxt == null) {
			Repswtxt = new JPasswordField();
			Repswtxt.setBounds(229, 350, 279, 32);
		}
		return Repswtxt;
	}
	private JTextArea getAddresstxt() {
		if (Addresstxt == null) {
			Addresstxt = new JTextArea();
			Addresstxt.setBounds(229, 470, 279, 32);
		}
		return Addresstxt;
	}
	private JDateChooser getDobc() {
		if (Dobc == null) {
			Dobc = new JDateChooser();
			Dobc.setBounds(229, 410, 279, 32);
		}
		return Dobc;
	}
	private JButton getRegisterbtn() {
		if (Registerbtn == null) {
			Registerbtn = new JButton("Register");
			Registerbtn.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					
					if(Fnametxt.getText().isEmpty()&&Lnametxt.getText().isEmpty()&&Emailtxt.getText().isEmpty()&&Pswtxt.getText().isEmpty()&&Repswtxt.getText().isEmpty()&&Addresstxt.getText().isEmpty()&&Unametxt.getText().isEmpty()) {
						JOptionPane.showMessageDialog(null, "Enter every field");
					}else {
						
						
						if(Pswtxt.getText().equals(Repswtxt.getText())) {
							
							Cashier s= new Cashier();
							
							s.setFname(Fnametxt.getText());
							s.setLname(Lnametxt.getText());
							s.setUname(Unametxt.getText());
							s.setAddress(Addresstxt.getText());
							s.setPassword(Pswtxt.getText());
							s.setDob(new Date(Dobc.getDate().getTime()));
							s.setEmali(Emailtxt.getText());
							s.setPhone(Phonetxt.getText());
							
							CashierService ss= new CashierServiceImpl();
							
							if(ss.addCashier(s)) {
								new LoginForm().setVisible(true);
								dispose();
								
							}else {
								JOptionPane.showMessageDialog(null, "signup failed");
							}
							
						}else {
							JOptionPane.showMessageDialog(null, "Password doesn't match");
						}
					}
					
					
				}
			});
			Registerbtn.setBackground(new Color(255, 102, 51));
			Registerbtn.setBounds(133, 610, 133, 43);
		}
		return Registerbtn;
	}
	private JButton getCancelbtn() {
		if (Cancelbtn == null) {
			Cancelbtn = new JButton("Cancel");
			Cancelbtn.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					new LoginForm().setVisible(true);
					dispose();
				}
			});
			Cancelbtn.setBackground(new Color(255, 102, 51));
			Cancelbtn.setBounds(389, 610, 133, 43);
		}
		return Cancelbtn;
	}
	private JLabel getLblNewLabel_8() {
		if (lblNewLabel_8 == null) {
			lblNewLabel_8 = new JLabel("Phone");
			lblNewLabel_8.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_8.setFont(new Font("Times New Roman", Font.BOLD, 20));
			lblNewLabel_8.setBounds(25, 530, 110, 32);
		}
		return lblNewLabel_8;
	}
	private JTextField getPhonetxt() {
		if (Phonetxt == null) {
			Phonetxt = new JTextField();
			Phonetxt.setBounds(229, 530, 279, 32);
			Phonetxt.setColumns(10);
		}
		return Phonetxt;
	}
}
