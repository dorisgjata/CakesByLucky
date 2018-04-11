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
public class descontroller{
@RequestMapping(value="/desserts", method=RequestMethod.POST)

public void doPost(HttpServletRequest request, HttpServletResponse response)
throws Exception {package com.cakes.cake.mvc;

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
public class descontroller{
@RequestMapping(value="/desserts", method=RequestMethod.POST)

public void doPost(HttpServletRequest request, HttpServletResponse response)
throws Exception {
HttpSession session = request.getSession();
Cart shoppingCart;
shoppingCart = (Cart) session.getAttribute("cart");
if(shoppingCart == null){
shoppingCart = new Cart();
session.setAttribute("cart", shoppingCart);
}
String name = request.getParameter("name");
Integer price = Integer.parseInt(request.getParameter("price"));
shoppingCart.addToCart(name, price);
session.setAttribute("cart", shoppingCart);
try (PrintWriter out = response.getWriter()) {


out.println("<!DOCTYPE html>");
out.println("<html xmlns:th='http://www.thymeleaf.org>'");
out.println("<head>");
out.println("<meta http-equiv='Content-Type' content='text/html; charset=UTF-8'/><meta name='viewport' content='width=device-width, initial-scale=1'>");
out.println("<link rel='stylesheet' href='https://cdnjs.cloudflare.com/ajax/libs/bulma/0.6.2/css/bulma.min.css'/>");
out.println("<script src='https://ajax.googleapis.com/ajax/libs/jquery/2.1.1/jquery.min.js'></script>");
out.println("<link rel='stylesheet' type='text/css; href='https://cdnjs.cloudflare.com/ajax/libs/lightbox2/2.10.0/css/lightbox.min.css'>");
out.println("<script type='text/javascript' src='https://cdnjs.cloudflare.com/ajax/libs/lightbox2/2.10.0/js/lightbox-plus-jquery.min.js'></script>");
out.println("<title>result</title>"); 
out.println("</head>");
out.println("<body>");
out.println("<section class='hero is-medium is-info'>");
out.println("<div class='hero-foot'>");
out.println("<div class='container'>");
out.println("<nav class='tabs is-boxed'>");
out.println("<ul>");
out.println("<li><a href='/main'>Gallery</a></li>");
out.println("<li><a href='/cake'>Cake</a></li>");    
out.println("<li><a href='/desserts'>Buy Desserts</a></li>");     
out.println("<li><a href='/contact'>Contact</a></li>");     
out.println("</ul></nav></div></div></section>");

out.println("<h1>Dessert successfully added to cart </h1>");
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
out.println("<table align='center'><tr><td><input type='submit' class='button is-info' align='center' value='Checkout'></td></tr></table>");


out.println("</body>");
out.println("</html>");
}

}
}
HttpSession session = request.getSession();
Cart shoppingCart;
shoppingCart = (Cart) session.getAttribute("cart");
if(shoppingCart == null){
shoppingCart = new Cart();
session.setAttribute("cart", shoppingCart);
}
String name = request.getParameter("name");
Integer price = Integer.parseInt(request.getParameter("price"));
shoppingCart.addToCart(name, price);
session.setAttribute("cart", shoppingCart);
try (PrintWriter out = response.getWriter()) {
out.println("<!DOCTYPE html>");
out.println("<html>");
out.println("<head>");
out.println("<title>result</title>"); 
out.println("</head>");
out.println("<body>");
out.println("<h1>Dessert successfully added to cart </h1>");
out.println("<form action='/'><input type='submit' value='Back' style='display: block;'></form>");
out.println("<hr>");
out.println("<h2>Cart</h2>");
HashMap<String, Integer> items = shoppingCart.getCartItems();
out.println("<table border='1px'>");
int total = 0;
for(String key: items.keySet()){
    
out.println("<form action='deleteItem' method='post'><input type='hidden' name='name' value='"+key+"'><tr><td>"+key+" - </td><td>"+"$"+items.get(key)+"</td><td><input type='submit' value='delete'></td></tr></form>");
total += items.get(key);
}

out.println("<table border='1px'align='center'>");
out.println("Total cost = "+"$"+total);
out.println("<table>");
out.println("<input type='submit' align='center' value='Checkout'>");

out.println("</body>");
out.println("</html>");
}

}
}
