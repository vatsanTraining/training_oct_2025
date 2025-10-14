package com.training;

public class Address {

	
	private String addrssLine1;
	private String addressLine2;
	private String city;
	private long pincode;
	public String getAddrssLine1() {
		return addrssLine1;
	}
	public void setAddrssLine1(String addrssLine1) {
		this.addrssLine1 = addrssLine1;
	}
	public String getAddressLine2() {
		return addressLine2;
	}
	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public long getPincode() {
		return pincode;
	}
	public void setPincode(long pincode) {
		this.pincode = pincode;
	}
	
	public String toString() {
		
		return this.addrssLine1 +","+this.addressLine2+","+this.pincode;
	}
	
}
