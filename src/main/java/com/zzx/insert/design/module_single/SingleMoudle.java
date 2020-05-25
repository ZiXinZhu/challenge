package com.zzx.insert.design.module_single;

public class SingleMoudle {
    private static SingleMoudle singleMoudle = null;

    private SingleMoudle() {
    }

    public static synchronized SingleMoudle getinstance() {
        if (singleMoudle == null) {
            return new SingleMoudle();
        }
        return singleMoudle;
    }

    public void say() {
        System.out.println("这个是单利模式");
    }
}
