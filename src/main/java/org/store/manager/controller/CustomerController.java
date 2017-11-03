package org.store.manager.controller;

import java.util.List;
import org.store.manager.model.Customer;
import org.store.manager.service.CustomerService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

	CustomerService customerService = new CustomerService();

	@RequestMapping(value="/customers", method=RequestMethod.GET)
	public List<Customer> getCustomers() {
		return customerService.getAllCustomers();
	}
/*
	@POST
	public Response addCustomer(Customer cust, @Context UriInfo uriInfo)
			throws URISyntaxException {
		Customer newCustomer = customerService.addCustomer(cust);
		String newId = String.valueOf(newCustomer.getId());
		URI uri = uriInfo.getAbsolutePathBuilder().path(newId).build();
		return Response.created(uri).entity(newCustomer).build();
	}

	@DELETE
	@Path("/{customerId}")
	public void deleteCustomer(@PathParam("customerId") long id) {
		customerService.removeCustomer(id);
	}

	@PUT
	@Path("/{messageId}")
	public Customer updateMessage(@PathParam("messageId") long id,
			Customer customer) {

		return null;
	}

	@GET
	@Path("/{customerId}")
	public Customer getCustomer(@PathParam("customerId") long id) {
		System.out.println("IDDDDDDDDDDDDDDDDDD: " + id);
		return customerService.getCustomer(id);
	}
	*/
}
