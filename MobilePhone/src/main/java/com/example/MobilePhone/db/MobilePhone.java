package com.example.MobilePhone.db;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;

@Entity
public class MobilePhone {
	@Id
	private int no;
	private String name;
	private String ram;
	private String fcam;
	private String bcam;
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn
	public List<MobilePhoneAns> ans; 
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRam() {
		return ram;
	}
	public void setRam(String ram) {
		this.ram = ram;
	}
	public String getFcam() {
		return fcam;
	}
	public void setFcam(String fcam) {
		this.fcam = fcam;
	}
	public String getBcam() {
		return bcam;
	}
	public void setBcam(String bcam) {
		this.bcam = bcam;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public String getBattery() {
		return battery;
	}
	public void setBattery(String battery) {
		this.battery = battery;
	}
	public String getProcessor() {
		return processor;
	}
	public void setProcessor(String processor) {
		this.processor = processor;
	}
	public String getDiaply() {
		return diaply;
	}
	public void setDiaply(String diaply) {
		this.diaply = diaply;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	private String colour;
	private String battery;
	private String processor;
	private String diaply;
	private String price; 
	

}
