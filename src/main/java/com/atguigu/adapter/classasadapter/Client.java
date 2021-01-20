package com.atguigu.adapter.classasadapter;

/**
 * @author Rain
 * @version 1.0
 * @date 2021/1/20 16:56
 */
public class Client {
    public static void main(String[] args) {
        System.out.println("====类适配器模式===");
        Phone phone = new Phone();
        phone.charging(new VoltageAdapter());
    }
}
