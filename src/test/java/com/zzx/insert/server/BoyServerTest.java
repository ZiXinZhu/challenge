package com.zzx.insert.server;

import com.zzx.insert.po.Boy;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class BoyServerTest {

    @Autowired
    BoyService boyService;

    @Test
    public void getboy(){
        Boy boy=boyService.selectByPrimaryKey(2);
        System.out.println(boy.getAddTime());
    }

}
