package com.nanyin.test.design.factory.factoryMethod;

public class WhiteShoesFactory implements ShoesFactory{
    public Shoes getShoes(){
        return new WhiteShoes();
    }
}
