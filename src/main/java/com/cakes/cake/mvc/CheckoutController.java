package com.cakes.cake.mvc;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Value;
import com.cakes.cake.model.ChargeRequest;

@Controller
public class CheckoutController{
    @Value("pk_test_XiN2djuA00o46n9VUKYMcOo4")
    private String stripePublicKey;
    @RequestMapping("/checkout")
    public String checkout(String string, Model model){
        model.addAttribute("amount", 1000);
        model.addAttribute("currency", ChargeRequest.Currency.USD);
        model.addAttribute("stripePublickey", stripePublicKey);
    return "checkout";

    }
}