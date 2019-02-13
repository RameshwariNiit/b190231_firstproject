package com.niit.online.cricketf.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.niit.online.cricket.dao.CreateUserDaoI;
import com.niit.online.cricket.model.CreateUser;

@Controller
public class HomeController
{

	@Autowired
	CreateUserDaoI cuserdaoi;
	
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView homePage() {
		return new ModelAndView("index");
	}
	
	
	//request for signup page 
	
	@RequestMapping("/reg")
	public ModelAndView registerPage(Model m)
	{
		CreateUser createuser = new CreateUser();
		m.addAttribute("createuser",createuser);		
		return new ModelAndView("signup");
	}
	
	@RequestMapping("/signupProcess")
	public String  signupPage(@Valid @ModelAttribute("createuser") CreateUser createuser, BindingResult result , Model m )
	{
		
			if(result.hasErrors()) {
				m.addAttribute("createuser",createuser);
				return "signup";
			}
			
			 else {

					if (!(createuser.getPassword().equals(createuser.getConfirmPassword()))) 
					{

						m.addAttribute(createuser);

						m.addAttribute("errorPass", "passwords should match");

						return "signup";

					}
					else
					{
			cuserdaoi.addUser(createuser);
						
						return "redirect:/";
					}
			 }	
			
		
	}
	
	
	
	@RequestMapping("/signin")
	public String loginpage(Model m)
	{	
		return "login";
		
	}
	

	
}
