package com.service;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.db.DB;

import com.model.Product;

public class ProductServiceImpl implements ProductService {

	@Override
	public boolean addProduct(Product p) {
		
		String sql="insert into product(product_id, product_name, quantity, mrp, actual_price)values(?,?,?,?,?)";
		
		try {
			PreparedStatement pstm= DB.doConnection().prepareStatement(sql);
			
			pstm.setInt(1, p.getId());
			pstm.setString(2, p.getName());
			pstm.setInt(3, p.getQuantity());
			pstm.setFloat(4, p.getMrp());
			pstm.setFloat(5, p.getActual());
			
			pstm.execute();
			return true;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
	}

	@Override
	public boolean UpdateProduct(Product p) {
		
		String sql="update product set product_name=?, quantity=?, mrp=? where product_id=?";
		
		try {
			PreparedStatement pstm= DB.doConnection().prepareStatement(sql);
			
			pstm.setString(1, p.getName());
			pstm.setInt(2, p.getQuantity());
			pstm.setFloat(3, p.getMrp());
			pstm.setInt(4, p.getId());
			
			pstm.execute();
			return true;
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return false;
	}



	@Override
	public List<Product> getAllProduct() {
		
		List<Product> plist= new ArrayList();
		
		String sql="select * from product";
		
		try {
			Statement stm= DB.doConnection().createStatement();
			ResultSet rs= stm.executeQuery(sql);
			
			while(rs.next()) {
				
				Product p = new Product();
				
				p.setId(rs.getInt("product_id"));
				p.setName(rs.getString("product_name"));
				p.setQuantity(rs.getInt("quantity"));
				p.setMrp(rs.getFloat("mrp"));
				p.setActual(rs.getFloat("actual_price"));
				
				plist.add(p);
				
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return plist;
	}

	@Override
	public List<Product> searchProduct(int id) {
		
		List<Product> plist= new ArrayList();
		String sql="select * from product where product_id="+id;
		
		try {
			Statement stm = DB.doConnection().createStatement();
			ResultSet rs= stm.executeQuery(sql);
			
			while(rs.next()) {
				Product p= new Product();
				
				p.setId(rs.getInt("product_id"));
				p.setName(rs.getString("product_name"));
				p.setQuantity(rs.getInt("quantity"));
				p.setMrp(rs.getFloat("mrp"));
				p.setActual(rs.getFloat("actual_price"));
				
				plist.add(p);
				
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		};
		
		
		return plist;
	}

	@Override
	public List<Product> forTransaction() {
		
List<Product> plist= new ArrayList();
		
		String sql="select * from product";
		
		try {
			Statement stm= DB.doConnection().createStatement();
			ResultSet rs= stm.executeQuery(sql);
			
			while(rs.next()) {
				
				Product p = new Product();
				
				p.setId(rs.getInt("product_id"));
				p.setName(rs.getString("product_name"));
				p.setQuantity(rs.getInt("quantity"));
				p.setMrp(rs.getFloat("mrp"));
				p.setActual(rs.getFloat("actual_price"));
				p.setTotal(rs.getInt("quantity")*rs.getFloat("actual_price"));
				
				plist.add(p);
				
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return plist;
		
	}



}
