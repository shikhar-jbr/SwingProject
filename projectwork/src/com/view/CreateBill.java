package com.view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.print.PrinterException;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.JInternalFrame;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import com.db.DB;
import com.model.Bill;
import com.model.Product;
import com.service.BillService;
import com.service.BillServiceImpl;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class CreateBill extends JFrame {

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
	private JLabel lblNewLabel_7;
	private JLabel lblNewLabel_8;
	private JLabel lblNewLabel_9;
	private JLabel lblNewLabel_10;
	private JButton Addbtn;
	private JButton Cancelbtn;
	private JLabel lblNewLabel_11;
	private JLabel lblNewLabel_12;
	private JTextField Billtxt;
	private JTextField Custxt;
	private JTextField Pronametxt;
	private JTextField Mrptxt;
	private JTextField Quantitytxt;
	private JTextField Discounttxt;
	private JTextField Datetxt;
	private JScrollPane scrollPane;
	private JTable table;
	private JLabel lblNewLabel_13;
	private JTextField Totalbtn;
	private JButton Printbtn;
	private JComboBox Idcombo;

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
	public CreateBill() {
		setTitle("Cashier");
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
			internalFrame = new JInternalFrame("New Bill");
			internalFrame.getContentPane().setBackground(new Color(255, 153, 51));
			internalFrame.getContentPane().setLayout(null);
			internalFrame.getContentPane().add(getLabel_1_1());
			internalFrame.getContentPane().add(getLabel_1_2());
			internalFrame.getContentPane().add(getLabel_1_3());
			internalFrame.getContentPane().add(getLabel_1_4());
			internalFrame.getContentPane().add(getLabel_1_5());
			internalFrame.getContentPane().add(getLabel_1_6());
			internalFrame.getContentPane().add(getAddbtn());
			internalFrame.getContentPane().add(getCancelbtn());
			internalFrame.getContentPane().add(getLabel_1_7());
			internalFrame.getContentPane().add(getLabel_1_8());
			internalFrame.getContentPane().add(getBilltxt());
			internalFrame.getContentPane().add(getCustxt());
			internalFrame.getContentPane().add(getPronametxt());
			internalFrame.getContentPane().add(getMrptxt());
			internalFrame.getContentPane().add(getQuantitytxt());
			internalFrame.getContentPane().add(getDiscounttxt());
			internalFrame.getContentPane().add(getDatetxt());
			internalFrame.getContentPane().add(getScrollPane());
			internalFrame.getContentPane().add(getLblNewLabel_13());
			internalFrame.getContentPane().add(getTotalbtn());
			internalFrame.getContentPane().add(getPrintbtn());
			internalFrame.getContentPane().add(getIdcombo());
			internalFrame.setBounds(131, 129, 1020, 552);
			internalFrame.setVisible(true);
			displayData();
		}
		return internalFrame;
	}
	private JLabel getLabel_1_1() {
		if (lblNewLabel_5 == null) {
			lblNewLabel_5 = new JLabel("Bill No");
			lblNewLabel_5.setFont(new Font("Times New Roman", Font.BOLD, 16));
			lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_5.setBounds(10, 30, 123, 23);
		}
		return lblNewLabel_5;
	}
	private JLabel getLabel_1_2() {
		if (lblNewLabel_6 == null) {
			lblNewLabel_6 = new JLabel("Customer Name");
			lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_6.setFont(new Font("Times New Roman", Font.BOLD, 16));
			lblNewLabel_6.setBounds(10, 80, 123, 23);
		}
		return lblNewLabel_6;
	}
	private JLabel getLabel_1_3() {
		if (lblNewLabel_7 == null) {
			lblNewLabel_7 = new JLabel("Product Id");
			lblNewLabel_7.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_7.setFont(new Font("Times New Roman", Font.BOLD, 16));
			lblNewLabel_7.setBounds(10, 130, 123, 23);
		}
		return lblNewLabel_7;
	}
	private JLabel getLabel_1_4() {
		if (lblNewLabel_8 == null) {
			lblNewLabel_8 = new JLabel("Product Name");
			lblNewLabel_8.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_8.setFont(new Font("Times New Roman", Font.BOLD, 16));
			lblNewLabel_8.setBounds(10, 180, 123, 23);
		}
		return lblNewLabel_8;
	}
	private JLabel getLabel_1_5() {
		if (lblNewLabel_9 == null) {
			lblNewLabel_9 = new JLabel("MRP");
			lblNewLabel_9.setFont(new Font("Times New Roman", Font.BOLD, 16));
			lblNewLabel_9.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_9.setBounds(10, 230, 123, 23);
		}
		return lblNewLabel_9;
	}
	private JLabel getLabel_1_6() {
		if (lblNewLabel_10 == null) {
			lblNewLabel_10 = new JLabel("Quantity");
			lblNewLabel_10.setFont(new Font("Times New Roman", Font.BOLD, 16));
			lblNewLabel_10.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_10.setBounds(10, 280, 123, 23);
		}
		return lblNewLabel_10;
	}
	private JButton getAddbtn() {
		if (Addbtn == null) {
			Addbtn = new JButton("Add");
			Addbtn.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					Bill b= new Bill();
					
					b.setId(Integer.valueOf(Billtxt.getText()));
					b.setCustomer(Custxt.getText());
					b.setProductid(Integer.valueOf(Idcombo.getSelectedItem().toString()));
					b.setProduct(Pronametxt.getText());
					b.setMrp(Float.valueOf(Mrptxt.getText()));
					b.setQuantity(Integer.valueOf(Quantitytxt.getText()));
					b.setDiscount(Float.valueOf(Discounttxt.getText()));
					b.setDate(Date.valueOf(Datetxt.getText()));
					b.setPrice(b.getQuantity()*(b.getMrp()-((b.getDiscount()*b.getMrp())/100)));
					b.setTotal(b.getPrice());
					
					
					String sql="select quantity from product where product_id="+Idcombo.getSelectedItem().toString();
					
					try {
						Statement stm= DB.doConnection().createStatement();
						ResultSet rs= stm.executeQuery(sql);
						
						while(rs.next()) {
							int quantity= rs.getInt("quantity");
							
							if(b.getQuantity()<= quantity) {
								BillService bb= new BillServiceImpl();
								
								if(bb.addBill(b)) {
									JOptionPane.showMessageDialog(null, "Bill Created");
									Totalbtn.setText(String.valueOf(b.getTotal()));
									displayData();
									clearText();
									
									
									quantity= quantity-b.getQuantity();
									
									String query="update product set quantity=? where product_id=?";
									PreparedStatement pstm= DB.doConnection().prepareStatement(query);
									
									pstm.setInt(1, quantity);
									pstm.setInt(2, b.getProductid());
									
									pstm.execute();
									
								}else {
									JOptionPane.showMessageDialog(null, "Add fail");
								}
							}else {
								JOptionPane.showMessageDialog(null, "Product Quantity more than in stock");
							}
						}
						
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					
					
					
					
					
				}
			});
			Addbtn.setBackground(new Color(255, 102, 0));
			Addbtn.setIcon(new ImageIcon(new ImageIcon("src\\images\\add.png").getImage().getScaledInstance(30, 32, 0)));
			Addbtn.setFont(new Font("Times New Roman", Font.BOLD, 16));
			Addbtn.setBounds(10, 396, 137, 35);
		}
		return Addbtn;
	}
	private JButton getCancelbtn() {
		if (Cancelbtn == null) {
			Cancelbtn = new JButton("Cancel");
			Cancelbtn.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					new CashierLogin().setVisible(true);
					dispose();
					
				}
			});
			Cancelbtn.setBackground(new Color(255, 102, 0));
			Cancelbtn.setIcon(new ImageIcon(new ImageIcon("src\\images\\wrong.jpg").getImage().getScaledInstance(30, 32, 0)));
			Cancelbtn.setFont(new Font("Times New Roman", Font.BOLD, 16));
			Cancelbtn.setBounds(201, 396, 137, 35);
		}
		return Cancelbtn;
	}
	private JLabel getLabel_1_7() {
		if (lblNewLabel_11 == null) {
			lblNewLabel_11 = new JLabel("Date");
			lblNewLabel_11.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_11.setFont(new Font("Times New Roman", Font.BOLD, 16));
			lblNewLabel_11.setBounds(534, 30, 123, 23);
		}
		return lblNewLabel_11;
	}
	private JLabel getLabel_1_8() {
		if (lblNewLabel_12 == null) {
			lblNewLabel_12 = new JLabel("Discount");
			lblNewLabel_12.setFont(new Font("Times New Roman", Font.BOLD, 16));
			lblNewLabel_12.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_12.setBounds(10, 330, 123, 23);
		}
		return lblNewLabel_12;
	}
	private JTextField getBilltxt() {
		if (Billtxt == null) {
			Billtxt = new JTextField();
			Billtxt.setBounds(176, 30, 162, 23);
			Billtxt.setColumns(10);
		}
		return Billtxt;
	}
	private JTextField getCustxt() {
		if (Custxt == null) {
			Custxt = new JTextField();
			Custxt.setBounds(176, 80, 162, 23);
			Custxt.setColumns(10);
		}
		return Custxt;
	}
	private JTextField getPronametxt() {
		if (Pronametxt == null) {
			Pronametxt = new JTextField();
			Pronametxt.setBounds(176, 180, 162, 23);
			Pronametxt.setColumns(10);
			
//     		loadData();
			
		}
		return Pronametxt;
	}
	private JTextField getMrptxt() {
		if (Mrptxt == null) {
			Mrptxt = new JTextField();
			Mrptxt.setBounds(176, 232, 162, 21);
			Mrptxt.setColumns(10);
			
//			loadData();
		}
		return Mrptxt;
	}
	private JTextField getQuantitytxt() {
		if (Quantitytxt == null) {
			Quantitytxt = new JTextField();
			Quantitytxt.setBounds(176, 280, 162, 23);
			Quantitytxt.setColumns(10);
		}
		return Quantitytxt;
	}
	private JTextField getDiscounttxt() {
		if (Discounttxt == null) {
			Discounttxt = new JTextField();
			Discounttxt.setBounds(176, 330, 162, 23);
			Discounttxt.setColumns(10);
		}
		return Discounttxt;
	}
	private JTextField getDatetxt() {
		if (Datetxt == null) {
			Datetxt = new JTextField();
			Datetxt.setBounds(671, 30, 162, 23);
			Datetxt.setColumns(10);
			
			Calendar ca = new GregorianCalendar();
			String day = ca.get(Calendar.DAY_OF_MONTH) + "";
			String month = ca.get(Calendar.MONTH) + 1 + "";
			String year = ca.get(Calendar.YEAR) + "";

			if (day.length() == 1) {
			    day = "0" + day;
			}
			if (month.length() == 1) {
			    month = "0" + month;
			}

			String dd = year + "-" + month + "-" + day;

			
			Datetxt.setText(String.valueOf(dd));
			
			
		}
		return Datetxt;
	}
	private JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setBounds(366, 80, 634, 351);
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
					"Id","Customer Name", "Product Id", "Quantity", "MRP", "Price"
				}
			));
		}
		return table;
	}
	private JLabel getLblNewLabel_13() {
		if (lblNewLabel_13 == null) {
			lblNewLabel_13 = new JLabel("Total");
			lblNewLabel_13.setFont(new Font("Times New Roman", Font.BOLD, 16));
			lblNewLabel_13.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_13.setBounds(405, 461, 123, 23);
		}
		return lblNewLabel_13;
	}
	private JTextField getTotalbtn() {
		if (Totalbtn == null) {
			Totalbtn = new JTextField();
			Totalbtn.setBounds(563, 461, 108, 23);
			Totalbtn.setColumns(10);

		}
		return Totalbtn;
	}
	private JButton getPrintbtn() {
		if (Printbtn == null) {
			Printbtn = new JButton("Print");
			Printbtn.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					try {
						table.print();
					} catch (PrinterException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					
				}
			});
			Printbtn.setBackground(new Color(255, 102, 0));
			Printbtn.setIcon(new ImageIcon(new ImageIcon("src\\images\\print.png").getImage().getScaledInstance(30, 32, 0)));
			Printbtn.setFont(new Font("Times New Roman", Font.PLAIN, 16));
			Printbtn.setBounds(815, 450, 116, 35);
		}
		return Printbtn;
	}
	private JComboBox getIdcombo() {
		if (Idcombo == null) {
			Idcombo = new JComboBox();
			Idcombo.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					String sql= "select product_name, mrp from product where product_id='"+Idcombo.getSelectedItem().toString()+"'";
				       
				       try {
						Statement stm= DB.doConnection().createStatement();
						ResultSet rs = stm.executeQuery(sql);
						
						while(rs.next()) {
							
							Pronametxt.setText(rs.getString("product_name"));
							Mrptxt.setText(String.valueOf(rs.getFloat("mrp")));
							
						}
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					
				}
			});
			loadData();
			Idcombo.setBounds(176, 130, 162, 23);
		}
		return Idcombo;
	}
	
	public void clearText() {
		Billtxt.setText("");
		Custxt.setText("");
		Idcombo.setSelectedIndex(0);
		Pronametxt.setText("");
		Mrptxt.setText("");
		Quantitytxt.setText("");
		Discounttxt.setText("");
		
	}
	
	private void displayData() {
		BillService bb= new BillServiceImpl();
		List<Bill> blist= bb.searchAllStudent();
		
		DefaultTableModel tmodel= (DefaultTableModel) table.getModel();
		tmodel.setRowCount(0);
		
		for(Bill b: blist) {
			
			tmodel.addRow(new Object[] {b.getId(), b.getCustomer(), b.getProductid(), b.getQuantity(), b.getMrp(), b.getPrice()});
			
		}
		
	}
	
	public void loadData() {
		
		BillService bb= new BillServiceImpl();
		DefaultComboBoxModel dm=  bb.retrieve();
	    Idcombo.setModel(dm);
	       
	       
		
	}
	

	
}
