package com.zzx.insert.controller;

import com.zzx.insert.thread.custom.CustomThreadPool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomThreadPoolController {
    @Autowired
    CustomThreadPool customThreadPool;

    @GetMapping("/thread.execute")
    public void execute(){
        customThreadPool.executer().execute(new CustomThreadPool.MyTask("zhuziixn") );
    }

    @GetMapping("/thread.execute.other")
    public void executeOther(){
        customThreadPool.executer().execute(new CustomThreadPool.MyTask("other") );
    }
}
