package com.zzx.insert.design.module_factory.service;

import com.zzx.insert.design.module_factory.service.imp.ICar;


public class BaoMaCar implements ICar {
    @Override
    public void run() {
        System.out.println("宝马车启动！");
    }

    @Override
    public void stop() {
        System.out.println("宝马车停车！");
    }
}
