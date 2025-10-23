package com.example.demo.dto;

import com.example.demo.entity.CustomerType;
import com.example.demo.model.Address;


public record CustomerDto(int customerId,String customerName,long mobileNumber,String email,
CustomerType customertype ,AddressDto billingAddress,AddressDto shippingAddress) {


}
