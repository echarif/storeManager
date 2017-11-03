package org.store.manager.model;

public class Customer {

	private long id;
	private String name;
	private String surname;
	private String mobilePhone;
	private String phone;
	private String email;

	public Customer() {
	}

	public Customer(long id,String name, String surname, String mobilePhone,
			String phone, String email) {
		
		this.id=id;
		this.name = name;
		this.surname = surname;
		this.mobilePhone = mobilePhone;
		this.phone = phone;
		this.email = email;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getMobilePhone() {
		return mobilePhone;
	}

	public void setMobilePhone(String mobilePhone) {
		this.mobilePhone = mobilePhone;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
