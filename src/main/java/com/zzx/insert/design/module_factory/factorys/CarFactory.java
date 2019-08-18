package com.zzx.insert.design.module_factory.factorys;

import com.zzx.insert.design.module_factory.service.imp.ICar;

public class CarFactory extends AbstractFactory {
    @Override
    public <T extends ICar> T perduce(Class<T> v) {
        ICar car = null;
        try {
            car = (T) Class.forName(v.getName()).newInstance();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return (T) car;
    }
}
