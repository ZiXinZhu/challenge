package com.zzx.insert.design.module_oserver;

public class DoObserver {
    public static void main(String[] args) {
        Subject abstractSubject = new Subject();
        Observer abstractObserver = new Observer();
        abstractSubject.addObserver(abstractObserver);
        abstractSubject.execut("更新");
    }
}
