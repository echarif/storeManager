package org.store.manager.controller;

import java.util.List;

import org.store.manager.model.Product;
import org.store.manager.service.ProductService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
public class ProductController {

	ProductService productService = new ProductService();
	private Logger log = LoggerFactory.getLogger(this.getClass());

	@RequestMapping(value = "products", method = RequestMethod.GET)
	public List<Product> getProducts() {
		log.debug("Logger: {}{}");
		return productService.getAllProducts();
	}
	/*
	 * @POST public Response addProduct(Product prd, @Context UriInfo uriInfo)
	 * throws URISyntaxException { Product newProduct =
	 * productService.addProduct(prd); String newId =
	 * String.valueOf(newProduct.getId()); URI uri =
	 * uriInfo.getAbsolutePathBuilder().path(newId).build(); return
	 * Response.created(uri).entity(newProduct).build(); }
	 * 
	 * @DELETE
	 * 
	 * @Path("/{productId}") public void deleteProduct(@PathParam("productId")
	 * long id) { productService.removeProduct(id); }
	 * 
	 * /*
	 * 
	 * @PUT
	 * 
	 * @Path("/{messageId}") public Message
	 * updateMessage(@PathParam("messageId") long id, Message message) {
	 * message.setId(id); return messageService.updateMessage(message); }
	 * 
	 * @GET
	 * 
	 * @Path("/{productId}") public Product getProduct(@PathParam("productId")
	 * long id) {
	 * 
	 * return productService.getProduct(id); }
	 */

}
