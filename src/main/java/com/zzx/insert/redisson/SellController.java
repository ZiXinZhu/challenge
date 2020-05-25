package com.zzx.insert.redisson;


import org.redisson.api.RLock;
import org.redisson.api.RedissonClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

@RestController
public class SellController {

    @Autowired
    RedisTemplate<String, Object> redisTemplate;

    @Autowired
    private RedissonClient redisson;

    @GetMapping("/save")
    public void add() {
        redisTemplate.opsForValue().set("aaa", "100");
    }

    String lockKey = "Redisson";

    @GetMapping("/sell")
    public void sell() {
        for (int i = 0; i < 55; i++) {
            RLock lock = redisson.getLock(lockKey);
            lock.lock(60, TimeUnit.SECONDS); //设置60秒自动释放锁  （默认是30秒自动过期）
            int stock = Integer.parseInt(String.valueOf(redisTemplate.opsForValue().get("aaa")));
            if (stock > 0) {
                redisTemplate.opsForValue().set("aaa", (stock - 1) + "");
                System.out.println("test1-lockkey:" + lockKey + ",stock:" + (stock - 1) + "");
            }
            lock.unlock(); //释放锁
        }
    }
}
