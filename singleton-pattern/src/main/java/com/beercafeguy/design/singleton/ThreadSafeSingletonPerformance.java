package com.beercafeguy.design.singleton;

/***
 *  This method is called as double checked locking
 */
public class ThreadSafeSingletonPerformance {
    private ThreadSafeSingletonPerformance() {
    }

    private static ThreadSafeSingletonPerformance singleton=null;

    public static ThreadSafeSingletonPerformance getSingleInstance(){
        if(singleton ==null){
            synchronized (ThreadSafeSingletonPerformance.class) {
                if(singleton==null) {
                    singleton = new ThreadSafeSingletonPerformance();
                }
            }
        }
        return singleton;
    }
}
