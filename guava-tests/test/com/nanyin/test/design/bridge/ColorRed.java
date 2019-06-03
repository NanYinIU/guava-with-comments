package com.nanyin.test.design.bridge;

public class ColorRed implements Colors {
    @Override
    public void paint() {
        System.out.println(" paint inner with red !!");
    }
}
