package com.github.beercafeguy.design.strategy.duck;

public class HarshQuackImpl implements IQuackBehaviour {
    public void quack() {
        System.out.println("Quacking in Harsh tone");
    }
}
