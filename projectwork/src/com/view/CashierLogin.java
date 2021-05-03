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
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class CashierLogin extends JFrame {

	private JPanel contentPane;
	private JPanel panel;
	private JLabel label;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CashierLogin frame = new CashierLogin();
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
	public CashierLogin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1248, 729);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 102, 0));
		contentPane.setForeground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getPanel());
	}
	private JPanel getPanel() {
		if (panel == null) {
			panel = new JPanel();
			panel.setBackground(new Color(255, 153, 51));
			panel.setBounds(0, 0, 1248, 118);
			panel.setLayout(null);
			panel.add(getLabel());
			panel.add(getLblNewLabel());
			panel.add(getLblNewLabel_1());
			panel.add(getLblNewLabel_2());
			panel.add(getLblNewLabel_3());
			panel.add(getLblNewLabel_4());
		}
		return panel;
	}
	private JLabel getLabel() {
		if (label == null) {
			label = new JLabel("New label");
			label.setBounds(21, 21, 145, 72);
			label.setIcon(new ImageIcon(new ImageIcon("src\\images\\1519814679293.jpg").getImage().getScaledInstance(label.getWidth(), label.getHeight(), 0)));
			label.setBorder(new LineBorder(new Color(0, 0, 0)));
			
		}
		return label;
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("Create Bill");
			lblNewLabel.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					new CreateBill().setVisible(true);
					dispose();
				}
			});
			lblNewLabel.setBounds(236, 39, 145, 41);
			lblNewLabel.setIcon(new ImageIcon(new ImageIcon("src\\images\\download.jpg").getImage().getScaledInstance(30, 41, 0)));
			lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 18));
			lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
			label.setBorder(new LineBorder(new Color(0, 0, 0)));
			
		}
		return lblNewLabel;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("Search Bill");
			lblNewLabel_1.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					new SearchBill().setVisible(true);
					dispose();
				}
			});
			lblNewLabel_1.setIcon(new ImageIcon(new ImageIcon("src\\images\\download.png").getImage().getScaledInstance(30, 41, 0)));
			lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 18));
			lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_1.setBounds(451, 39, 145, 41);
		}
		return lblNewLabel_1;
	}
	private JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("Product Information");
			lblNewLabel_2.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					new ProductInformation().setVisible(true);
					dispose();
				}
			});
			lblNewLabel_2.setIcon(new ImageIcon(new ImageIcon("src\\images\\purse-handbag-line-icon-outline-vector-sign-linear-style-pictogram-isolated-white-symbol-logo-illustration-editable-stroke-95992220.jpg").getImage().getScaledInstance(30, 41, 0)));
			lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 18));
			lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_2.setBounds(666, 39, 205, 41);
		}
		return lblNewLabel_2;
	}
	private JLabel getLblNewLabel_3() {
		if (lblNewLabel_3 == null) {
			lblNewLabel_3 = new JLabel("Sales");
			lblNewLabel_3.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					new Sales().setVisible(true);
					dispose();
				}
			});
			lblNewLabel_3.setIcon(new ImageIcon(new ImageIcon("src\\images\\sale.png").getImage().getScaledInstance(30, 41, 0)));
			lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 18));
			lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_3.setBounds(911, 39, 145, 41);
		}
		return lblNewLabel_3;
	}
	private JLabel getLblNewLabel_4() {
		if (lblNewLabel_4 == null) {
			lblNewLabel_4 = new JLabel("Exit");
			lblNewLabel_4.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					String s= JOptionPane.showInputDialog("You want to logout? yes/no");
					if(s.equalsIgnoreCase("yes")) {
						new LoginForm().setVisible(true);
						dispose();
					}else {
						JOptionPane.showMessageDialog(null, "Logout unsuccesful");
					}
				}
			});
			lblNewLabel_4.setIcon(new ImageIcon(new ImageIcon("src\\images\\wrong.jpg").getImage().getScaledInstance(30, 41, 0)));
			lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_4.setFont(new Font("Times New Roman", Font.BOLD, 18));
			lblNewLabel_4.setBounds(1107, 39, 102, 41);
		}
		return lblNewLabel_4;
	}
}
