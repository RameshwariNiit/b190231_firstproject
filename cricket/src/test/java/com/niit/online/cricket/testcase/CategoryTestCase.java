package com.niit.online.cricket.testcase;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.online.cricket.dao.CategoryDaoI;
import com.niit.online.cricket.model.Category;

import junit.framework.Assert;

public class CategoryTestCase 
{
	
	
	AnnotationConfigApplicationContext context;
	Category category;
	CategoryDaoI categorydao;
	

	@Before
	public void init()

	{

		context=new AnnotationConfigApplicationContext();

		context.scan("com.niit");

		context.refresh();

		categorydao=(CategoryDaoI)context.getBean("categorydao");

		category=new Category();

	

	}
	
	
	
	@SuppressWarnings("deprecation")
	@Test
	public void test()
	{
		category.setCatName("Cricket");

		category.setCatDesc("Outdoor Game ");

		Assert.assertEquals("Category added successfully", true, categorydao.addCategory(category) );
	
	}

}
