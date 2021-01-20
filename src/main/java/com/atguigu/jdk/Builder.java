package com.atguigu.jdk;

/**
 * @author Rain
 * @version 1.0
 * @date 2021/1/20 16:13
 */
public class Builder {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("Hello World");
        stringBuilder.reverse();
        System.out.println(stringBuilder.toString());
    }
}
