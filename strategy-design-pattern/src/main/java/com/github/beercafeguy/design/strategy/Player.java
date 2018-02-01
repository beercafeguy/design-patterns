package com.github.beercafeguy.design.strategy;

public class Player {
    IPlayType playType;

    public Player(IPlayType playType) {
        this.playType = playType;
    }

    public void play(){
        this.playType.play();
    }
    public void warmup(){
        System.out.println("Warming up");
    }
}
