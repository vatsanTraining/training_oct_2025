package com.example.demo.controllers;

import java.awt.PageAttributes.MediaType;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.entity.CustomerWithImage;
import com.example.demo.services.MultiPartService;


import java.util.Base64; // Use this import!

@Controller
@RequestMapping(path = "/images")
public class ImageController {

	
	private MultiPartService service;
	
	private ModelAndView mdlView;

	public ImageController(MultiPartService service,ModelAndView mdlView) {
		super();
		this.service = service;
		this.mdlView = mdlView;
	}
	
	
	@GetMapping(path = "/add")
	public String init() {
		
		return "managecustomer";
	}
	
	@PostMapping("/save") 
	public String uploadImageToDB(@RequestParam("image") MultipartFile file) throws Exception {

        
            service.saveImage(file.getOriginalFilename(),file.getContentType(),file.getBytes());

            return "index";
          
}

	


	
	@GetMapping(path = "/{id}")
	public ModelAndView findById(@PathVariable long id) {
		
		 CustomerWithImage imageRef      =service.findById(id);
		                
	    byte[] image = imageRef.getData();

	    String base64Image = Base64.getEncoder().encodeToString(image);
	    
	    String dataUrl = "data:image/jpeg;base64," + base64Image;

	    mdlView.addObject("imageDataUrl", dataUrl);
	    mdlView.addObject("customerName",imageRef.getFileName());
		mdlView.setViewName("customerprofile");
		
		
		return mdlView;
	}
}
