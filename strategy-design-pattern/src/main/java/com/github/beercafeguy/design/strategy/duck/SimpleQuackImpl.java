package com.github.beercafeguy.design.strategy.duck;

public class SimpleQuackImpl implements IQuackBehaviour {
    public void quack() {
        System.out.println("Quacking..");
    }
}
