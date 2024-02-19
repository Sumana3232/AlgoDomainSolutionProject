package com.rest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rest.model.Charges;
import com.rest.model.Product;
import com.rest.repo.ProductRepo;

@Service
public class ProductServiceImp implements ProductService{

	@Autowired
	private ProductRepo repo;
	
	
	@Override
	public Product saveProduct(Product prod,Charges cg) {
		
		double price=0.0,discount=0.0,gst=0.0,delivery=0.0,finalPrice=0.0;
		
		if(prod.getPcategory().equalsIgnoreCase("Electronics")) {
			price=45000;
			discount=price*0.15;
			gst=price*0.18;
			delivery=350;
		
				
		}
		else if(prod.getPcategory().equalsIgnoreCase("Home Appliances")) {
			
			price=25000;
			discount=price*0.22;
			gst=price*0.24;
			delivery=800;
		
				
		}
     
		else if(prod.getPcategory().equalsIgnoreCase("Clothing")) {
			
			price=60000;
			discount=price*0.40;
			gst=price*0.12;
			delivery=0;
		
				
		}
		else if(prod.getPcategory().equalsIgnoreCase("Furniture")) {
			
			price=1200;
			discount=price*0.10;
			gst=price*0.18;
			delivery=300;
		
				
		}
     
     
		finalPrice=price-discount+gst+delivery;
		
		cg.setDelivery(delivery);
		cg.setGst(gst);
		
		prod.setDiscount(discount);
		prod.setPrice(price);
		prod.setCg(cg);
		prod.setFinalPrice(finalPrice);
		
		
		Product save=repo.save(prod);
		return save;
	}

	@Override
	public Product getProd(int pid) {
		
		Product get=repo.findById(pid).get();
		return get;
	}

	@Override
	public void delete(int pid) {
		
		repo.deleteById(pid);
		
	}

	@Override
	public List<Product> getAll() {
		
		List<Product> getAll=repo.findAll();
		
		return getAll;
	}

	@Override
	public Product updateProduct(Product prod, int pid,Charges cg) {
		
		Product oldRecord=repo.findById(pid).get();
		
		
		oldRecord.setPname(prod.getPname());
		oldRecord.setPtype(prod.getPtype());
		oldRecord.setPcategory(prod.getPcategory());
	
		
		
    double price=0.0,discount=0.0,gst=0.0,delivery=0.0,finalPrice=0.0;
		
		if(prod.getPcategory().equalsIgnoreCase("Electronics")) {
			
			price=45000;
			discount=price*0.15;
			gst=price*0.18;
			delivery=350;
		
				
		}
		else if(prod.getPcategory().equalsIgnoreCase("Home Appliances")) {
			
			price=25000;
			discount=price*0.22;
			gst=price*0.24;
			delivery=800;
		
				
		}
     
		else if(prod.getPcategory().equalsIgnoreCase("Clothing")) {
			
			price=60000;
			discount=price*0.40;
			gst=price*0.12;
			delivery=0;
		
				
		}
		else if(prod.getPcategory().equalsIgnoreCase("Furniture")) {
			
			price=1200;
			discount=price*0.10;
			gst=price*0.18;
			delivery=300;
		
				
		}
     
     
		finalPrice=price-discount+gst+delivery;
		
		cg.setDelivery(delivery);
		cg.setGst(gst);
		
//		prod.setDiscount(discount);
//		prod.setPrice(price);
//		prod.setCg(cg);
//		prod.setFinalPrice(finalPrice);
//		
		
		
		oldRecord.setDiscount(discount);
		oldRecord.setPrice(price);
		oldRecord.setCg(cg);
		oldRecord.setFinalPrice(finalPrice);
		
		
		Product save=repo.save(oldRecord);
		return save;
		
		
		
		
		
	}

		}