package com.zzx.insert.controller;

import com.zzx.insert.thread.custom.CustomThreadPool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.ThreadPoolExecutor;

@RestController
public class CustomThreadPoolController {
    @Autowired
    CustomThreadPool customThreadPool;

    @Autowired
    ThreadPoolExecutor threadPoolExecutor;
    @GetMapping("/thread.execute")
    public void execute(){
        System.out.println("1111");
        threadPoolExecutor.execute(new CustomThreadPool.MyTask("zhuziixn") );
    }

    @GetMapping("/thread.execute.other")
    public void executeOther(){
        System.out.println("2221");
        threadPoolExecutor.execute(new CustomThreadPool.MyTask("other") );
    }
}
