package com.example.demo.services;

import org.springframework.stereotype.Service;

import com.example.demo.entity.CustomerWithImage;
import com.example.demo.ifaces.ImageRepository;

@Service
public class MultiPartService {
	
	
	private ImageRepository repo;

	public MultiPartService(ImageRepository repo) {
		super();
		this.repo = repo;
	}
	
	
	public void saveImage(String imageName,String contentType,byte[] ref) {
		
		
		this.repo.save(new CustomerWithImage(imageName, contentType, ref));
	}
	

}
