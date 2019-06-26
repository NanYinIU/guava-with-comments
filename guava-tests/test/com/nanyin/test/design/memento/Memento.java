package com.nanyin.test.design.memento;

public class Memento {

    private GameState gameState;

    Memento(GameState gameState) {
        this.gameState = gameState;
    }

    GameState getGameState() {
        return gameState;
    }

}
