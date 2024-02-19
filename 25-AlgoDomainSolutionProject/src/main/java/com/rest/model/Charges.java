package com.rest.model;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Embedded;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Embeddable
public class Charges {
	
	private double gst;
	private double delivery;
	public Charges() {
		super();
	}
	public double getGst() {
		return gst;
	}
	public void setGst(double gst) {
		this.gst = gst;
	}
	public double getDelivery() {
		return delivery;
	}
	public void setDelivery(double delivery) {
		this.delivery = delivery;
	}
	@Override
	public String toString() {
		return "Charges [gst=" + gst + ", delivery=" + delivery + "]";
	}
	
	
}