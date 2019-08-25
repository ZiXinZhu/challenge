package com.zzx.insert.design.module_builder.car;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractCar {
    private List<String> order = new ArrayList<>();
    private String Color;
    private String money;

    protected abstract void run();

    protected abstract void stop();

    protected abstract void open();

    public void setOrder(List<String> order) {
        this.order = order;
    }

    public void setColor(String color) {
        Color = color;
    }

    public void setMoney(String money) {
        this.money = money;
    }

    public String getColor() {
        return Color;
    }

    public String getMoney() {
        return money;
    }

    public void start(){
        for (String s:order
             ) {
            if(s.equals("r")){
                run();
            }else if (s.equals("s")){
                stop();
            }else {
                open();
            }
        }
    }
}
