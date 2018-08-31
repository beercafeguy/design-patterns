package com.beercafeguy.design.singleton;

import java.io.*;

public class SingletonSerializationTest {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        SerializableSingleton instance1=SerializableSingleton.getSingleInstance();
        ObjectOutput output=new ObjectOutputStream(new FileOutputStream("instance.ser"));
        output.writeObject(instance1);
        output.close();


        ObjectInput input=new ObjectInputStream(new FileInputStream("instance.ser"));
        SerializableSingleton instance2=(SerializableSingleton) input.readObject();
        input.close();

        //now compare both the objects
        System.out.println(instance1.hashCode());
        System.out.println(instance2.hashCode());
    }
}
