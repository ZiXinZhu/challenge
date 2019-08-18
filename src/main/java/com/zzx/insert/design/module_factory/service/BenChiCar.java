package com.zzx.insert.design.module_factory.service;

import com.zzx.insert.design.module_factory.service.imp.ICar;

public class BenChiCar implements ICar {
    @Override
    public void run() {
        System.out.println("奔驰车启动！");
    }

    @Override
    public void stop() {
        System.out.println("奔驰车停车！");
    }
}
