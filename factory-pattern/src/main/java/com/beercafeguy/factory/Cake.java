package com.beercafeguy.factory;

public class Cake implements Food{
    @Override
    public String getType() {
        return "Someone ordered a Dessert!";
    }
}
