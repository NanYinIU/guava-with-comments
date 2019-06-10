package com.nanyin.test.design.decorator;

public class NormalGirl extends AbstractGirl {
    @Override
    public void dyeHair() {
        System.out.println("normal hair");
    }

    @Override
    public void wearClothes() {
        System.out.println("normal clothes");
    }

    @Override
    public void pack() {
    }
}
