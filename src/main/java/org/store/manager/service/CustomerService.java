package org.store.manager.service;

import java.sql.Connection;
import java.sql.ResultSet;
import java.util.List;

import org.store.manager.database.CustomerDAO;
import org.store.manager.database.DBConnection;
import org.store.manager.model.Customer;

public class CustomerService {

	DBConnection dbCon;
	Connection conn;
	ResultSet rslt;

	public List<Customer> getAllCustomers() {

		CustomerDAO cust = new CustomerDAO();
		List<Customer> customers = cust.getCustomers();
		return customers;
	}

	public Customer getCustomer(long id) {

		CustomerDAO cust = new CustomerDAO();
		Customer customer = cust.getCustomer(id);

		Long idPrd = customer.getId();

		System.out.println("ID CUSTOMER: " + idPrd);
		if (idPrd == null) {
			throw new NullPointerException();
		}
		return customer;
	}

	public Customer addCustomer(Customer cust) {

		CustomerDAO custDao = new CustomerDAO();
		custDao.addCustomer(cust);
		return cust;
	}

	public void removeCustomer(long id) {
		CustomerDAO cust = new CustomerDAO();
		cust.deleteCustomer(id);
	}

}
