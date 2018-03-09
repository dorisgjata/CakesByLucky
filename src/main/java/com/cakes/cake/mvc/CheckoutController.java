package com.cakes.cake.mvc;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Value;
import com.cakes.cake.model.ChargeRequest;

@Controller
public class CheckoutController{
   // Stripe.apiKey = "pk_test_AWho0sekwzG2lL1alffNYEUi"
    @Value("pk_test_XiN2djuA00o46n9VUKYMcOo4")
    private String stripePublicKey;
    @RequestMapping("/checkout")
    public String checkout(String string, Model model){
        model.addAttribute("amount", 50 * 100);
        model.addAttribute("currency", "usd");
        model.addAttribute("stripePublickey", stripePublicKey);
    return "checkout";

    }
}