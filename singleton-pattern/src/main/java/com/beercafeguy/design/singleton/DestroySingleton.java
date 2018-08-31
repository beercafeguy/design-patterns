package com.beercafeguy.design.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/***
 *  As any other good thing, we can destroy singleton as well.
 */
public class DestroySingleton {
    public static void main(String[] args) {
        Singleton instanceOne = Singleton.getSingleInstance();
        Singleton instanceTwo = null;

        try {
            Constructor[] constructors = Singleton.class.getDeclaredConstructors();
            for (Constructor constructor : constructors) {
                //this code will destroy singleton
                constructor.setAccessible(true);
                instanceTwo = (Singleton) constructor.newInstance();
                break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println(instanceOne.hashCode());
        System.out.println(instanceTwo.hashCode());
    }
}
