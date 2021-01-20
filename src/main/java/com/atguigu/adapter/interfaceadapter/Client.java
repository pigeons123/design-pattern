package com.atguigu.adapter.interfaceadapter;

/**
 * @author Rain
 * @version 1.0
 * @date 2021/1/20 17:55
 */
public class Client {
    public static void main(String[] args) {
        new AbsAdapter(){
            @Override
            public void m1() {
                System.out.println("使用了m1的方法");
            }
        }.m1();
    }
}
