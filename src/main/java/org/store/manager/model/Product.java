package org.store.manager.model;

public class Product {

	private long id;
	private String description;
	private long stock;

	public Product() {

	}

	public Product(long id, String description,long stock) {
		this.id = id;
		this.description = description;
		this.stock=stock;

	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public long getStock() {
		return stock;
	}

	public void setStock(long stock) {
		this.stock = stock;
	}
	
	

}
