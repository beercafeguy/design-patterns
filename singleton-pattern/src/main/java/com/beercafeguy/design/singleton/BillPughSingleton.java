package com.beercafeguy.design.singleton;

public class BillPughSingleton {
    private BillPughSingleton() {
    }

    private static class BillPughHelper{
        private static final BillPughSingleton singleton=new BillPughSingleton();
    }

    public static BillPughSingleton getSingleInstance(){
        return BillPughHelper.singleton;
    }
}
