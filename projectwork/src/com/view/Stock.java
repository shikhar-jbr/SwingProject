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
import java.util.ArrayList;
import java.util.List;

import javax.swing.JInternalFrame;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import com.model.Product;
import com.service.ProductService;
import com.service.ProductServiceImpl;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Stock extends JFrame {

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
	private JButton Addbtn;
	private JButton Updatebtn;
	private JScrollPane scrollPane;
	private JTextField Idtxt;
	private JTextField Nametxt;
	private JTextField Quantitytxt;
	private JTextField Mrptxt;
	private JTable table;
	private JLabel lblNewLabel_11;
	private JTextField Amounttxt;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Stock frame = new Stock();
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
	public Stock() {
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
	private JInternalFrame getInternalFrame() {
		if (internalFrame == null) {
			internalFrame = new JInternalFrame("Stock");
			internalFrame.getContentPane().setBackground(new Color(255, 204, 0));
			internalFrame.getContentPane().setLayout(null);
			internalFrame.getContentPane().add(getLabel_1());
			internalFrame.getContentPane().add(getLabel_2());
			internalFrame.getContentPane().add(getLabel_3());
			internalFrame.getContentPane().add(getLabel_4());
			internalFrame.getContentPane().add(getLabel_5());
			internalFrame.getContentPane().add(getAddbtn());
			internalFrame.getContentPane().add(getUpdatebtn());
			internalFrame.getContentPane().add(getScrollPane());
			internalFrame.getContentPane().add(getIdtxt());
			internalFrame.getContentPane().add(getNametxt());
			internalFrame.getContentPane().add(getQuantitytxt());
			internalFrame.getContentPane().add(getMrptxt());
			internalFrame.getContentPane().add(getLblNewLabel_11());
			internalFrame.getContentPane().add(getAmounttxt());
			internalFrame.setBounds(91, 132, 1101, 554);
			internalFrame.setVisible(true);
			displayData();
		}
		return internalFrame;
	}
	private JLabel getLabel_1() {
		if (lblNewLabel_6 == null) {
			lblNewLabel_6 = new JLabel("Stock Information");
			lblNewLabel_6.setFont(new Font("Monotype Corsiva", Font.BOLD, 20));
			lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_6.setBounds(77, 39, 198, 50);
		}
		return lblNewLabel_6;
	}
	private JLabel getLabel_2() {
		if (lblNewLabel_7 == null) {
			lblNewLabel_7 = new JLabel("Product Id");
			lblNewLabel_7.setFont(new Font("Times New Roman", Font.BOLD, 16));
			lblNewLabel_7.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_7.setBounds(41, 120, 121, 30);
		}
		return lblNewLabel_7;
	}
	private JLabel getLabel_3() {
		if (lblNewLabel_8 == null) {
			lblNewLabel_8 = new JLabel("Product Name");
			lblNewLabel_8.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_8.setFont(new Font("Times New Roman", Font.BOLD, 16));
			lblNewLabel_8.setBounds(41, 190, 121, 30);
		}
		return lblNewLabel_8;
	}
	private JLabel getLabel_4() {
		if (lblNewLabel_9 == null) {
			lblNewLabel_9 = new JLabel("Quantity");
			lblNewLabel_9.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_9.setFont(new Font("Times New Roman", Font.BOLD, 16));
			lblNewLabel_9.setBounds(41, 260, 121, 30);
		}
		return lblNewLabel_9;
	}
	private JLabel getLabel_5() {
		if (lblNewLabel_10 == null) {
			lblNewLabel_10 = new JLabel("MRP");
			lblNewLabel_10.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_10.setFont(new Font("Times New Roman", Font.BOLD, 16));
			lblNewLabel_10.setBounds(41, 330, 121, 30);
		}
		return lblNewLabel_10;
	}
	private JButton getAddbtn() {
		if (Addbtn == null) {
			Addbtn = new JButton("Add");
			Addbtn.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					Product p =new Product();
					
					p.setId(Integer.valueOf(Idtxt.getText()));
					p.setName(Nametxt.getText());
					p.setQuantity(Integer.valueOf(Quantitytxt.getText()));
					p.setMrp(Float.valueOf(Mrptxt.getText()));
					p.setActual(Float.valueOf(Amounttxt.getText()));
					
					ProductService pp = new ProductServiceImpl();
					
					if(pp.addProduct(p)) {
						JOptionPane.showMessageDialog(null, "Added Success");
						displayData();
						clearText();
						
					}else {
						JOptionPane.showMessageDialog(null, "Added fail");
					}
					
				}
			});
			Addbtn.setBackground(new Color(255, 102, 0));
			Addbtn.setFont(new Font("Times New Roman", Font.BOLD, 16));
			Addbtn.setBounds(61, 462, 89, 40);
		}
		return Addbtn;
	}
	private JButton getUpdatebtn() {
		if (Updatebtn == null) {
			Updatebtn = new JButton("Update");
			Updatebtn.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					if(table.getSelectedRow()<0) {
						JOptionPane.showMessageDialog(null, "select any data");
						return;
					}
					
					int row= table.getSelectedRow();
					int id=(int) table.getModel().getValueAt(row, 0);
					
					UpdateStock uf= new UpdateStock();
					uf.setDataForEdit(id);
					uf.setVisible(true);
					dispose();
					
				}
			});
			Updatebtn.setBackground(new Color(255, 102, 0));
			Updatebtn.setFont(new Font("Times New Roman", Font.BOLD, 16));
			Updatebtn.setBounds(255, 462, 89, 40);
		}
		return Updatebtn;
	}
	private JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setBounds(428, 39, 619, 413);
			scrollPane.setViewportView(getTable());
		}
		return scrollPane;
	}
	private JTextField getIdtxt() {
		if (Idtxt == null) {
			Idtxt = new JTextField();
			Idtxt.setBounds(205, 120, 167, 30);
			Idtxt.setColumns(10);
		}
		return Idtxt;
	}
	private JTextField getNametxt() {
		if (Nametxt == null) {
			Nametxt = new JTextField();
			Nametxt.setBounds(205, 190, 167, 30);
			Nametxt.setColumns(10);
		}
		return Nametxt;
	}
	private JTextField getQuantitytxt() {
		if (Quantitytxt == null) {
			Quantitytxt = new JTextField();
			Quantitytxt.setBounds(205, 260, 167, 30);
			Quantitytxt.setColumns(10);
		}
		return Quantitytxt;
	}
	private JTextField getMrptxt() {
		if (Mrptxt == null) {
			Mrptxt = new JTextField();
			Mrptxt.setBounds(205, 330, 167, 30);
			Mrptxt.setColumns(10);
		}
		return Mrptxt;
	}
	private JTable getTable() {
		if (table == null) {
			table = new JTable();
			table.setModel(new DefaultTableModel(
				new Object[][] {
				},
				new String[] {
					"Product Id", "Product Name", "Quantity", "Actual Price", "MRP"
				}
			));
		}
		return table;
	}
	
	public void displayData() {
		
		ProductService pp= new ProductServiceImpl();
		List<Product> plist= pp.getAllProduct();
		
		DefaultTableModel tmodel= (DefaultTableModel) table.getModel();
		tmodel.setRowCount(0);
		
		for(Product p: plist) {
			
			tmodel.addRow(new Object[] {p.getId(), p.getName(), p.getQuantity(),p.getActual(), p.getMrp()});
			
		}
		
	}
	
	public void clearText() {
		Idtxt.setText("");
		Nametxt.setText("");
		Quantitytxt.setText("");
		Mrptxt.setText("");
		Amounttxt.setText("");
	}
	private JLabel getLblNewLabel_11() {
		if (lblNewLabel_11 == null) {
			lblNewLabel_11 = new JLabel("Actual Amount");
			lblNewLabel_11.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_11.setFont(new Font("Times New Roman", Font.BOLD, 16));
			lblNewLabel_11.setBounds(41, 400, 121, 30);
		}
		return lblNewLabel_11;
	}
	private JTextField getAmounttxt() {
		if (Amounttxt == null) {
			Amounttxt = new JTextField();
			Amounttxt.setBounds(205, 401, 167, 30);
			Amounttxt.setColumns(10);
		}
		return Amounttxt;
	}
}
