package com.cakes.cake;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

public class CustomerInformation{

@Getter @Setter private String FirstName;
@Getter @Setter private String LastName;
@Getter @Setter private String Street;
@Getter @Setter private String City;
@Getter @Setter private String State;
@Getter @Setter private int Zipcode=0;
@Getter @Setter private int PhoneNumber=0;
@Getter @Setter private String PaymentMethod;

@Override public String toString(){
    return String.format("First name: %s \n",FirstName);
    return String.format("Last name: %s \n",LastName);
    return String.format("Street: %s",Street);
    return String.format("City: %s \n",City);
    return String.format("State: %s \n",State);
    return String.format("Zip code: %d \n",Zipcode);
    return String.format("Phone number: %d \n",PhoneNumber);
    return String.format("Payment Method: %s \n",PaymentMethod);
    
}



}