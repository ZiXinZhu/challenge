package com.zzx.insert.tree;


import lombok.Data;

@Data
public class Tree<T> {
    private T t;
    private T parent;
    private T right;
    private T left;
}
