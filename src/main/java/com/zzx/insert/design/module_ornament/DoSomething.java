package com.zzx.insert.design.module_ornament;

public class DoSomething {
    public static void main(String[] args) {
        SunWuKong sunWuKong=new Monkey();
        SunWuKong bird=new Bird(sunWuKong);
        SunWuKong fish=new Fish(sunWuKong);
        bird.action();
        fish.action();
    }
}
