package com.kamble.demo.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.kamble.demo.model.User;
import com.kamble.demo.service.UserService;

@Controller
public class HomeController {
	
	@Autowired
	private UserService userService;

	@GetMapping("/")
	public String index() {
		
		return "index"; //Returns JSP name
	}
	
	@GetMapping("/signUp") 
	public String signUp() {
		
		return "signUp";
	}
	
	@GetMapping("/userRegister")
	public ModelAndView userRegister() {
		
		User user = new User();
		
		return new ModelAndView("userRegister", "newUser", user);
	}
	
	@PostMapping("/userRegister")
	public String afterUserRegistr(User user) {
		
		System.out.println(user);
		
		//Saving user in the database
		userService.saveUser(user);
		
		return "index";
	}
	
	
	@GetMapping("/signIn")
	public ModelAndView signIn() {
		
		User user = new User();
		
		return new ModelAndView("signIn", "newSignIn", user);
	}
	
	
	@PostMapping("/signIn")
	public String afterSignIn(User user, HttpSession session) {
		
		User dbUser = userService.getUserByUsername(user.getUserName());
		
		//Check whether user with this username exists, else invalid Sign in
		if(dbUser != null) {
			
			//If yes, then check whether the password matches, if yes generate session or else invalid Sign in
			if(user.getPassword().equals(dbUser.getPassword())) {
				
				//generate session with key and value both as username
				session.setAttribute("username", user.getUserName());
			
				
				System.out.println(session.getAttribute("username"));
				
				return "userDashboard";
			}
			
			else {
				
				return "invalidSignIn";	
			}
		}
		
		else return "invalidSignIn";
		
		//return "index";
		
	}
	

}
