package com.zzx.insert.design.module_proxy.game;

public class GamePlayer implements IGamePlayer {
    String name ="";
    @Override
    public void login(String username,String password) {
        this.name=username;
        System.out.println(name+"登陆成功!");
    }

    @Override
    public void killBoss() {
        System.out.println(name+"通关!");
    }

    @Override
    public void upGrrad() {
        System.out.println(name+"升级!");
    }
}
