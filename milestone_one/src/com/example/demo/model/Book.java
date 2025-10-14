package com.example.demo.model;

import java.util.Objects;

import com.example.demo.exceptions.RangeCheckException;

public class Book {

	
	private int bookNumber;
	private String bookName;
	private double ratePerUnit;
	
	public Book() {
		super();
	
	}
	public Book(int bookNumber, String bookName, double ratePerUnit) throws  RangeCheckException {
		super();
		this.bookNumber = bookNumber;
		this.bookName = bookName;
		if(ratePerUnit <1 || ratePerUnit>99999) {
			throw new RangeCheckException("ERR-101 Rate per unit should be 1 to 99999");
		}
		this.ratePerUnit = ratePerUnit;
	}
	public int getBookNumber() {
		return bookNumber;
	}
	public void setBookNumber(int bookNumber) {
		this.bookNumber = bookNumber;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public double getRatePerUnit() {
		return ratePerUnit;
	}
	public void setRatePerUnit(double ratePerUnit) {
		
		try {
			
			if(ratePerUnit <1 || ratePerUnit >99999) {
				
				throw new RangeCheckException("ERR-101 Rateper unit should be 1 to 99999");
			} 
		
			this.ratePerUnit = ratePerUnit;

		} catch (RangeCheckException e) {
			System.err.println(e.getMessage());
		}
	}
	@Override
	public int hashCode() {
		return Objects.hash(bookName, bookNumber, ratePerUnit);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		
		Book other = (Book) obj;
		
		return Objects.equals(bookName, other.bookName) && bookNumber == other.bookNumber
				&& Double.doubleToLongBits(ratePerUnit) == Double.doubleToLongBits(other.ratePerUnit);
	}
	@Override
	public String toString() {
		return  new StringBuffer().append(this.bookNumber).append(":").append(this.bookName).append(":").append(this.ratePerUnit).toString();
	}
	
	

}
