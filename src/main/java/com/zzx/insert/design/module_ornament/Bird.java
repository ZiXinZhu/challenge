package com.zzx.insert.design.module_ornament;

public class Bird extends Change {
    public Bird(SunWuKong sunWuKong) {
        super(sunWuKong);
    }

    @Override
    public void action() {
        System.out.println("鸟儿飞！");
        ;
    }
}
