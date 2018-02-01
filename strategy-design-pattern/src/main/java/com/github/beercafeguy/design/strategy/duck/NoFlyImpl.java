package com.github.beercafeguy.design.strategy.duck;

public class NoFlyImpl implements IFlyBehaviour {
    public void fly() {
        System.out.println("Can't fly");
    }
}
