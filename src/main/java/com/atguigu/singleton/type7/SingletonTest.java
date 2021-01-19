package com.atguigu.singleton.type7;

/**
 * @author Rain
 * @version 1.0
 * @date 2021/1/19 12:59
 */
public class SingletonTest {
    public static void main(String[] args) {
        System.out.println(Singleton.INSTANCE);
        Singleton instance = Singleton.INSTANCE;
        instance.sayOk();
    }
}

enum Singleton{
    INSTANCE;
    public void sayOk(){
        System.out.println("ok~");
    }
}
