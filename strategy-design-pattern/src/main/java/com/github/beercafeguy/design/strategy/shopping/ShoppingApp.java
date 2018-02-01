package com.github.beercafeguy.design.strategy.shopping;

public class ShoppingApp {
    public static void main(String[] args) {
        System.out.println("##########Welcome to Shopping Mart###########");
        ShoppingCart cart=new ShoppingCart();
        cart.addItem(new Item(101,"Milk",23.80));
        cart.addItem(new Item(102,"Apple",90.80));
        cart.addItem(new Item(104,"Peanut Butter",80.0));
        cart.removeItem(102);
        cart.pay(new PaytmStrategy("8050586234","1234"));
        cart.pay(new CreditCardStrategy("Joe","1111222233334444","123","20230112"));
    }
}
