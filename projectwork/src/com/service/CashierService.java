package com.service;

import java.util.List;

import com.model.Cashier;

public interface CashierService {
	
	boolean addCashier(Cashier c);
	boolean deleteCashier(int id);
	boolean updateCashier(Cashier c);
	Cashier getCashierById(int id);
	List<Cashier> getAllStudent();
	
	
	

}
