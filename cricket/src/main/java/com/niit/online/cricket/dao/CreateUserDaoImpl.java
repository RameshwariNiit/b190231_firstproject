package com.niit.online.cricket.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.online.cricket.model.CreateUser;

@Transactional
@Repository("cuserdao")
public class CreateUserDaoImpl implements CreateUserDaoI {

	@Autowired
	SessionFactory sessionFactory;

	public boolean addUser(CreateUser cuser) {

		try {
			sessionFactory.getCurrentSession().persist(cuser);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;

		}
	}

	public boolean updateUser(CreateUser cuser) {
		try {

			sessionFactory.getCurrentSession().update(cuser);
			return true;

		} catch (Exception e) {
			return false;
		}

	}

	public CreateUser getUser(Integer id) 
	{
		try
		{
				return sessionFactory.getCurrentSession().get(CreateUser.class,id);	
		}
		catch(Exception ae)
		{
			ae.printStackTrace();
		return null;
		}
	}

	public boolean delete(CreateUser cuser) {
		try {
			sessionFactory.getCurrentSession().remove(cuser);
			
			return true;
			
		}
		catch(Exception e) 
		{
		return false;
		}
	}

	public List<CreateUser> retreiveAllusers() 
	{
	
		try {
			
			return sessionFactory.getCurrentSession().createQuery("from CreateUser",CreateUser.class).getResultList();
		}
		catch (HibernateException e) 
		{
			e.printStackTrace();
			return null;
			
		}
	}

	public CreateUser getUserDetails(String email) {
		
		try {
			return sessionFactory.getCurrentSession().createQuery("from CreateUser where email = :email",CreateUser.class).setParameter("email",email).getSingleResult();
			}catch(Exception e)
			{
				System.out.println(e);
				return null;
			}
	}

}
