package com.training;

public class Conference {  //system

	
	private String conferenceTitle;
	private String location;
	private Speaker[] speakers;
	
	
	public Conference() {
		this.speakers=  new Speaker[]{new Speaker("Java AI","Pune","90mts"),new Speaker("Spring Boot","Mumbai","60mts")};
		
		

	}
	
	
	public void printSpeakerDetails() {
	
	}
	
	
}
