package com.zzx.insert.thread;

import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.*;


@RestController
public class DoCallable {


    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CallableThread mainThread = new CallableThread("http://123.207.231.159:8088/user/all");
        ExecutorService pool = Executors.newFixedThreadPool(5);
        Future f = pool.submit(mainThread);
        try {
            System.out.println(">>>" + f.get(10, TimeUnit.SECONDS).toString());
        } catch (TimeoutException e) {
            e.printStackTrace();
        }
        // 关闭线程池
        pool.shutdown();
    }

}
