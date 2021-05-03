package com.service;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.db.DB;
import com.model.Cashier;

public class CashierServiceImpl implements CashierService{

	@Override
	public boolean addCashier(Cashier c) {
		
		String sql="insert into register(firstname, lastname, email, password, dob, username, address, phone)values(?,?,?,?,?,?,?,?)";
		try{
			PreparedStatement pstm = DB.doConnection().prepareStatement(sql);
			pstm.setString(1, c.getFname());
			pstm.setString(2, c.getLname());
			pstm.setString(3, c.getEmali());
			pstm.setString(4, c.getPassword());
			pstm.setDate(5, c.getDob());
			pstm.setString(6, c.getUname());
			pstm.setString(7, c.getAddress());
			pstm.setString(8, c.getPhone());
			
			pstm.execute();
			return true;
			
		} catch(SQLException e) {
			e.printStackTrace();
		}
		
		return false;
	}

	@Override
	public boolean deleteCashier(int id) {
		
		String sql="delete from register where id="+id;
		
		try {
			Statement stm= DB.doConnection().createStatement();
			
			stm.execute(sql);
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return false;
	}

	@Override
	public boolean updateCashier(Cashier std) {
		
		String sql="update register set firstname=?,lastname=?,phone=?,email=?,dob=?,address=?,username=?,password=? where id=?";
		try{
			PreparedStatement pstm = DB.doConnection().prepareStatement(sql);
			pstm.setString(1, std.getFname());
			pstm.setString(2, std.getLname());
			pstm.setString(3, std.getPhone());
			pstm.setString(4, std.getEmali());
			pstm.setDate(5, std.getDob());
			pstm.setString(6, std.getAddress());
			pstm.setString(7, std.getUname());
			pstm.setString(8, std.getPassword());
			pstm.setInt(9, std.getId());
			
			pstm.execute();
			return true;
			
		} catch(SQLException e) {
			e.printStackTrace();
		}
		
		return false;
	}

	@Override
	public List<Cashier> getAllStudent() {
		
        List<Cashier> slist= new ArrayList();
		
		String sql="select * from register";
		
		try {
			Statement stm= DB.doConnection().createStatement();
			ResultSet rs= stm.executeQuery(sql);
			
			while(rs.next()) {
				Cashier s= new Cashier();
				
				s.setId(rs.getInt("id"));
				s.setName(rs.getString("firstname")+" "+rs.getString("lastname"));
				s.setPhone(rs.getString("phone"));
				s.setEmali(rs.getString("email"));
				s.setDob(rs.getDate("dob"));
				s.setAddress(rs.getString("address"));
				
				slist.add(s);
				
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return slist;
	}

	@Override
	public Cashier getCashierById(int id) {
		
		Cashier s= new Cashier();
		
		String sql="select * from register where id= "+id;
		
		Statement stm;
		try {
			stm = DB.doConnection().createStatement();
			ResultSet rs= stm.executeQuery(sql);
			
			if(rs.next()) {
				s.setId(rs.getInt("id"));
				s.setFname(rs.getString("firstname"));
				s.setLname(rs.getString("lastname"));
				s.setUname(rs.getString("username"));
				s.setPassword(rs.getString("password"));
				s.setDob(rs.getDate("dob"));
				s.setAddress(rs.getString("address"));
				s.setEmali(rs.getString("email"));
				s.setPhone(rs.getString("phone"));
				
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return s;
		
	
	}



	
	
}
