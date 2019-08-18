package com.zzx.insert.design.module_factory.factorys;

import com.zzx.insert.design.module_factory.service.imp.ICar;

public abstract class AbstractFactory {
    public abstract <T extends ICar> T perduce(Class<T> v);
}
