package com.niit.online.cricket.dao;

import java.util.List;

import org.springframework.stereotype.Component;

import com.niit.online.cricket.model.CreateUser;

@Component
public interface CreateUserDaoI 
{
	
	public boolean addUser(CreateUser cuser);
	public  boolean updateUser(CreateUser cuser);
	public CreateUser getUser(Integer id);
	public boolean delete(CreateUser cuser);
	public List<CreateUser> retreiveAllusers() ;
	public CreateUser getUserDetails(String email);
}
