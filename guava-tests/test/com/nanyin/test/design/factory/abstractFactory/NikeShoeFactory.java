package com.nanyin.test.design.factory.abstractFactory;

public class NikeShoeFactory implements ShoesFactory {

    @Override
    public Sole createSole() {
        return new NikeBrandSole();
    }

    @Override
    public Shoelace createShoelace() {
        return createShoelace();
    }
}
