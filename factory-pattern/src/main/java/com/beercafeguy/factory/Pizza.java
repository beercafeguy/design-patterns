package com.beercafeguy.factory;

public class Pizza implements Food{
    @Override
    public String getType() {
        return "Someone ordered a Fast Food!";
    }
}
