package com.training;

public class Speaker {

	
	
	private String firstName;
	private String topic;
	private String duration;
	
	
	public Speaker(String firstName, String topic, String duration) {
		super();
		this.firstName = firstName;
		this.topic = topic;
		this.duration = duration;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getTopic() {
		return topic;
	}
	public void setTopic(String topic) {
		this.topic = topic;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	
	public String toString() {
		
		return this.firstName +"," +this.topic +"," +this.duration;
		
	}
	
}
