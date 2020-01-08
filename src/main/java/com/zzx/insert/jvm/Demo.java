package com.zzx.insert.jvm;

import com.zzx.insert.po.Boy;

/**
 * 数据、指令、控制
 */
public class Demo {
    public  Boy methodOne(int i){
        int j=1;
        int sum=i+j;
        Boy boy=new Boy();
        boy.setAge(sum);
        methodTwo();
        return boy;
    }

    private void methodTwo(){
        int a=1;
        int b=1;
        System.out.println(a+b);
    }

}
