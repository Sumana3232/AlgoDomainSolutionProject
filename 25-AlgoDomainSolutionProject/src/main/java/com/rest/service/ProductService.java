package com.rest.service;

import java.util.List;

import com.rest.model.Charges;
import com.rest.model.Product;

public interface ProductService {
	public Product getProd(int pid);
	public void delete(int pid);
	public List<Product> getAll();
	public Product updateProduct(Product prod,int pid,Charges cg);
	Product saveProduct(Product prod, Charges cg);
	
}
