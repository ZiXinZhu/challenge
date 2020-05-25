package com.zzx.insert.design.moudle_strategy;

public class Context {
    private IStrategy strategy;

    public Context(IStrategy strategy) {
        this.strategy = strategy;
    }

    public void execut() {
        this.strategy.execut();
    }

    ;
}
