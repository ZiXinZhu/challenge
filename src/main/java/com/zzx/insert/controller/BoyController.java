package com.zzx.insert.controller;


import com.zzx.insert.po.Boy;
import com.zzx.insert.server.BoyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BoyController {

    @Autowired(required = false)
    BoyService boyServer;

    @GetMapping("/boy")
    public Boy selectByPrimaryKey() {
        return boyServer.selectByPrimaryKey(1);
    }
}
