package com.beercafeguy.design.singleton;

/***
 * This is also called as LazySingleton
 *
 * Only applicable for single threaded envs because if two threads enter if check at the same time,
 * Both will get false so both will fire new.
 *
 */
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
