package com.example.demo.controllers;

import com.example.demo.dto.CustomerDto;
import com.example.demo.entity.Customer;
import com.example.demo.services.CustomerService;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelcomeController {


    private  CustomerDto customer;

	
	 private ModelAndView mdlView;
	 
	 private CustomerService service;
	 
	 
	public WelcomeController(ModelAndView mdlView, CustomerDto customer,CustomerService service) {
		super();
		this.mdlView = mdlView;
		this.customer = customer; 
		this.service = service;
	}


	@ModelAttribute(name = "typeList")
	public String[] customerTypes() {
		
		return new String[] {"RETAIL","CORPORATE"};
	}
	
	
	@RequestMapping(path = "/")
	public String init(Model model) {
		
		model.addAttribute("heading", "Abhi CRM Application");
		
		return "index";
	}
	
	
	@RequestMapping(path = "/customer",method = RequestMethod.GET)
	public ModelAndView initForm() {
		
		mdlView.addObject("command", customer);
		
		mdlView.setViewName("addcustomer");
		
		return mdlView;
	}

	
	@RequestMapping(path = "/customer",method = RequestMethod.POST)
	public String handleSubmit(@ModelAttribute("command") CustomerDto command) {
		
		this.service.save(command);
		
		return "success";
	}

	
	@RequestMapping(path = "/showcustomer", method = RequestMethod.GET)
	public String findCustomers(Model model) {
		
		List<CustomerDto> dto = this.service.findAll();
		
		model.addAttribute("list", dto);
		
		return "showcustomers";
	}

	@RequestMapping(path = "/searchByName", method =RequestMethod.GET)
	public String initCustomer() {
		
		return "search";
	}
	
	@RequestMapping(path = "/searchByName", method =RequestMethod.POST)
	public String initCustomer( Model model,@RequestParam("srchString") String name) {
		
		   model.addAttribute("list",this.service.findByName(name) );

		return "showcustomers";
	}
}
