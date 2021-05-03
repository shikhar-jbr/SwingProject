package com.view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.JInternalFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import com.model.Product;
import com.service.BillService;
import com.service.BillServiceImpl;
import com.service.ProductService;
import com.service.ProductServiceImpl;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;

public class ProductInformation extends JFrame {

	private JPanel contentPane;
	private JPanel panel;
	private JLabel label;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JInternalFrame internalFrame;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_6;
	private JButton Searchbtn;
	private JScrollPane scrollPane;
	private JTable table;
	private JComboBox IdcomboBox;

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
	public ProductInformation() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1248, 729);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 102, 0));
		contentPane.setForeground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getPanel());
		contentPane.add(getInternalFrame());
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
	private JInternalFrame getInternalFrame() {
		if (internalFrame == null) {
			internalFrame = new JInternalFrame("Product Information");
			internalFrame.getContentPane().setBackground(new Color(255, 153, 51));
			internalFrame.setBounds(166, 150, 892, 512);
			internalFrame.getContentPane().setLayout(null);
			internalFrame.getContentPane().add(getLblNewLabel_5());
			internalFrame.getContentPane().add(getLblNewLabel_6());
			internalFrame.getContentPane().add(getSearchbtn());
			internalFrame.getContentPane().add(getScrollPane());
			internalFrame.getContentPane().add(getIdcomboBox());
			internalFrame.setVisible(true);
		}
		return internalFrame;
	}
	private JLabel getLblNewLabel_5() {
		if (lblNewLabel_5 == null) {
			lblNewLabel_5 = new JLabel("Product Information");
			lblNewLabel_5.setFont(new Font("Monotype Corsiva", Font.BOLD, 20));
			lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_5.setBounds(254, 28, 341, 39);
		}
		return lblNewLabel_5;
	}
	private JLabel getLblNewLabel_6() {
		if (lblNewLabel_6 == null) {
			lblNewLabel_6 = new JLabel("Product  Id");
			lblNewLabel_6.setFont(new Font("Times New Roman", Font.BOLD, 16));
			lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_6.setBounds(106, 110, 125, 24);
		}
		return lblNewLabel_6;
	}
	private JButton getSearchbtn() {
		if (Searchbtn == null) {
			Searchbtn = new JButton("Search");
			Searchbtn.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					int id= Integer.valueOf(IdcomboBox.getSelectedItem().toString());
					ProductService pp= new ProductServiceImpl();
					List<Product> plist= pp.searchProduct(id);
					
					DefaultTableModel tmodel= (DefaultTableModel) table.getModel();
					tmodel.setRowCount(0);
					
					for(Product p: plist) {
						
						tmodel.addRow(new Object[] {p.getId(),p.getName(),p.getQuantity(),p.getMrp()});
						
					}
					
				}
			});
			Searchbtn.setIcon(new ImageIcon(new ImageIcon("src\\images\\download.png").getImage().getScaledInstance(30, 32, 0)));
			Searchbtn.setFont(new Font("Times New Roman", Font.BOLD, 16));
			Searchbtn.setBounds(581, 104, 125, 35);
		}
		return Searchbtn;
	}
	private JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setBounds(63, 166, 762, 284);
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
					"Product Id", "Product Name", "Quantity", "MRP"
				}
			));
		}
		return table;
	}
	private JComboBox getIdcomboBox() {
		if (IdcomboBox == null) {
			IdcomboBox = new JComboBox();
			loadData();
			IdcomboBox.setBounds(267, 110, 125, 24);
		}
		return IdcomboBox;
	}
	
	public void loadData() {
		
		BillService bb= new BillServiceImpl();
		DefaultComboBoxModel dm=  bb.retrieve();
	    IdcomboBox.setModel(dm);
	       
	       
		
	}
}
