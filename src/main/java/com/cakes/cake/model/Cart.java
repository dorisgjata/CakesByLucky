
package com.example.des.controller;

import java.util.HashMap;

/**
*
* @author rajat
*/
public class Cart {
HashMap<String, Integer> cartItems;


public Cart(){
cartItems = new HashMap<>();
}
public HashMap getCartItems(){
return cartItems;
}
public void addToCart(String itemId, int price){
cartItems.put(itemId, price);
}
public void deleteFromCart(String itemId){
    cartItems.remove(itemId);
}
}
