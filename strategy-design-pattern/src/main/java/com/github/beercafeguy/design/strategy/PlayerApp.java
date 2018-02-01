package com.github.beercafeguy.design.strategy;

public class PlayerApp {
    public static void main(String[] args) {
        Player cricketPlayer=new Player(new PlayCricket());
        Player footballPlayer=new Player(new PlayFootball());
        cricketPlayer.play();
        footballPlayer.play();
    }
}
