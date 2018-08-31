package com.beercafeguy.design.singleton;

public class StaticBlockSingleton {
    private static StaticBlockSingleton staticBlockSingleton;
    private StaticBlockSingleton() {
    }

    static{
        try{
            staticBlockSingleton=new StaticBlockSingleton();
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }

    //here advantage over Eager singleton is that we can do exception handling
    public static StaticBlockSingleton getSingleInstance(){
        return staticBlockSingleton;
    }
}
