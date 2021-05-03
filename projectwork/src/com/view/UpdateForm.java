package com.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.util.List;

import javax.swing.JInternalFrame;
import javax.swing.JTextField;
import javax.swing.JPasswordField;

import com.model.Cashier;
import com.service.CashierService;
import com.service.CashierServiceImpl;
import com.toedter.calendar.JDateChooser;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Date;
import java.awt.event.ActionEvent;

public class UpdateForm extends JFrame {

	private JPanel contentPane;
	private JPanel panel;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JInternalFrame internalFrame;
	private JLabel lblNewLabel_6;
	private JLabel lblNewLabel_7;
	private JLabel lblNewLabel_8;
	private JLabel lblNewLabel_9;
	private JLabel lblNewLabel_10;
	private JLabel lblNewLabel_11;
	private JLabel lblNewLabel_12;
	private JLabel lblNewLabel_13;
	private JTextField Fnametxt;
	private JTextField Lnametxt;
	private JTextField Emailtxt;
	private JTextField Unametxt;
	private JPasswordField Pswtxt;
	private JDateChooser Dobc;
	private JTextField Addresstxt;
	private JTextField Phonetxt;
	private JButton Updatebtn;
	private JButton Cancelbtn;
	private int sid;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UpdateForm frame = new UpdateForm();
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
	public UpdateForm() {
		setTitle("Admin");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1372, 723);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 153, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getPanel());
		contentPane.add(getInternalFrame());
	}
	private JPanel getPanel() {
		if (panel == null) {
			panel = new JPanel();
			panel.setBackground(new Color(255, 204, 0));
			panel.setBounds(0, 0, 1283, 104);
			panel.setLayout(null);
			panel.add(getLblNewLabel());
			panel.add(getLblNewLabel_1());
			panel.add(getLblNewLabel_2());
			panel.add(getLblNewLabel_3());
			panel.add(getLblNewLabel_4());
			panel.add(getLblNewLabel_5());
		}
		return panel;
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("New label");
			lblNewLabel.setBounds(10, 11, 145, 72);
			lblNewLabel.setIcon(new ImageIcon(new ImageIcon("src\\images\\1519814679293.jpg").getImage().getScaledInstance(lblNewLabel.getWidth(), lblNewLabel.getHeight(), 0)));
			lblNewLabel.setBorder(new LineBorder(new Color(0, 0, 0)));
			
			
		}
		return lblNewLabel;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("Cashier");
			lblNewLabel_1.setIcon(new ImageIcon(new ImageIcon("src\\images\\user.png").getImage().getScaledInstance(30, 32, 0)));
			lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
			lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_1.setBounds(241, 40, 135, 35);
		}
		return lblNewLabel_1;
	}
	private JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("Transactions");
			lblNewLabel_2.setIcon(new ImageIcon(new ImageIcon("src\\images\\transactions.jpg").getImage().getScaledInstance(30, 32, 0)));
			lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 16));
			lblNewLabel_2.setBounds(403, 40, 135, 35);
		}
		return lblNewLabel_2;
	}
	private JLabel getLblNewLabel_3() {
		if (lblNewLabel_3 == null) {
			lblNewLabel_3 = new JLabel("Stock");
			lblNewLabel_3.setIcon(new ImageIcon(new ImageIcon("src\\images\\stock.png").getImage().getScaledInstance(30, 32, 0)));
			lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 16));
			lblNewLabel_3.setBounds(579, 40, 145, 35);
		}
		return lblNewLabel_3;
	}
	private JLabel getLblNewLabel_4() {
		if (lblNewLabel_4 == null) {
			lblNewLabel_4 = new JLabel("Sales");
			lblNewLabel_4.setIcon(new ImageIcon(new ImageIcon("src\\images\\sale.png").getImage().getScaledInstance(30, 32, 0)));
			lblNewLabel_4.setFont(new Font("Times New Roman", Font.BOLD, 16));
			lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_4.setBounds(751, 40, 135, 35);
		}
		return lblNewLabel_4;
	}
	private JLabel getLblNewLabel_5() {
		if (lblNewLabel_5 == null) {
			lblNewLabel_5 = new JLabel("Exit");
			lblNewLabel_5.setIcon(new ImageIcon(new ImageIcon("src\\images\\wrong.jpg").getImage().getScaledInstance(30, 32, 0)));
			lblNewLabel_5.setFont(new Font("Times New Roman", Font.BOLD, 16));
			lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_5.setBounds(1175, 40, 98, 35);
		}
		return lblNewLabel_5;
	}
	private JInternalFrame getInternalFrame() {
		if (internalFrame == null) {
			internalFrame = new JInternalFrame("New JInternalFrame");
			internalFrame.getContentPane().setBackground(new Color(255, 204, 0));
			internalFrame.setBounds(100, 115, 1063, 560);
			internalFrame.getContentPane().setLayout(null);
			internalFrame.getContentPane().add(getLblNewLabel_6());
			internalFrame.getContentPane().add(getLblNewLabel_7());
			internalFrame.getContentPane().add(getLblNewLabel_8());
			internalFrame.getContentPane().add(getLblNewLabel_9());
			internalFrame.getContentPane().add(getLblNewLabel_10());
			internalFrame.getContentPane().add(getLblNewLabel_11());
			internalFrame.getContentPane().add(getLblNewLabel_12());
			internalFrame.getContentPane().add(getLblNewLabel_13());
			internalFrame.getContentPane().add(getFnametxt());
			internalFrame.getContentPane().add(getLnametxt());
			internalFrame.getContentPane().add(getEmailtxt());
			internalFrame.getContentPane().add(getUnametxt());
			internalFrame.getContentPane().add(getPswtxt());
			internalFrame.getContentPane().add(getDobc());
			internalFrame.getContentPane().add(getAddresstxt());
			internalFrame.getContentPane().add(getPhonetxt());
			internalFrame.getContentPane().add(getUpdatebtn());
			internalFrame.getContentPane().add(getCancelbtn());
			internalFrame.setVisible(true);
		}
		return internalFrame;
	}
	private JLabel getLblNewLabel_6() {
		if (lblNewLabel_6 == null) {
			lblNewLabel_6 = new JLabel("First Name");
			lblNewLabel_6.setFont(new Font("Times New Roman", Font.BOLD, 16));
			lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_6.setBounds(320, 29, 105, 26);
		}
		return lblNewLabel_6;
	}
	private JLabel getLblNewLabel_7() {
		if (lblNewLabel_7 == null) {
			lblNewLabel_7 = new JLabel("Last Name");
			lblNewLabel_7.setFont(new Font("Times New Roman", Font.BOLD, 16));
			lblNewLabel_7.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_7.setBounds(320, 79, 105, 26);
		}
		return lblNewLabel_7;
	}
	private JLabel getLblNewLabel_8() {
		if (lblNewLabel_8 == null) {
			lblNewLabel_8 = new JLabel("Email");
			lblNewLabel_8.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_8.setFont(new Font("Times New Roman", Font.BOLD, 16));
			lblNewLabel_8.setBounds(320, 129, 105, 26);
		}
		return lblNewLabel_8;
	}
	private JLabel getLblNewLabel_9() {
		if (lblNewLabel_9 == null) {
			lblNewLabel_9 = new JLabel("Username");
			lblNewLabel_9.setFont(new Font("Times New Roman", Font.BOLD, 16));
			lblNewLabel_9.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_9.setBounds(320, 179, 105, 26);
		}
		return lblNewLabel_9;
	}
	private JLabel getLblNewLabel_10() {
		if (lblNewLabel_10 == null) {
			lblNewLabel_10 = new JLabel("Password");
			lblNewLabel_10.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_10.setFont(new Font("Times New Roman", Font.BOLD, 16));
			lblNewLabel_10.setBounds(320, 229, 105, 26);
		}
		return lblNewLabel_10;
	}
	private JLabel getLblNewLabel_11() {
		if (lblNewLabel_11 == null) {
			lblNewLabel_11 = new JLabel("D.O.B");
			lblNewLabel_11.setFont(new Font("Times New Roman", Font.BOLD, 16));
			lblNewLabel_11.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_11.setBounds(320, 279, 105, 26);
		}
		return lblNewLabel_11;
	}
	private JLabel getLblNewLabel_12() {
		if (lblNewLabel_12 == null) {
			lblNewLabel_12 = new JLabel("Address");
			lblNewLabel_12.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_12.setFont(new Font("Times New Roman", Font.BOLD, 16));
			lblNewLabel_12.setBounds(320, 329, 105, 26);
		}
		return lblNewLabel_12;
	}
	private JLabel getLblNewLabel_13() {
		if (lblNewLabel_13 == null) {
			lblNewLabel_13 = new JLabel("Phone");
			lblNewLabel_13.setFont(new Font("Times New Roman", Font.BOLD, 16));
			lblNewLabel_13.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_13.setBounds(320, 379, 105, 26);
		}
		return lblNewLabel_13;
	}
	private JTextField getFnametxt() {
		if (Fnametxt == null) {
			Fnametxt = new JTextField();
			Fnametxt.setBounds(454, 29, 204, 26);
			Fnametxt.setColumns(10);
		}
		return Fnametxt;
	}
	private JTextField getLnametxt() {
		if (Lnametxt == null) {
			Lnametxt = new JTextField();
			Lnametxt.setBounds(454, 79, 204, 26);
			Lnametxt.setColumns(10);
		}
		return Lnametxt;
	}
	private JTextField getEmailtxt() {
		if (Emailtxt == null) {
			Emailtxt = new JTextField();
			Emailtxt.setBounds(454, 129, 204, 26);
			Emailtxt.setColumns(10);
		}
		return Emailtxt;
	}
	private JTextField getUnametxt() {
		if (Unametxt == null) {
			Unametxt = new JTextField();
			Unametxt.setBounds(454, 179, 204, 26);
			Unametxt.setColumns(10);
		}
		return Unametxt;
	}
	private JPasswordField getPswtxt() {
		if (Pswtxt == null) {
			Pswtxt = new JPasswordField();
			Pswtxt.setBounds(454, 229, 204, 26);
		}
		return Pswtxt;
	}
	private JDateChooser getDobc() {
		if (Dobc == null) {
			Dobc = new JDateChooser();
			Dobc.setBounds(454, 279, 204, 26);
		}
		return Dobc;
	}
	private JTextField getAddresstxt() {
		if (Addresstxt == null) {
			Addresstxt = new JTextField();
			Addresstxt.setBounds(454, 329, 204, 26);
			Addresstxt.setColumns(10);
		}
		return Addresstxt;
	}
	private JTextField getPhonetxt() {
		if (Phonetxt == null) {
			Phonetxt = new JTextField();
			Phonetxt.setBounds(454, 379, 204, 26);
			Phonetxt.setColumns(10);
		}
		return Phonetxt;
	}
	private JButton getUpdatebtn() {
		if (Updatebtn == null) {
			Updatebtn = new JButton("Update");
			Updatebtn.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					Cashier s= new Cashier();
					
					s.setId(sid);
					s.setFname(Fnametxt.getText());
					s.setLname(Lnametxt.getText());
					s.setAddress(Addresstxt.getText());
					s.setUname(Unametxt.getText());
					s.setPassword(Pswtxt.getText());
					s.setEmali(Emailtxt.getText());
					s.setPhone(Phonetxt.getText());
					s.setDob(new Date(Dobc.getDate().getTime()));
					
					CashierService cc= new CashierServiceImpl();
					if(cc.updateCashier(s)) {
						JOptionPane.showMessageDialog(null, "Update Success");
						new CashierInfo().setVisible(true);
						dispose();
					}else {
						JOptionPane.showMessageDialog(null, "Update Failed");
					}
					
				}
			});
			Updatebtn.setBackground(new Color(255, 102, 0));
			Updatebtn.setFont(new Font("Times New Roman", Font.BOLD, 16));
			Updatebtn.setBounds(443, 450, 89, 35);
		}
		return Updatebtn;
	}
	private JButton getCancelbtn() {
		if (Cancelbtn == null) {
			Cancelbtn = new JButton("Cancel");
			Cancelbtn.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					JOptionPane.showMessageDialog(null, "Info Update Failed");
					new CashierInfo().setVisible(true);
					dispose();
				}
				
			});
			Cancelbtn.setBackground(new Color(255, 102, 0));
			Cancelbtn.setFont(new Font("Times New Roman", Font.BOLD, 16));
			Cancelbtn.setBounds(569, 450, 89, 35);
		}
		return Cancelbtn;
	}
	
	public void setDataForEdit(int id) {
		
		sid=id;
		CashierService cc= new CashierServiceImpl();
		Cashier s= cc.getCashierById(id);
		
		Fnametxt.setText(s.getFname());
		Lnametxt.setText(s.getLname());
		Addresstxt.setText(s.getAddress());
		Unametxt.setText(s.getUname());
		Pswtxt.setText(s.getPassword());
		Dobc.setDate(s.getDob());
		Emailtxt.setText(s.getEmali());
		Phonetxt.setText(s.getPhone());
		
	}
	
}	
	
