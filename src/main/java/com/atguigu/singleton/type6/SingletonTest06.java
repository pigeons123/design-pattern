package com.atguigu.singleton.type6;

/**
 * @author Rain
 * @version 1.0
 * @date 2021/1/19 11:18
 */
public class SingletonTest06 {
    public static void main(String[] args) {

    }
}

class Singleton{
    private static volatile Singleton instance;
    private Singleton(){

    }
    private static class SingletonInstance{
        private static final Singleton INSTANCE=new Singleton();
    }
    public static synchronized Singleton getInstance(){
        return SingletonInstance.INSTANCE;
    }
}
