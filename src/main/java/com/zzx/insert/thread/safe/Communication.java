package com.zzx.insert.thread.safe;

import java.util.concurrent.*;

public class Communication {


    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ExecutorService executorService = Executors.newFixedThreadPool(5);
        Future future = executorService.submit(Communication::call);
        try {
            //TODO Callable超时时间
            System.out.println(future.get(3, TimeUnit.SECONDS).toString());
        } catch (TimeoutException e) {
            e.printStackTrace();
        }
        System.out.println("结束");
    }


    private static Long call() throws Exception {
        long sum = 0L;
        for (int i = 0; i < 7; i++) {
            Thread.sleep(300);
            sum = sum + i;
        }

        System.out.println("循环结束");
        return sum;
    }
}
