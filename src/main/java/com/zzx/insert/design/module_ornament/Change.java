package com.zzx.insert.design.module_ornament;

public class Change implements SunWuKong {
    private SunWuKong sunWuKong;

    public Change(SunWuKong sunWuKong) {
        this.sunWuKong = sunWuKong;
    }

    @Override
    public void action() {
        sunWuKong.action();
    }
}
