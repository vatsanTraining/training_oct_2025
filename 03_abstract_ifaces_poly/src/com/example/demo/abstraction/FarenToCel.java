package com.example.demo.abstraction;

import com.example.demo.ifaces.Function;

public class FarenToCel implements Function {

	@Override
	public double apply(double val) {
		// TODO Auto-generated method stub
		return (val-32)*5/9;
	}

}
