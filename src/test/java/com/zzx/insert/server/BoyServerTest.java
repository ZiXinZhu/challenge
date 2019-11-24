package com.zzx.insert.server;

import com.zzx.insert.po.Boy;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;


@RunWith(SpringRunner.class)
@SpringBootTest
public class BoyServerTest {

    @Autowired
    BoyService boyService;

    @Test
    public void getBoy(){
        Boy boy=boyService.selectByPrimaryKey(2);
        System.out.println(boy.getAddTime());
    }
    @Test
    public void getBoyByAge(){
        List<Boy> boy=boyService.selectByAge(21);
        System.out.println(boy.get(0));
    }
}
