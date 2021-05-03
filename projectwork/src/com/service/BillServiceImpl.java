package com.service;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.swing.DefaultComboBoxModel;

import com.db.DB;
import com.model.Bill;

public class BillServiceImpl implements BillService {

	@Override
	public boolean addBill(Bill b) {
		
		String sql="insert into bill(id, customer_name, product_id, product_name, mrp, quantity, discount, date, total)values(?,?,?,?,?,?,?,?,?)";
		
		try {
			PreparedStatement pstm= DB.doConnection().prepareStatement(sql);
			pstm.setInt(1, b.getId());
			pstm.setString(2, b.getCustomer());
			pstm.setInt(3, b.getProductid());
			pstm.setString(4, b.getProduct());
			pstm.setFloat(5, b.getMrp());
			pstm.setInt(6, b.getQuantity());
			pstm.setFloat(7, b.getDiscount());
			pstm.setDate(8, b.getDate());
			pstm.setFloat(9, b.getTotal());
			
			pstm.execute();
			return true;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
	}



	@Override
	public List<Bill> searchAllStudent() {
		
		List<Bill> blist= new ArrayList();
		
		String sql="select * from bill";
		
		try {
			Statement stm= DB.doConnection().createStatement();
			ResultSet rs= stm.executeQuery(sql);
			
			while(rs.next()) {
				Bill b= new Bill();
				
				b.setId(rs.getInt("id"));
				b.setCustomer(rs.getString("customer_name"));
				b.setProductid(rs.getInt("product_id"));
				b.setQuantity(rs.getInt("quantity"));
				b.setMrp(rs.getFloat("mrp"));
				b.setPrice(rs.getInt("quantity")*(rs.getFloat("mrp")-(rs.getFloat("mrp")*rs.getFloat("discount")/100)));
				
				blist.add(b);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return blist;
	}

	@Override
	public List<Bill> searchBillById(int id) {
		
        List<Bill> blist= new ArrayList();
		
		String sql="select * from bill where id="+id;
		
		try {
			Statement stm= DB.doConnection().createStatement();
			ResultSet rs= stm.executeQuery(sql);
			
			while(rs.next()) {
				Bill b= new Bill();
				
				b.setId(rs.getInt("id"));
				b.setCustomer(rs.getString("customer_name"));
				b.setProductid(rs.getInt("product_id"));
				b.setDate(rs.getDate("date"));
				b.setPrice(rs.getInt("quantity")*(rs.getFloat("mrp")-(rs.getFloat("mrp")*rs.getFloat("discount")/100)));
				
				blist.add(b);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return blist;
	}



	@Override
	public DefaultComboBoxModel retrieve() {
		
		 DefaultComboBoxModel dm=new DefaultComboBoxModel();

	        //SQL
	        String sql="SELECT product_id FROM product";

	        try
	        {
	            
	            Statement s=DB.doConnection().prepareStatement(sql);
	            ResultSet rs=s.executeQuery(sql);

	            //LOOP THRU GETTING ALL VALUES
	            while(rs.next())
	            {
	                //GET VALUES
	                String name=rs.getString(1);

	                dm.addElement(name);
	            }

	            return dm;

	        }catch (SQLException ex) {
	            ex.printStackTrace();
	             return null;
	        }
	}



	@Override
	public List<Bill> forSales() {
		
List<Bill> blist= new ArrayList();
		
		String sql="select * from bill";
		
		try {
			Statement stm= DB.doConnection().createStatement();
			ResultSet rs= stm.executeQuery(sql);
			
			while(rs.next()) {
				Bill b= new Bill();
				
				b.setId(rs.getInt("id"));
				b.setCustomer(rs.getString("customer_name"));
				b.setProductid(rs.getInt("product_id"));
				b.setPrice(rs.getInt("quantity")*(rs.getFloat("mrp")-(rs.getFloat("mrp")*rs.getFloat("discount")/100)));
				b.setDate(rs.getDate("date"));
				
				
				blist.add(b);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return blist;
		
	}



	@Override
	public List<Bill> forTransaction() {
		
		List<Bill> blist= new ArrayList();
		
		String sql="select * from bill";
		
		try {
			Statement stm= DB.doConnection().createStatement();
			ResultSet rs= stm.executeQuery(sql);
			
			while(rs.next()) {
				Bill b= new Bill();
				
				b.setId(rs.getInt("id"));
				b.setCustomer(rs.getString("customer_name"));
				b.setProductid(rs.getInt("product_id"));
				b.setPrice(rs.getInt("quantity")*(rs.getFloat("mrp")-(rs.getFloat("mrp")*rs.getFloat("discount")/100)));
				b.setDate(rs.getDate("date"));
				b.setDiscount(rs.getFloat("discount"));
				b.setQuantity(rs.getInt("quantity"));
				
				blist.add(b);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return blist;
		
	}









}
