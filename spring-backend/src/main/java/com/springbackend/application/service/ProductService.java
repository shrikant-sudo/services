package com.springbackend.application.service;

import java.util.List;

import com.springbackend.application.model.Product;


public interface ProductService {
	Product saveProduct(Product product);
	List<Product> getAllProducts();
	Product getProductById(long id);
	Product updateEmployee(Product product, long id);
	void deleteProduct(long id);
}
