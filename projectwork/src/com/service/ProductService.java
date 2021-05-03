package com.service;

import java.util.List;

import com.model.Product;

public interface ProductService {
	
	boolean addProduct(Product p);
	boolean UpdateProduct(Product p);
	List<Product> getAllProduct();
	List<Product> searchProduct(int id);
	List<Product> forTransaction();

}
