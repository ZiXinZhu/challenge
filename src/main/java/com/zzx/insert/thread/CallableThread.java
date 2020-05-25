package com.zzx.insert.thread;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.concurrent.Callable;

@Component
public class CallableThread implements Callable<String> {


    String url = "";

    public CallableThread() {
    }

    public CallableThread(String name) {
        this.url = name;
    }

    @Override
    public String call() {
        RestTemplate template = new RestTemplate();
        Object s = template.getForObject(url, Object.class);
        System.out.printf("ZZX");
        return String.valueOf(s);
    }
}
