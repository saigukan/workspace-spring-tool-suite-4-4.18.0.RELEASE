package com.example.MobilePhone.db;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class MobilePhoneAns {
	@Id
	private int emi;
	private String waranty;
	private String exchange;
	private String offer;
	public int getEmi() {
		return emi;
	}
	public void setEmi(int emi) {
		this.emi = emi;
	}
	public String getWaranty() {
		return waranty;
	}
	public void setWaranty(String waranty) {
		this.waranty = waranty;
	}
	public String getExchange() {
		return exchange;
	}
	public void setExchange(String exchange) {
		this.exchange = exchange;
	}
	public String getOffer() {
		return offer;
	}
	public void setOffer(String offer) {
		this.offer = offer;
	}

}
