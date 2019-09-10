package com.zzx.insert.exception;

/**
 * Created by Mr.John on 2018/12/12 21:24.
 **/
public class CommonException extends RuntimeException{
    public CommonException(String message) {
        super(message);
    }

    public static void main(String[] args) throws Exception {

        test();

        //TODO NO.2catch后没有return或者抛出新异常后面代码可以执行
        try{
            throw new Exception("参数越界");
        }catch(Exception e) {
            e.printStackTrace();
        }
        System.out.println("异常后");//可以执行



        //TODO NO.3catch后抛出新异常后面代码不执行
        if(true) {
            throw new Exception("参数越界");
        }
        System.out.println("异常后"); //抛出异常，不会执行
    }


    //TODO NO.1抛出异常后面的不再执行
    public static void test() throws Exception  {

        throw new Exception("throw异常后面代码编译通不过");
    //    System.out.println("异常后"); //编译错误，「无法访问的语句」
    }
}
