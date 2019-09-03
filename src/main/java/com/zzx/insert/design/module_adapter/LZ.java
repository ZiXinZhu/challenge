package com.zzx.insert.design.module_adapter;

public class LZ extends CodeMan implements People{
    @Override
    public void eat() {
        System.out.println("吃牛排");
    }

    @Override
    public void work() {
        System.out.println("学习");
    }

    @Override
    public void makeCode() {
        super.makeCode();
    }
}
