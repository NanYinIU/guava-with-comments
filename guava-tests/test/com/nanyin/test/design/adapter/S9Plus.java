package com.nanyin.test.design.adapter;

public class S9Plus extends ThreeLeggedPlug {
    ThreeLeggedPlug threeLeggedPlug;

    public S9Plus(ThreeLeggedPlug threeLeggedPlug) {
        this.threeLeggedPlug = threeLeggedPlug;
    }

    @Override
    public void charge() {
        threeLeggedPlug.charge();
    }
}
