package com.nanyin.test.design.memento;

public interface Game {
    void storeGamePoint(Memento memento);
    Memento retrieveGamePoint();
}
