package com.github.beercafeguy.design.strategy.duck;

public class StrategyPatternApp {
    public static void main(String[] args) {
        Duck simpleDuck=new Duck();
        Duck cityDuck=new Duck(new FlyLowImpl(),new SweetQuackImpl());
        Duck wildDuck=new Duck(new FlyHighImpl(),new HarshQuackImpl());
        simpleDuck.fly();
        cityDuck.fly();
        wildDuck.fly();

        simpleDuck.quack();
        cityDuck.quack();
        wildDuck.quack();

    }
}
