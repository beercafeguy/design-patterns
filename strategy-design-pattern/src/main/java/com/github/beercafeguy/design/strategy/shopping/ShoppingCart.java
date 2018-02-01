package com.github.beercafeguy.design.strategy.shopping;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    boolean paid=false;
    List<Item> items;

    public ShoppingCart(){
        items=new ArrayList<Item>();
    }
    public List<Item> addItem(Item item) {
        items.add(item);
        return items;
    }

    public List<Item> removeItem(int itemId) {
       for(Item item:items){
           if(item.getItemId()==itemId){
               items.remove(item);
           }
       }
       return this.items;
    }

    public Double totalAmount() {
        Double total = 0.0;
        for (Item item : items) {
            total += item.getItemPrice();
        }
        return total;
    }

    public void pay(PaymentStrategy paymentStrategy){
        if(paid){
            System.out.println("Already paid.");
        }else if (items.size()==0){
            System.out.println("No Items in cart.");
        }else{
            paymentStrategy.pay(totalAmount());
            items.removeAll(items);
            paid=true;
        }
    }
}
