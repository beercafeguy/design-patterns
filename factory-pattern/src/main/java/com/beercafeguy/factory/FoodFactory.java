package com.beercafeguy.factory;

public class FoodFactory {
    public Food getFood(String order){
        if(order.equals("cake"))
            return new Cake();
        else if (order.equals("pizza"))
            return new Pizza();
        else
            return null;
    }
}
