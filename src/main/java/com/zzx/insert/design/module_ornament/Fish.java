package com.zzx.insert.design.module_ornament;

public class Fish extends Change{

    public Fish(SunWuKong sunWuKong) {
        super(sunWuKong);
    }

    @Override
    public void action() {
        System.out.println("鱼儿游！");
    }
}
