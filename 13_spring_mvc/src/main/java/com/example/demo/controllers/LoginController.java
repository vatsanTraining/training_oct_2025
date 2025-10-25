package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpSession;

@Controller
public class LoginController {

	
	
	
	//${session.currentUser}
	
	@RequestMapping(path = "/login")
	public String login(HttpSession session) {
		
		// capturing user details validating 
		session.setAttribute("currentUser", "Ramesh");
		
		return "";
	}
	
	
	@RequestMapping(path = "/logout")
	public String logout(HttpSession session) {
		
		// capturing user details validating 
session.invalidate();
session.setAttribute("currentUser", "guest");

		return "";
	}
	
	
}
