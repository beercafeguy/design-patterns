package com.beercafeguy.factory;

public class ComputerFactoryApp {
    public static void main(String[] args) {
        Computer pc = ComputerFactory.getComputer("pc","2 GB","500 GB","2.4 GHz");
        Computer server = ComputerFactory.getComputer("server","16 GB","1 TB","2.9 GHz");
        System.out.println("PC config: "+pc);
        System.out.println("Server Config: "+server);
    }

}
