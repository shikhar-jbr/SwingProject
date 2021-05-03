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
import java.awt.print.PrinterException;
import java.util.List;

import javax.swing.JInternalFrame;
import javax.swing.JSeparator;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import com.model.Bill;
import com.model.Product;
import com.service.BillService;
import com.service.BillServiceImpl;
import com.service.ProductService;
import com.service.ProductServiceImpl;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Transaction extends JFrame {

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
	private JScrollPane scrollPane;
	private JTable table;
	private JScrollPane scrollPane_1;
	private JTable table_1;
	private JLabel lblNewLabel_8;
	private JTextField Producttxt;
	private JLabel lblNewLabel_9;
	private JTextField Salestxt;
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Transaction frame = new Transaction();
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
	public Transaction() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1420, 723);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 153, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getPanel());
		contentPane.add(getInternalFrame());
		displayProduct();
		displaySales();
		getTotall();
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
	private JInternalFrame getInternalFrame() {
		if (internalFrame == null) {
			internalFrame = new JInternalFrame("Transaction");
			internalFrame.getContentPane().setBackground(new Color(255, 204, 0));
			internalFrame.setBounds(10, 141, 1263, 534);
			internalFrame.getContentPane().setLayout(null);
			internalFrame.getContentPane().add(getLblNewLabel_6());
			internalFrame.getContentPane().add(getLblNewLabel_7());
			internalFrame.getContentPane().add(getScrollPane());
			internalFrame.getContentPane().add(getScrollPane_1());
			internalFrame.getContentPane().add(getLblNewLabel_8());
			internalFrame.getContentPane().add(getProducttxt());
			internalFrame.getContentPane().add(getLblNewLabel_9());
			internalFrame.getContentPane().add(getSalestxt());
			internalFrame.getContentPane().add(getBtnNewButton());
			internalFrame.setVisible(true);
		}
		return internalFrame;
	}
	private JLabel getLblNewLabel_6() {
		if (lblNewLabel_6 == null) {
			lblNewLabel_6 = new JLabel("Product Available");
			lblNewLabel_6.setFont(new Font("Monotype Corsiva", Font.BOLD | Font.ITALIC, 26));
			lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_6.setBounds(112, 26, 275, 42);
		}
		return lblNewLabel_6;
	}
	private JLabel getLblNewLabel_7() {
		if (lblNewLabel_7 == null) {
			lblNewLabel_7 = new JLabel("Product Sold");
			lblNewLabel_7.setFont(new Font("Monotype Corsiva", Font.BOLD | Font.ITALIC, 26));
			lblNewLabel_7.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_7.setBounds(774, 26, 275, 42);
		}
		return lblNewLabel_7;
	}
	private JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setBounds(10, 66, 536, 374);
			scrollPane.setViewportView(getTable());
		}
		return scrollPane;
	}
	private JTable getTable() {
		if (table == null) {
			table = new JTable();
			table.setModel(new DefaultTableModel(
				new Object[][] {
				},
				new String[] {
					"Product Id", "Product Name", "Quantity", "Actual Price", "MRP", "Total Price"
				}
			));
		}
		return table;
	}
	private JScrollPane getScrollPane_1() {
		if (scrollPane_1 == null) {
			scrollPane_1 = new JScrollPane();
			scrollPane_1.setBounds(568, 66, 675, 374);
			scrollPane_1.setViewportView(getTable_1());
		}
		return scrollPane_1;
	}
	private JTable getTable_1() {
		if (table_1 == null) {
			table_1 = new JTable();
			table_1.setModel(new DefaultTableModel(
				new Object[][] {
				},
				new String[] {
					"ID", "Customer Name", "Product Id", "Date", "Quantity", "Discount", "Amount"
				}
			));
		}
		return table_1;
	}
	private JLabel getLblNewLabel_8() {
		if (lblNewLabel_8 == null) {
			lblNewLabel_8 = new JLabel("Total");
			lblNewLabel_8.setFont(new Font("Times New Roman", Font.BOLD, 16));
			lblNewLabel_8.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_8.setBounds(10, 451, 133, 29);
		}
		return lblNewLabel_8;
	}
	private JTextField getProducttxt() {
		if (Producttxt == null) {
			Producttxt = new JTextField();
			Producttxt.setBounds(199, 451, 164, 29);
			Producttxt.setColumns(10);
		}
		return Producttxt;
	}
	private JLabel getLblNewLabel_9() {
		if (lblNewLabel_9 == null) {
			lblNewLabel_9 = new JLabel("Total");
			lblNewLabel_9.setFont(new Font("Times New Roman", Font.BOLD, 16));
			lblNewLabel_9.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_9.setBounds(578, 451, 133, 29);
		}
		return lblNewLabel_9;
	}
	private JTextField getSalestxt() {
		if (Salestxt == null) {
			Salestxt = new JTextField();
			Salestxt.setBounds(749, 451, 164, 29);
			Salestxt.setColumns(10);
		}
		return Salestxt;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("Print");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					try {
						table.print();
						table_1.print();
					} catch (PrinterException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					
				}
			});
			btnNewButton.setBackground(new Color(255, 102, 0));
			btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 16));
			btnNewButton.setBounds(1120, 451, 123, 43);
		}
		return btnNewButton;
	}
	
	public void displayProduct() {
		
		ProductService pp= new ProductServiceImpl();
		List<Product> plist= pp.forTransaction();
		
		DefaultTableModel tmodel= (DefaultTableModel) table.getModel();
		tmodel.setRowCount(0);
		
		for(Product p:plist) {
			
			tmodel.addRow(new Object[] {p.getId(), p.getName(), p.getQuantity(), p.getActual(), p.getMrp(), p.getTotal()});
			
		}
		
	}
	
	public void displaySales() {
		
		BillService bb= new BillServiceImpl();
		List<Bill> blist= bb.forTransaction();
		
		DefaultTableModel tmodel= (DefaultTableModel) table_1.getModel();
		tmodel.setRowCount(0);
		
		for(Bill b: blist) {
			
			tmodel.addRow(new Object[] {b.getId(), b.getCustomer(), b.getProductid(), b.getDate(), b.getQuantity(), b.getDiscount(), b.getPrice()});
			
		}
		
	}
	
	public void getTotall() {
		
      float productTotal = 0;
      float salesTotal=0;
		
		for (int i = 0; i < table_1.getRowCount(); i++){
		    
			salesTotal =salesTotal + Float.parseFloat(table_1.getValueAt(i, 6).toString());

		}
		
		for(int j = 0; j < table.getRowCount(); j++) {
			
			productTotal = productTotal + Float.parseFloat(table.getValueAt(j, 5).toString());
		}
		
		Salestxt.setText(Float.toString(salesTotal));
		Producttxt.setText(Float.toString(productTotal));
	}
		
	
	
}
