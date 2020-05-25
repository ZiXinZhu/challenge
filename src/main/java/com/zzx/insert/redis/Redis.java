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
    public void redis() {
        redisTemplate.delete("zz");
        redisTemplate.opsForValue().set("zz", "lq", 10, TimeUnit.SECONDS);
        String res = String.valueOf(redisTemplate.opsForValue().get("zz"));
        log.info(res);
        MyMap<String, List<String>> myMap = new MyMap<>();
        List<String> list = new ArrayList<>();
        list.add("lq");
        myMap.set("zhu", list);
        redisTemplate.delete("key");
        redisTemplate.opsForValue().set("key", myMap);
        String result = String.valueOf(redisTemplate.opsForValue().get("key"));
        log.info(result);

        redisTemplate.delete("zzx");
//        redisTemplate.opsForValue().set("zzx","zzz");
        boolean b = redisTemplate.expire("zzx", 30, TimeUnit.SECONDS);
        System.out.println(String.valueOf(b) + ":" + redisTemplate.opsForValue().get("zzx"));

        redisTemplate.delete("123");
        boolean bb = redisTemplate.opsForValue().setIfAbsent("123", "qqq", 30, TimeUnit.SECONDS);
        System.out.println("bb:" + bb + redisTemplate.opsForValue().get("123"));
        boolean bbb = redisTemplate.opsForValue().setIfAbsent("123", "111");
        log.info(String.valueOf("bbb:" + bbb + redisTemplate.opsForValue().get("123")));
    }
}
