package com.niit.online.cricket.dao;

import java.util.List;

import org.springframework.stereotype.Component;

import com.niit.online.cricket.model.Category;


@Component
public interface CategoryDaoI
{
	
	boolean addCategory(Category category);

	boolean deletCategory(Category category);

	boolean updateCategory(Category category);

	Category getCategory(Integer id);

	List<Category> retreiveAllCategories();

}
