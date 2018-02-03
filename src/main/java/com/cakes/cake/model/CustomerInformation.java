package com.cakes.cake.model;

import lombok.Data;
@Data
public class CustomerInformation{

 private String firstName;
 private String lastName;
 private String street;
 private String city;
 private String state;
 private int zipCode;
 private int phoneNumber;
 private String paymentMethod;

}