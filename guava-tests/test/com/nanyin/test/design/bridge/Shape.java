package com.nanyin.test.design.bridge;

public abstract class Shape {

    Colors colors;

    Shape(Colors colors) {
        this.colors = colors;
    }

    public abstract void buildShape();
}
