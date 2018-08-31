package com.beercafeguy.design;

import com.beercafeguy.design.singleton.Singleton;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        System.out.println("Hello Singleton!");

        //hash code check
        System.out.println("Object 1:"+ Singleton.getSingleInstance().hashCode());
        System.out.println("Object 2:"+ Singleton.getSingleInstance().hashCode());

        //equals check
        Singleton s1=Singleton.getSingleInstance();
        Singleton s2=Singleton.getSingleInstance();
        if(s1==s2){
            System.out.println("Both are same objects.Singleton is successful (at lest for single thread) ");
        }else{
            System.out.println("Both are different objects.Singleton failed (even for single thread) ");
        }
    }

}
