package com.nanyin.test.design.strategy;

public class WalkStrategy implements TrafficStrategy{
    @Override
    public void go() {
        System.out.println("i am walking");
    }
}
