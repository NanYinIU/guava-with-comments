package com.nanyin.test.design.factory.simpleFactory;

public class App {
    public static void main(String[] args) {
        ShoesFactory shoesFactory = new ShoesFactory();
        Shoes red = shoesFactory.getShoes("rea");
        Shoes white = shoesFactory.getShoes("white");
        red.getColor();
        white.getColor();
    }
}
