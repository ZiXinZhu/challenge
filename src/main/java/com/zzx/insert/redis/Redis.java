package com.zzx.insert.redis;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

@RestController
@Slf4j
public class Redis {

    @Autowired
    RedisTemplate<String, Object> redisTemplate;


    @GetMapping("/test")
    public void redis(){
        redisTemplate.delete("zz");
        redisTemplate.opsForValue().set("zz","lq",10, TimeUnit.SECONDS);
        String res= String.valueOf(redisTemplate.opsForValue().get("zz"));
        log.info(res);
        MyMap<String,List<String>> myMap=new MyMap<>();
        List<String> list=new ArrayList<>();
        list.add("lq");
        myMap.set("zhu",list);
        redisTemplate.delete("key");
        redisTemplate.opsForValue().set("key",myMap);
        String result= String.valueOf(redisTemplate.opsForValue().get("key"));
        log.info(result);
        boolean b= redisTemplate.expire("zzx",1231,TimeUnit.SECONDS);

        redisTemplate.opsForValue().set("zzz","zzz");
        boolean bb= redisTemplate.opsForValue().setIfAbsent("123","qqq");
        System.out.println("bb"+bb);
        log.info(String.valueOf(redisTemplate.opsForValue().get("123")));
    }
}
