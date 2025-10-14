package com.example.demo.module.two;

public class PrintStringTask implements Runnable {

	private String string1;
	private String string2;
	
	public PrintStringTask(String string1, String string2) {

		this.string1=string1;
		this.string2=string2;
		
	}

	@Override
	public void run() {

		PrintStringVersionTwo.print(string1, string2);
	}

}
