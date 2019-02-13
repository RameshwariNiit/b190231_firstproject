package com.niit.online.cricket.testcase;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.online.cricket.dao.CategoryDaoI;
import com.niit.online.cricket.dao.ProductDaoI;
import com.niit.online.cricket.dbconfig.HibernateConfig;
import com.niit.online.cricket.model.Category;
import com.niit.online.cricket.model.Product;

import junit.framework.Assert;

public class ProductTestCase 
{
	AnnotationConfigApplicationContext context;

	ProductDaoI productDao;

	CategoryDaoI categoryDao;

	Product product;

	Category category;
	
	

	@Before
	public void init()

	{

		context = new AnnotationConfigApplicationContext(HibernateConfig.class);
	
		productDao =(ProductDaoI)context.getBean("productdao");

		product = new Product();

		categoryDao=(CategoryDaoI)context.getBean("categorydao");

		category=new Category();

	}
	
	
	
	@SuppressWarnings("deprecation")
	@Test
	public void test()
	{
		category.setCatName("Cricket");

		category.setCatDesc("it is outer game world famous");

		product.setProductName("Bat");

		product.setProductDesc("Kookaburra bat gray color");

		product.setProductPrice(1200);

		product.setCategory(category);

		Assert.assertEquals("Category added successfully", true, categoryDao.addCategory(category) );

		Assert.assertEquals("Product added successfully", true, productDao.addProduct(product) );
		
	}
	
	/*@Test

	public void test()

	{

		product.setProductId(1);

		productDao.deleteProduct(product);

	}*/



/*	@Test
	public void test()

	{

		product = productDao.getProduct(1);

		product.setProductDesc("color gray 4 inches");

		product.setProductPrice(300);

		category.setCatId(1);

		product.setCategory(category);



		

		Assert.assertEquals("Product updated successfully", true, productDao.updateProduct(product));

	}

*/

	/*@Test

	public void test()

	{

		List<Product> products = productDao.retreiveAllProducts();

		for(int i=0;i<products.size();i++)

		{

			Product product = (Product) products.get(i);

			System.out.println(product.getProductName()+","+product.getProductDesc()+","+product.getProductPrice());

		}

		

	}*/

}
