package com.zzx.insert.design.module_builder.car;

public class Car extends AbstractCar {
    @Override
    protected void run() {
        System.out.println("汽车启动！");
    }

    @Override
    protected void stop() {
        System.out.println("汽车停止！");
    }

    @Override
    protected void open() {
        System.out.println("汽车打开敞篷！"+"颜色:"+this.getColor()+",价值:"+this.getMoney());
    }
}
