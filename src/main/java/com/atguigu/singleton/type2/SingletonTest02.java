package com.atguigu.singleton.type2;

/**
 * @author Rain
 * @version 1.0
 * @date 2021/1/19 10:43
 */
public class SingletonTest02{
    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        Singleton instance1 = Singleton.getInstance();
        System.out.println(instance==instance1);
        System.out.println(instance.hashCode());
        System.out.println(instance1.hashCode());
    }
}

//饿汉式（静态变量）
class Singleton{
    private Singleton(){

    }
    static {
        instance=new Singleton();
    }
    private  static Singleton instance;
    public static Singleton getInstance(){
        return instance;
    }
}
