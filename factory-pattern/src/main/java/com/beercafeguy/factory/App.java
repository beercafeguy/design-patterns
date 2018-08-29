package com.beercafeguy.factory;

import java.util.Scanner;

/**
 * Hello Food Factory!
 *
 */
public class App {
    public static void main( String[] args ) {
        System.out.println( "Hello Food Factory!" );
        System.out.println("This is a creational pattern.");
        Scanner sc=new Scanner(System.in);
        FoodFactory foodFactory=new FoodFactory();
        Food food = foodFactory.getFood(sc.nextLine());
        System.out.println("The factory returned "+food.getClass());
        System.out.println(food.getType());
    }
}
