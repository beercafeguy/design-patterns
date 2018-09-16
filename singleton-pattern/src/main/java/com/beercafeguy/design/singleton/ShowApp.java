package com.beercafeguy.design.singleton;

public class ShowApp {
    public static void main(String[] args) {
        System.out.println("Seat Booked: "+bookSeat("1A"));
        System.out.println("Seat Booked: "+bookSeat("1A"));
    }

    private static boolean bookSeat(String seat){
        Show show=new Show();
        return show.bookSeat(seat);
    }
}
