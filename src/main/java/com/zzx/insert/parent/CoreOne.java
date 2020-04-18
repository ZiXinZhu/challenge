package com.zzx.insert.parent;


import org.springframework.stereotype.Component;

@Component
public class CoreOne extends AbstractCore {
    @Override
    String spliter() {
        return "one";
    }

    @Override
    String executer() {
        return "one";
    }
}
