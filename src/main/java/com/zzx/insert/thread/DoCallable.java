package com.zzx.insert.thread;

import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;


@RestController
public class DoCallable {


    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CallableThread mainThread = new CallableThread("http://123.207.231.159:8088/user/all");
        ExecutorService pool = Executors.newFixedThreadPool(5);
        Future f = pool.submit(mainThread);
        System.out.println(">>>" + f.get().toString());
        // 关闭线程池
        pool.shutdown();
    }

}
