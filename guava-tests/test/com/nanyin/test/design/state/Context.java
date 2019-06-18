package com.nanyin.test.design.state;

public class Context {
    State state;

    public Context(State state) {
        this.state = state;
    }

    public void requestToOpen() {
        state.open();
    }

    public void requestToClose() {
        state.close();
    }

    public void changeStageTo(State state){
       this.state = state;
    }
}
