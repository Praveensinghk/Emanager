package com.example.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="products")
public class Product {
private String category;
private String name;
private float price;
private String dates;
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private int id;
public String getCategory() {
	return category;
}
public void setCategory(String category) {
	this.category = category;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public float getPrice() {
	return price;
}
public void setPrice(float price) {
	this.price = price;
}
public String getDates() {
	return dates;
}
public void setDates(String dates) {
	this.dates = dates;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}

}
