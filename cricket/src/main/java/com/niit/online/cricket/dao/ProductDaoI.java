package com.niit.online.cricket.dao;

import java.util.List;

import org.springframework.stereotype.Component;

import com.niit.online.cricket.model.Product;

@Component
public interface ProductDaoI 
{
	boolean addProduct(Product product);

	boolean deleteProduct(Product product);

	boolean updateProduct(Product product);

	Product getProduct(Integer id);

	List<Product> retreiveAllProducts();

}


