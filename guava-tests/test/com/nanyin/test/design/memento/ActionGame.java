package com.nanyin.test.design.memento;

public class ActionGame implements Game {

    private Memento memento;

    @Override
    public void storeGamePoint(Memento memento) {
        this.memento = memento;
    }

    @Override
    public Memento retrieveGamePoint() {
        return this.memento;
    }
}
