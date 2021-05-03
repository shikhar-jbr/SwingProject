package com.service;

import java.util.List;

import javax.swing.DefaultComboBoxModel;

import com.model.Bill;

public interface BillService {
	
	boolean addBill(Bill b);
	List<Bill> searchAllStudent();
	List<Bill> searchBillById(int id);
    DefaultComboBoxModel retrieve();
    List<Bill> forSales();
    List<Bill> forTransaction();

}
