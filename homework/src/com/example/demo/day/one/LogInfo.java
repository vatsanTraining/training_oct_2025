package com.example.demo.day.one;

import java.time.LocalDate;
import java.time.LocalTime;

public class LogInfo {

	
	private int id;
	private LocalDate date;
	private LocalTime time;
	private Severity severity;
	private String cause;
	public LogInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public LogInfo(LocalDate date, LocalTime time, Severity severity, String cause) {
		super();
		this.date = date;
		this.time = time;
		this.severity = severity;
		this.cause = cause;
	}


	@Override
	public String toString() {
		return "LogInfo [id=" + id + ", date=" + date + ", time=" + time + ", severity=" + severity + ", cause=" + cause
				+ "]";
	}
	
	
	
}
