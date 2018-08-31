package com.beercafeguy.design.singleton;

public class Singleton {
    public String str;
    private Singleton() {
    }

    private static Singleton singleton=null;
    public static Singleton getSingleInstance(){
        if(singleton ==null){
            singleton= new Singleton();
        }
        return singleton;
    }
}
