package com.zzx.insert.parent;


import org.springframework.stereotype.Component;

@Component
public class CoreOne extends AbstractCore {

    {
        System.out.println("子类非静态");
    }
    static {
        System.out.println("子类静态");
    }

    @Override
    String spliter() {
        return "one";
    }

    @Override
    String executer() {
        return "one";
    }
}
