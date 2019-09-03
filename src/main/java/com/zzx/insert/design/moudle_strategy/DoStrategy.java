package com.zzx.insert.design.moudle_strategy;

public class DoStrategy {



    public static void main(String[] args) {
        Context context=new Context(new SettpTwo());
        context.execut();
        Context context1=new Context(new SettpOne());
        context1.execut();
    }
}
