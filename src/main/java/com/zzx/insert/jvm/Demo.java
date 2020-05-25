package com.zzx.insert.jvm;

import com.zzx.insert.po.Boy;
import lombok.extern.slf4j.Slf4j;

/**
 * @Description 字节码指令集
 * @Author Husky
 * @Date 2018/10/22 23:11
 * 数据、指令、控制
 */
@Slf4j
public class Demo {
    public Boy methodOne(int i) {
        int j = 1;
        int sum = i + j;
        Boy boy = new Boy();
        boy.setAge(sum);
        methodTwo();
        return boy;
    }

    private void methodTwo() {
        int a = 1;
        int b = 1;
        log.info("結果：{}", a + b);
    }

    public static void main(String[] args) {
        int N_CPUS = Runtime.getRuntime().availableProcessors();
        System.out.println(N_CPUS + "");
        log.info("adasdad");
    }
}
