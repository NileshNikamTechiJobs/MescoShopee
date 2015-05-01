package com.mesco.grocery.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.DateSerializer;

/**
 * This model represent Fruit as an entity
 * @author Nilesh
 *
 */
@Entity
@Table(name = "FRUIT")
public class Fruit implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2186737765413635086L;	
	
	private String name;
	private float price;
	private int stock;
	private Date lastUpdated;
	
	public Fruit() {
		//empty constructor
	}
	
	public Fruit(String name, float price, int stock, Date lastUpdated) {
		this.name = name;
		this.price = price;
		this.stock = stock;
		this.lastUpdated = lastUpdated;
		
	}

	@Id
	@GeneratedValue
	@Column(name = "NAME")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "PRICE")	
	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	@Column(name = "STOCK")	
	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	@Column(name = "lastUpdated")	
	@JsonSerialize(using=DateSerializer.class)
	public Date getLastUpdated() {
		return lastUpdated;
	}

	public void setLastUpdated(Date lastUpdated) {
		this.lastUpdated = lastUpdated;
	}	

	@Override
	public String toString() {
		
		return "Fruit [ name" +this.name + ", price : " + 
				this.price + ", stock : " + this.stock + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + Float.floatToIntBits(price);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Fruit other = (Fruit) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (Float.floatToIntBits(price) != Float.floatToIntBits(other.price))
			return false;
		return true;
	}	

}
