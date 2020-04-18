package com.zzx.insert.parent;


import org.springframework.stereotype.Component;

@Component("two")
public class CoreTwo extends AbstractCore {
    @Override
    String spliter() {
        return "two";
    }

    @Override
    String executer() {
        return "two";
    }
}
