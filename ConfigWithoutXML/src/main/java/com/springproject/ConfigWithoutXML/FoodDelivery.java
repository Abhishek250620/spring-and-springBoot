package com.springproject.ConfigWithoutXML;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class FoodDelivery {
	
	@Value("1")
	private int orderID;
	
	@Value("Prakash")
	private String custName;
	
	private Payment payment;
	
	void deliver() {
		System.out.println("Delivering the order...!!!");
	}
	
	public FoodDelivery(Payment payment) {
		this.payment=payment;
	}

	public int getOrderID() {
		return orderID;
	}
	public void setOrderID(int orderID) {
		this.orderID = orderID;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}

	@Override
	public String toString() {
		return "FoodDelivery [orderID=" + orderID + ", custName=" + custName + ", payment=" + payment + "]";
	}
	
}
