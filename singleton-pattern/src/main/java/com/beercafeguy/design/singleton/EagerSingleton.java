package com.beercafeguy.design.singleton;

public class EagerSingleton {
    private EagerSingleton() {
    }

    private static EagerSingleton singleton=new EagerSingleton();
    public static EagerSingleton getSingleInstance(){
        return singleton;
    }
}
