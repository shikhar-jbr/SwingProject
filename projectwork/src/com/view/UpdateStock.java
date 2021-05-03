package com.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.db.DB;
import com.model.Product;
import com.service.ProductService;
import com.service.ProductServiceImpl;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class UpdateStock extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel_6;
	private JLabel lblNewLabel_8;
	private JLabel lblNewLabel_9;
	private JLabel lblNewLabel_10;
	private JButton Updatebtn;
	private JButton Cancelbtn;
	private JTextField Nametxt;
	private JTextField Quantitytxt;
	private JTextField Mrptxt;
	private int sid;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UpdateStock frame = new UpdateStock();
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
	public UpdateStock() {
		setTitle("Update Stock");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 761, 733);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 204, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblNewLabel_6());
		contentPane.add(getLblNewLabel_8());
		contentPane.add(getLblNewLabel_9());
		contentPane.add(getLblNewLabel_10());
		contentPane.add(getUpdatebtn());
		contentPane.add(getCancelbtn());
		contentPane.add(getNametxt());
		contentPane.add(getQuantitytxt());
		contentPane.add(getMrptxt());
		setName();
	}

	private JLabel getLblNewLabel_6() {
		if (lblNewLabel_6 == null) {
			lblNewLabel_6 = new JLabel("Stock Information");
			lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_6.setFont(new Font("Monotype Corsiva", Font.BOLD, 20));
			lblNewLabel_6.setBounds(214, 57, 242, 50);
		}
		return lblNewLabel_6;
	}
	private JLabel getLblNewLabel_8() {
		if (lblNewLabel_8 == null) {
			lblNewLabel_8 = new JLabel("Product Name");
			lblNewLabel_8.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_8.setFont(new Font("Times New Roman", Font.BOLD, 16));
			lblNewLabel_8.setBounds(174, 190, 121, 30);
		}
		return lblNewLabel_8;
	}
	private JLabel getLblNewLabel_9() {
		if (lblNewLabel_9 == null) {
			lblNewLabel_9 = new JLabel("Quantity");
			lblNewLabel_9.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_9.setFont(new Font("Times New Roman", Font.BOLD, 16));
			lblNewLabel_9.setBounds(174, 286, 121, 30);
		}
		return lblNewLabel_9;
	}
	private JLabel getLblNewLabel_10() {
		if (lblNewLabel_10 == null) {
			lblNewLabel_10 = new JLabel("MRP");
			lblNewLabel_10.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_10.setFont(new Font("Times New Roman", Font.BOLD, 16));
			lblNewLabel_10.setBounds(174, 396, 121, 30);
		}
		return lblNewLabel_10;
	}
	private JButton getUpdatebtn() {
		if (Updatebtn == null) {
			Updatebtn = new JButton("Update");
			Updatebtn.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					
					
					Product p = new Product();
					
					p.setId(sid);
					p.setName(Nametxt.getText());
					p.setQuantity(Integer.valueOf(Quantitytxt.getText()));
					p.setMrp(Float.valueOf(Mrptxt.getText()));
					
					ProductService pp = new ProductServiceImpl();
					
					if(pp.UpdateProduct(p)) {
						JOptionPane.showMessageDialog(null, "Update Success");
						new Stock().setVisible(true);
						dispose();
					}else {
						JOptionPane.showMessageDialog(null, "Updated failed");
					}
					
				}
			});
			Updatebtn.setFont(new Font("Times New Roman", Font.BOLD, 16));
			Updatebtn.setBackground(new Color(255, 102, 0));
			Updatebtn.setBounds(174, 561, 89, 40);
		}
		return Updatebtn;
	}
	private JButton getCancelbtn() {
		if (Cancelbtn == null) {
			Cancelbtn = new JButton("Cancel");
			Cancelbtn.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					new Stock().setVisible(true);
					dispose();
					
				}
			});
			Cancelbtn.setFont(new Font("Times New Roman", Font.BOLD, 16));
			Cancelbtn.setBackground(new Color(255, 102, 0));
			Cancelbtn.setBounds(422, 561, 89, 40);
		}
		return Cancelbtn;
	}
	private JTextField getNametxt() {
		if (Nametxt == null) {
			Nametxt = new JTextField();
			Nametxt.setColumns(10);
			Nametxt.setBounds(338, 191, 167, 30);
		}
		return Nametxt;
	}
	private JTextField getQuantitytxt() {
		if (Quantitytxt == null) {
			Quantitytxt = new JTextField();
			Quantitytxt.setColumns(10);
			Quantitytxt.setBounds(338, 287, 167, 30);
		}
		return Quantitytxt;
	}
	private JTextField getMrptxt() {
		if (Mrptxt == null) {
			Mrptxt = new JTextField();
			Mrptxt.setColumns(10);
			Mrptxt.setBounds(338, 396, 167, 30);
		}
		return Mrptxt;
	}
	
	public void setDataForEdit(int id) {
		
		sid=id;
		ProductService pp= new ProductServiceImpl();
		Product p= new Product();
		
		Nametxt.setText(p.getName());
		Quantitytxt.setText(String.valueOf(p.getQuantity()));
		Mrptxt.setText(String.valueOf(p.getMrp()));
	}
	
	public void setName() {
		String sql="select product_name from product where product_id="+sid;
		
		try {
			Statement stm= DB.doConnection().createStatement();
			ResultSet rs= stm.executeQuery(sql);
			
			while(rs.next()) {
				String name=rs.getString("product_name");
				Nametxt.setText(name);
				
				stm.close();
			}
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
	}
	
}
