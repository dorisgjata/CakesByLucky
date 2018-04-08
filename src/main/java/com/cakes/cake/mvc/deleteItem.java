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
                out.println("<html>");
                out.println("<head>");
                out.println("<title>result</title>"); 
                out.println("</head>");
                out.println("<body>");
                out.println("<h1>Dessert removed  cart </h1>");
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


        out.println("<table>");
        out.println("</body>");
        out.println("</html>");
        }
        }
        }
