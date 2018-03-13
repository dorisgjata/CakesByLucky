package com.cakes.cake.services;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.cakes.cake.model.ChargeRequest;
import com.stripe.Stripe;
import com.stripe.exception.APIConnectionException;
import com.stripe.exception.APIException;
import com.stripe.exception.AuthenticationException;
import com.stripe.exception.CardException;
import com.stripe.exception.InvalidRequestException;
import com.stripe.model.Charge;
@Service
public class StripeService{
    @Value("sk_test_anapvrBOyQdKrJFSpPeaTtWF")
    private String secretKey;

    @PostConstruct
    public void init(){
        Stripe.apiKey=secretKey;
    }
    public Charge charge(ChargeRequest chargeRequest)

    throws AuthenticationException, InvalidRequestException,
    APIConnectionException, CardException, APIException{
        Map<String, Object> chargeParams = new HashMap<>();
        chargeParams.put("amount", 1000);
        chargeParams.put("currency", "usd");
        chargeParams.put("source", "tok_visa");
        return Charge.create(chargeParams);
    }
}
