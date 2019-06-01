package com.nanyin.test.design.factory.abstractFactory;

public interface ShoesFactory {
    public Sole createSole();
    public Shoelace createShoelace();
}
