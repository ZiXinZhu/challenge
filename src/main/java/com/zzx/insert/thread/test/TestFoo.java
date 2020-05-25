package com.zzx.insert.thread.test;

public class TestFoo {
    public static void main(String[] args) throws InterruptedException {
        Foo foo = new Foo();
        foo.first(new Runnable() {
            @Override
            public void run() {
                System.out.println("one");
            }
        });
        foo.second(new Runnable() {
            @Override
            public void run() {
                System.out.println("two");
            }
        });
        foo.third(new Runnable() {
            @Override
            public void run() {
                System.out.println("three");
            }
        });
    }
}
