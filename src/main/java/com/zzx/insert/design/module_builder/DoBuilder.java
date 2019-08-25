package com.zzx.insert.design.module_builder;

import com.zzx.insert.design.module_builder.builder.CarBuilder;
import com.zzx.insert.design.module_builder.car.AbstractCar;

import java.util.ArrayList;
import java.util.List;

public class DoBuilder {
    public static void main(String[] args) {
        List<String> s = new ArrayList<>();
        s.add("r");
        s.add("s");
        s.add("o");

        AbstractCar car = new CarBuilder()
                .setOrder(s)
                .setMoney("3000万")
                .setColor("橙色")
                .build();
        car.start();

    }
}
