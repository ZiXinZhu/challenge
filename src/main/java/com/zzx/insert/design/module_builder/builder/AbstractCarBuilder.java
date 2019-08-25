package com.zzx.insert.design.module_builder.builder;

import com.zzx.insert.design.module_builder.car.AbstractCar;

import java.util.List;

public abstract class AbstractCarBuilder {

    public abstract AbstractCar build();

    public abstract AbstractCarBuilder setOrder(List<String> order) ;

    public abstract AbstractCarBuilder setColor(String color) ;

    public abstract AbstractCarBuilder setMoney(String money) ;


}
