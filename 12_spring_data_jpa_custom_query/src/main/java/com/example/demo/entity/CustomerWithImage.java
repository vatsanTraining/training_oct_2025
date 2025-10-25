package com.example.demo.entity;

import jakarta.persistence.*;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;


@Entity
@Table(name = "images_2027")

public class CustomerWithImage {

	

	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	    private String fileName;
	    private String contentType;
	    @Lob
	    private byte[] data;

	    // Constructors
	    public CustomerWithImage() {
	    	
	    }
	    public CustomerWithImage(String fileName, String contentType, byte[] data) {
			this.fileName = fileName;
			this.contentType = contentType;
			this.data = data;
		}
	    // Getters and Setters
	    public Long getId() {	
			return id;	
		}
	    
		public void setId(Long id) {	
			this.id = id;	
		}	

		public String getFileName() {	
			return fileName;	
		}	

		public void setFileName(String fileName) {	
			this.fileName = fileName;	
		}	

		public String getContentType() {	
			return contentType;	
		}	

		public void setContentType(String contentType) {	
			this.contentType = contentType;	
		}	

		public byte[] getData() {	
			return data;	
		}	

		public void setData(byte[] data) {	
			this.data = data;	
		}
		//toString method
		@Override	
		public String toString() {
			return "Image [id=" + id + ", fileName=" + fileName + ", contentType=" + contentType + ", data(length)=" + (data != null ? data.length : 0) + "]";
		}
		
		

}
