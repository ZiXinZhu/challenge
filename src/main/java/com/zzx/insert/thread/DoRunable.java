package com.zzx.insert.thread;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class DoRunable {

    @Autowired
    private JavaMailSender sender;


    @GetMapping("/send")
    public String send() {
        RunableThread emails=new RunableThread(sender,"1101648204@qq.com","1171859248@qq.com","888888");
        Thread thread=new Thread(emails);
        thread.start();
        return "success";
    }
}
