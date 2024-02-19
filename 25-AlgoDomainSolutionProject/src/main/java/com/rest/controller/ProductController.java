package com.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rest.model.Charges;
import com.rest.model.Product;
import com.rest.service.ProductService;

@RestController
public class ProductController {
	
	@Autowired
	private ProductService service;
	
	
	@PostMapping("/save")
	public Product saveMethod(@RequestBody Product prod,Charges cg) {
		
		Product p1=service.saveProduct(prod,cg);
		
		return p1;
	}
	
	
	@GetMapping("/get/{pid}")
	public Product getMethod(@PathVariable int pid) {
		
		Product get=service.getProd(pid);
		
		return get;
		
		
	}
	
	
	@DeleteMapping("/delete/{pid}")
	public void deleteMethod(@PathVariable int pid) {
		
		service.delete(pid);
		
	}
	
	
	@GetMapping("/getAll")
	public List<Product> getAllMethod(){
		
		List<Product> getAll=service.getAll();
		return getAll;
	}
	
	
	@PutMapping("/update/{pid}")
	public Product updateMethod(@RequestBody Product prod,@PathVariable int pid,Charges cg) {
		
		Product update=service.updateProduct(prod, pid, cg);
		return update;
		
	}

}