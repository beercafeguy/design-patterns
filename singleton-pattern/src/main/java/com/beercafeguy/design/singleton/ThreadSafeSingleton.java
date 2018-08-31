package com.beercafeguy.design.singleton;

/***
 *  This is thread safe but it has an overhead of synchronized method
 */
public class ThreadSafeSingleton {
    private ThreadSafeSingleton() {
    }

    private static ThreadSafeSingleton singleton=null;
    public synchronized static ThreadSafeSingleton getSingleInstance(){
        if(singleton ==null){
            singleton= new ThreadSafeSingleton();
        }
        return singleton;
    }
}
