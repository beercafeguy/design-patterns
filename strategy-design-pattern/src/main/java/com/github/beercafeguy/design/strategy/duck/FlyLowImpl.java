package com.github.beercafeguy.design.strategy.duck;

public class FlyLowImpl implements IFlyBehaviour {
    public void fly() {
        System.out.println("Flying near ground");
    }
}
