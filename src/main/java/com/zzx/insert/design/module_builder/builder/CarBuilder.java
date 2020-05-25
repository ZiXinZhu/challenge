package com.zzx.insert.design.module_builder.builder;

import com.zzx.insert.design.module_builder.car.AbstractCar;
import com.zzx.insert.design.module_builder.car.Car;

import java.util.ArrayList;
import java.util.List;

public class CarBuilder extends AbstractCarBuilder {
    private List<String> order = new ArrayList<>();
    private String color;
    private String money;

    @Override
    public AbstractCar build() {
        AbstractCar car = new Car();
        car.setColor(color);
        car.setOrder(order);
        car.setMoney(money);
        return car;
    }

    @Override
    public AbstractCarBuilder setOrder(List<String> order) {
        this.order = order;
        return this;
    }

    @Override
    public AbstractCarBuilder setColor(String color) {
        this.color = color;
        return this;
    }

    @Override
    public AbstractCarBuilder setMoney(String money) {
        this.money = money;
        return this;
    }
}
