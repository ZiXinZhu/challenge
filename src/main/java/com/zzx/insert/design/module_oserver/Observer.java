package com.zzx.insert.design.module_oserver;

public class Observer extends AbstractObserver{
    String state="default";


    @Override
    void update(String state) {
        this.state=state;
        System.out.println("观察者："+state);
    }
}
