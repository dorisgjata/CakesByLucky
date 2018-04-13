package com.cakes.cake.mvc;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.cakes.cake.services.StripeService;
import com.cakes.cake.model.ChargeRequest;
import com.stripe.exception.StripeException;
import com.stripe.model.Charge;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
@Controller 
public class ChargeController{
    @Autowired
    private StripeService paymentService;

    @PostMapping("/charge")
    public String charge(ChargeRequest chargerequest, Model model)
    throws StripeException{
    Charge charge = paymentService.charge(chargerequest);
    model.addAttribute("id", charge.getId());
    model.addAttribute("status", charge.getStatus());
    model.addAttribute("balance_transaction",charge.getBalanceTransaction());
    return "redirect:main";
}
@ExceptionHandler(StripeException.class)
    public String handleError(Model model, StripeException ex){
        model.addAttribute("error", ex.getMessage());
        return "results";
    }

}