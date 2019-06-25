package com.nanyin.test.design.memento;

public class Player {

    private GameState gameState;

    Player(GameState gameState) {
        this.gameState = gameState;
    }

    void setGameState(GameState gameState) {
        this.gameState = gameState;
    }

    GameState getGameState() {
        return gameState;
    }

    Memento createMemento(){
        return new Memento(gameState);
    }

    void retrieveMemento(Memento memento){
        this.gameState = memento.getGameState();
    }

}
