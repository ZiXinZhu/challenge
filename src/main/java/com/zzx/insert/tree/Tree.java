package com.zzx.insert.tree;


import lombok.Data;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Data
@Service
public class Tree<T> {
    private T t;
    private T parent;
    private T right;
    private T left;

    @PostConstruct
    public void say(){
        System.out.println("==================================================================================================");
    }
}
