package com.zzx.insert.controller;


import com.google.common.collect.Lists;
import com.zzx.insert.parent.AbstractCore;
import com.zzx.insert.parent.CoreOne;
import com.zzx.insert.parent.CoreTwo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ParentController {

    @Autowired
    CoreOne coreOne;
    @Autowired
    CoreTwo coreTwo;
    @Autowired
    @Qualifier("two")
    AbstractCore abstractCore;

    @GetMapping("/parent.one")
    public List<String> one(){
        List<String> list= Lists.newArrayList();
        list.add(coreOne.enter("execute"));
        list.add(coreOne.enter("split"));
        list.add(coreOne.enter("load"));
        return list;
    }

    @GetMapping("/parent.two")
    public List<String> two(){
        List<String> list= Lists.newArrayList();
        list.add(coreTwo.enter("execute"));
        list.add(coreTwo.enter("split"));
        list.add(coreTwo.enter("load"));
        return list;
    }
    @GetMapping("/parent.core")
    public List<String> core(){
        AbstractTest abstractTest=new AbstractTest() {
            @Override
            public void setCode() {

            }

            @Override
            public String getCode() {
                return "OTHER";
            }
        };
        List<String> list= Lists.newArrayList();
        list.add(abstractCore.enter("execute"));
        list.add(abstractCore.enter("split"));
        list.add(abstractCore.enter("load"));
        list.add(abstractTest.getCode());
        return list;
    }
}
