package com.rest.model;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


	@Entity
	@Table(name="AlgoDomain")
	public class Product {
		
		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		private int pid;
		private String pname;
		private String ptype;
		private String pcategory;
		private double price;
		private double discount;
		
		@Embedded
		private Charges cg;
		
		private double finalPrice;

		public Product() {
			super();
		}

		public Product(int pid, String pname, String ptype, String pcategory, double price, double discount, Charges cg,
				double finalPrice) {
			super();
			this.pid = pid;
			this.pname = pname;
			this.ptype = ptype;
			this.pcategory = pcategory;
			this.price = price;
			this.discount = discount;
			this.cg = cg;
			this.finalPrice = finalPrice;
		}

		public int getPid() {
			return pid;
		}

		public void setPid(int pid) {
			this.pid = pid;
		}

		public String getPname() {
			return pname;
		}

		public void setPname(String pname) {
			this.pname = pname;
		}

		public String getPtype() {
			return ptype;
		}

		public void setPtype(String ptype) {
			this.ptype = ptype;
		}

		public String getPcategory() {
			return pcategory;
		}

		public void setPcategory(String pcategory) {
			this.pcategory = pcategory;
		}

		public double getPrice() {
			return price;
		}

		public void setPrice(double price) {
			this.price = price;
		}

		public double getDiscount() {
			return discount;
		}

		public void setDiscount(double discount) {
			this.discount = discount;
		}

		public Charges getCg() {
			return cg;
		}

		public void setCg(Charges cg) {
			this.cg = cg;
		}

		public double getFinalPrice() {
			return finalPrice;
		}

		public void setFinalPrice(double finalPrice) {
			this.finalPrice = finalPrice;
		}

		@Override
		public String toString() {
			return "Product [pid=" + pid + ", pname=" + pname + ", ptype=" + ptype + ", pcategory=" + pcategory
					+ ", price=" + price + ", discount=" + discount + ", cg=" + cg + ", finalPrice=" + finalPrice + "]";
		}
	}