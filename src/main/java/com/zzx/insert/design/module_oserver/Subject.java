package com.zzx.insert.design.module_oserver;

public class Subject extends AbstractSubject {

    String state = "null";

    public void execut(String state) {
        this.state = state;
        System.out.println("发送者：" + state);
        this.notifyOberver(state);
    }
}
