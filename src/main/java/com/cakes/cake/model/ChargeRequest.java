package com.cakes.cake.model;
import java.util.Currency;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
@Data
public class ChargeRequest{
    public enum Currency {USD;}  
    @Getter @Setter
    private Currency currency; 
    @Getter @Setter
    private String id;
    @Getter @Setter
    private int amount;
    @Getter @Setter
    private String stripeEmail;
    @Getter @Setter
    private String stripeToken;
}