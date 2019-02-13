package com.niit.online.cricket.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.online.cricket.model.Category;


@Transactional
@Repository("categorydao")
public class CategoryDaoImpl implements CategoryDaoI
{

	@Autowired
	SessionFactory sf;
	
	public boolean addCategory(Category category) 
	{
		
		
		try
		
		{
			 sf.getCurrentSession().save(category);
			 return true;
			
		}
		catch (Exception e)
		{
			e.printStackTrace();
			return false;	
		}
		
		
	}

	public boolean deletCategory(Category category) {
		try {
			sf.getCurrentSession().remove(category);

			return true;

		} catch (Exception e) {
			return false;
		}
	}

	public boolean updateCategory(Category category) 
	{
		
		try {

			sf.getCurrentSession().update(category);
			return true;

		} catch (Exception e) {
			return false;
		}
	}

	public Category getCategory(Integer id) {
		try {
			return sf.getCurrentSession().get(Category.class, id);
		} 
		catch (Exception e) 
		{
			System.out.println(e);
			return null;
		}
	}

	public List<Category> retreiveAllCategories() {
		try {

			return sf.getCurrentSession().createQuery("from Category", Category.class).getResultList();
		} catch (HibernateException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	

}
