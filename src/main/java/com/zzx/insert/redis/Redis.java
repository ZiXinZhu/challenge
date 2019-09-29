package com.zzx.insert.redis;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;
import java.util.concurrent.TimeUnit;

@RestController
@Slf4j
public class Redis {

    @Autowired
    RedisTemplate<String, Object> redisTemplate;


    @GetMapping("/test")
    public void redis() throws InterruptedException {
        redisTemplate.delete("zz");
        redisTemplate.opsForValue().set("zz","lq",10, TimeUnit.SECONDS);
        String res= String.valueOf(redisTemplate.opsForValue().get("zzx"));
        log.info(res);
        MyMap<String,String> myMap=new MyMap<>();
        myMap.set("zhu","qq");
        redisTemplate.delete("key");
        redisTemplate.opsForValue().set("key",myMap);
        String result= String.valueOf(redisTemplate.opsForValue().get("key"));
        log.info(result);
    }
}
