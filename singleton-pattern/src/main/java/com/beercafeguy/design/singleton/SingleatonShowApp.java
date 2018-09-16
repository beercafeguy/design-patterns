package com.beercafeguy.design.singleton;

public class SingleatonShowApp {
    public static void main(String[] args) {
        System.out.println("Seat Booked: "+bookSeat("1A"));
        System.out.println("Seat Booked: "+bookSeat("1A"));
    }

    private static boolean bookSeat(String seat){
        SingletonShow show=SingletonShow.getShow();
        return show.bookSeat(seat);
    }
}
