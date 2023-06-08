package com.example.Cellphones.db;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Products {
	@Id
	private int id;
	private String name;
	private String description;
	private int price;
	private float discountpercentage;
	private float rating;
	private String category;
	private String thumbnail;
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
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public float getDiscountpercentage() {
		return discountpercentage;
	}
	public void setDiscountpercentage(float discountpercentage) {
		this.discountpercentage = discountpercentage;
	}
	public float getRating() {
		return rating;
	}
	public void setRating(float rating) {
		this.rating = rating;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getThumbnail() {
		return thumbnail;
	}
	public void setThumbnail(String thumbnail) {
		this.thumbnail = thumbnail;
	}

}
