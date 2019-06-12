package com.nanyin.test.design.facade;

public class App {
    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.addService(new MysqlService());
        facade.addService(new ApacheService());
        facade.start();
        facade.stop();
    }
}
