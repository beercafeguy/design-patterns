package com.beercafeguy.design.singleton;

import java.util.HashSet;
import java.util.Set;

public class SingletonShow {
    private Set<String> seats;

    private static SingletonShow INSTANCE=null;

    public static SingletonShow getShow(){
        if(INSTANCE==null){
            synchronized (SingletonShow.class){
                INSTANCE=new SingletonShow();
            }
        }
        return INSTANCE;
    }

    private SingletonShow() {
        this.seats = new HashSet<>();
        seats.add("1A");
        seats.add("1B");
    }

    public boolean bookSeat(String seat){
        return seats.remove(seat);
    }
}
