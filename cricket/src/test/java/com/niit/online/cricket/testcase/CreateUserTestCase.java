package com.niit.online.cricket.testcase;



import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.online.cricket.dao.CreateUserDaoI;
import com.niit.online.cricket.dbconfig.HibernateConfig;
import com.niit.online.cricket.model.CreateUser;

import junit.framework.Assert;

@SuppressWarnings("deprecation")
public class CreateUserTestCase
{

	AnnotationConfigApplicationContext context;
	CreateUser cuser;
	CreateUserDaoI cuserdaoi;
	
	
	
	@Before
	public void init()
	{
		
		context = new AnnotationConfigApplicationContext(HibernateConfig.class);
		cuser = new CreateUser();
		cuserdaoi = (CreateUserDaoI) context.getBean("cuserdao");
		
		
	}

	/*@SuppressWarnings("deprecation")
	@Test
	public void test() 
	{
		
		cuser.setFirstName("Rameshwari");
		cuser.setLastName("Enugurthi");
		cuser.setMobile("8686469911");
		cuser.setEmail("ramachetan11@gmail.com");
		cuser.setPassword("P@$$w0rd@123");
		cuser.setConfirmPassword("P@$$w0rd@123");
		cuser.setAddress("Nallakunta Market Hyd");
		//cuserdaoi.addUser(cuser);
		
		Assert.assertEquals("customer record add successfully", true,cuserdaoi.addUser(cuser));
		
		
	}*/
	
	//updating the customer record
	@Test
	public void test1()
	{
		cuser = cuserdaoi.getUser(1);
		cuser.setAddress("Nallakunta Veg Market Hyd Flat No 406");
		assertEquals("update successful",true,cuserdaoi.updateUser(cuser));
	}

	//to retrieve the customer information
	/*@Test
	public void retrievetest()
	{
		cuser= cuserdaoi.getUser(1);
		System.out.println(cuser.getFirstName());
	
	}*/

	/*//retreive all the customers data
	 * @Test
	public void test() {
		
		 
		List<CreateUser> customers = cuserdaoi.retreiveAllusers();
		for (int i = 0; i < customers.size(); i++) {
			  CreateUser customer = (CreateUser) customers.get(i);
				System.out.println(customer.getFirstName()+" "+customer.getLastName()+" "+customer.getMobile());
			  }
}*/
	
	
	/*@Test
	public void test() {
		
		cuser.setCustId(2);
		cuserdaoi.delete(cuser);
	}*/
	/*@Test
	public void test()
	{
		cuser = cuserdaoi.getUserDetails("ramachetan11@gmail.com");
		System.out.println(cuser.getEmail()+"\t"+cuser.getLastName());
		
	}
	*/
	
}
