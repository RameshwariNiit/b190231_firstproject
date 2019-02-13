package com.niit.online.cricket.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.online.cricket.model.Product;

@Transactional
@Repository("productdao")
public class ProductDaoImpl implements ProductDaoI {
	@Autowired
	SessionFactory sessionFactory;

	public boolean addProduct(Product product) {
		try {

			sessionFactory.getCurrentSession().save(product);

			return true;

		}

		catch (Exception e)

		{

			return false;

		}
	}

	public boolean deleteProduct(Product product) {
		try {

			sessionFactory.getCurrentSession().delete(product);

			return true;

		}

		catch (Exception e)

		{

			return false;

		}
	}

	public boolean updateProduct(Product product) {
		try {

			sessionFactory.getCurrentSession().update(product);

			return true;

		} catch (Exception e) {

			return false;

		}
	}

	public Product getProduct(Integer id) {
		try

		{

			return sessionFactory.getCurrentSession().get(Product.class, id);

		}

		catch (Exception e)

		{

			return null;

		}
	}

	@SuppressWarnings("unchecked")
	public List<Product> retreiveAllProducts() {
		try {

			return sessionFactory.getCurrentSession().createQuery("from Product").getResultList();

			}

			catch (HibernateException e) {

				e.printStackTrace();

				return null;

				

			}
	}

}
