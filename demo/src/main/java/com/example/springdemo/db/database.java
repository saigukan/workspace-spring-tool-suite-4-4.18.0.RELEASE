package com.example.springdemo.db;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class database {
	@Id
	private int id;
	private String name;
	private String dep;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDep() {
		return dep;
	}
	public void setDep(String dep) {
		this.dep = dep;
	}

}
