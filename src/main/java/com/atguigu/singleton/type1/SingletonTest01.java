package com.atguigu.singleton.type1;

/**
 * @author Rain
 * @version 1.0
 * @date 2021/1/19 11:08
 */
public class SingletonTest01 {
    public static void main(String[] args) {

    }
}

/*class Singleton{
    private final static Singleton instance=new Singleton();
    private Singleton(){

    }
    public static Singleton getInstance(){
        return instance;
    }
} */
class Singleton{
    private  static Singleton instance;
    private Singleton(){

    }
    static {
        instance=new Singleton();
    }
    public static Singleton getInstance(){
        return instance;
    }
}
