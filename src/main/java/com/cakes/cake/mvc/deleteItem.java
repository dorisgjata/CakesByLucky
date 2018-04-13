package com.cakes.cake.mvc;

import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import com.cakes.cake.model.Cart;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class deleteItem{
        @RequestMapping(value="/deleteItem", method=RequestMethod.POST)
public void doPost(HttpServletRequest request, HttpServletResponse response)
throws Exception {
        String name = request.getParameter("name");
        HttpSession session = request.getSession();
        Cart shoppingCart;
        shoppingCart = (Cart) session.getAttribute("cart");
        shoppingCart.deleteFromCart(name);
        session.setAttribute("cart", shoppingCart);
        shoppingCart = (Cart) session.getAttribute("cart");
        try (PrintWriter out = response.getWriter()) {
                out.println("<!DOCTYPE html>");
                out.println("<html xmlns:th='http://www.thymeleaf.org>'");
                out.println("<head>");
                out.println("<meta http-equiv='Content-Type' content='text/html; charset=UTF-8'/><meta name='viewport' content='width=device-width, initial-scale=1'>");
                out.println("<link rel='stylesheet' href='https://cdnjs.cloudflare.com/ajax/libs/bulma/0.6.2/css/bulma.min.css'/>");
                out.println("<script src='https://ajax.googleapis.com/ajax/libs/jquery/2.1.1/jquery.min.js'></script>");
                out.println("<link rel='stylesheet' type='text/css; href='https://cdnjs.cloudflare.com/ajax/libs/lightbox2/2.10.0/css/lightbox.min.css'>");
                out.println("<script type='text/javascript' src='https://cdnjs.cloudflare.com/ajax/libs/lightbox2/2.10.0/js/lightbox-plus-jquery.min.js'></script>");
                out.println("<script src='https://checkout.stripe.com/checkout.js'></script>");
                out.println("<title>result</title>"); 
                out.println("</head>");
                out.println("<style>");
  
                out.println(".hero-foot { background-image: url(https://images.pexels.com/photos/230743/pexels-photo-230743.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940); height: 5%; background-position: 50% 29% ; background-repeat: no-repeat; background-size: cover; position: relative;}");

                out.println(".container1{margin-left: 440px; font-weight: bold;}");

                out.println(".title{font-family: 'Sofia';font-size: 40px; letter-spacing: 5px;  font-weight: bold;}");


                
                out.println("</style>");
                out.println("<body>");
                out.println("<section class='hero is-medium is-info'>");
                out.println("<div class='hero-foot'>");
                out.println("<div class='container'>");
                out.println("<nav class='tabs is-boxed'>");
                out.println("<ul>");
                out.println("<li><a href='/main'>Gallery</a></li>");
                out.println("<li><a href='/AMainPage'>Cake</a></li>");    
                out.println("<li><a href='/desserts'>Buy Desserts</a></li>");     
                out.println("<li><a href='/contact'>Contact</a></li>");     
                out.println("</ul></nav></div></div></section>");
                
                out.println("<h1>Dessert removed from cart </h1>");
                out.println("<form action='/desserts'><input type='submit' value='Back' class='button is-info' style='display: block;'></form>");
                out.println("<hr>");
                out.println("<h1 align='center'>Cart</h1>");
        HashMap<String, Integer> items = shoppingCart.getCartItems();
        out.println("<table class='table is-striped' align='center'>");
        int total = 0;

        for(String key: items.keySet()){
        out.println("<form action='deleteItem' method='post'><input type='hidden' name='name' value='"+key+"'><tr><td>"+key+" - </td><td>"+"$"+items.get(key)+"</td><td><input type='submit' class='button is-info' value='delete'></td></tr></form>");
        total += items.get(key);

        }
        out.println("<table border='1px'align='center'>");
        out.println("<p align='center'>Total cost = "+"$"+total+"</p>");        
        out.println("<table align='center'><tr><td><input  action='/charge'  type='submit'id='customButton' class='button is-info' align='center' value='Checkout'></td></tr></table>");
        out.println("<script>");
        out.println("var handler = StripeCheckout.configure({key: 'pk_test_XiN2djuA00o46n9VUKYMcOo4'});");
        out.println("document.getElementById('customButton').addEventListener('click',function(e){");
        out.println("handler.open({name: 'Cakes by Lucky',amount:"+total*100+"});");
        out.println("e.preventDefault();});");
        out.println("window.addEventListener('popstate', function(){");
        out.println("handler.close();");
        out.println("});");
        out.println("</script>");
        out.println("</body>");
        out.println("</html>");
        out.println("</body>");
        out.println("</html>");
        }

        }
        }
