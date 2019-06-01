package com.nanyin.test.design.strategy;

public class Context {
    private TrafficStrategy trafficStrategy;

    public Context(TrafficStrategy trafficStrategy) {
        this.trafficStrategy = trafficStrategy;
    }

    public TrafficStrategy getTrafficStrategy() {
        return trafficStrategy;
    }

    public void setTrafficStrategy(TrafficStrategy trafficStrategy) {
        this.trafficStrategy = trafficStrategy;
    }

    public void doStrategy(){
        trafficStrategy.go();
    }
}
