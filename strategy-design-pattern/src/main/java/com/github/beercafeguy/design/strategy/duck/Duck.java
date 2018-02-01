package com.github.beercafeguy.design.strategy.duck;

public class Duck {
    IFlyBehaviour flyBehaviour;
    IQuackBehaviour quackBehaviour;

    public Duck() {
        this.quackBehaviour = new SimpleQuackImpl();
        this.flyBehaviour=new SimpleFlyImpl();
    }

    public Duck(IFlyBehaviour flyBehaviour, IQuackBehaviour quackBehaviour) {
        this.flyBehaviour = flyBehaviour;
        this.quackBehaviour = quackBehaviour;
    }

    public void fly(){
        flyBehaviour.fly();
    }

    public void quack(){
        quackBehaviour.quack();
    }
}
