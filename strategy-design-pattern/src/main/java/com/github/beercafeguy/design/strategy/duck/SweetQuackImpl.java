package com.github.beercafeguy.design.strategy.duck;

public class SweetQuackImpl implements IQuackBehaviour {
    public void quack() {
        System.out.println("Quacking in sweet tone");
    }
}
