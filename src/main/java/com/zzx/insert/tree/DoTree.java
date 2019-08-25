package com.zzx.insert.tree;

public class DoTree {
    public static void main(String[] args) {
        int[] data=new int[]{1,5,6,2,8,3,4,9,7,0};
        //TODO 节点1
        Tree<Integer> one=new Tree();
        one.setParent(data[1]);
        //TODO 节点2
        Tree<Integer> two=new Tree();
        two.setParent(data[2]);
        //TODO 将节点2设为节点1的右孩子节点
        one.setRight(two.getParent());
        //TODO 节点3
        Tree<Integer> three=new Tree();
        three.setParent(data[3]);
        //TODO 将节点3设为节点2的右孩子节点
        two.setRight(three.getParent());
    }


}
