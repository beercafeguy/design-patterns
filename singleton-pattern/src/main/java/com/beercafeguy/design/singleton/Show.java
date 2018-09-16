package com.beercafeguy.design.singleton;

import java.util.HashSet;
import java.util.Set;

public class Show {
    private Set<String> seats;


    public Show() {
        this.seats = new HashSet<>();
        seats.add("1A");
        seats.add("1B");
    }

    public boolean bookSeat(String seat){
        return seats.remove(seat);
    }
}
