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
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Admin extends JFrame {

	private JPanel contentPane;
	private JPanel panel;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Admin frame = new Admin();
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
	public Admin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1372, 723);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 153, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getPanel());
	}
	private JPanel getPanel() {
		if (panel == null) {
			panel = new JPanel();
			panel.setBackground(new Color(255, 204, 0));
			panel.setBounds(0, 0, 1283, 121);
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
			lblNewLabel_1.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					new CashierInfo().setVisible(true);
					dispose();
				}
			});
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
			lblNewLabel_2.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					
					new Transaction().setVisible(true);
					dispose();
					
				}
			});
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
			lblNewLabel_3.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					
					new Stock().setVisible(true);
					dispose();
					
				}
			});
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
			lblNewLabel_4.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					
					new Sale().setVisible(true);
					dispose();
				}
			});
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
			lblNewLabel_5.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					
String lg= JOptionPane.showInputDialog(null,"Logout? yes/no");
					
					if(lg.equalsIgnoreCase("yes")) {
						JOptionPane.showMessageDialog(null, "You have been logged out");
						new Index().setVisible(true);
						dispose();
					}else {
						JOptionPane.showMessageDialog(null, "Logout Failed");
					}
					
				}
			});
			lblNewLabel_5.setIcon(new ImageIcon(new ImageIcon("src\\images\\wrong.jpg").getImage().getScaledInstance(30, 32, 0)));
			lblNewLabel_5.setFont(new Font("Times New Roman", Font.BOLD, 16));
			lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_5.setBounds(1175, 40, 98, 35);
		}
		return lblNewLabel_5;
	}
}
