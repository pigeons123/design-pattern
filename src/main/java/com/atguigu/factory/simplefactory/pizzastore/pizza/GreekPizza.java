package com.atguigu.factory.simplefactory.pizzastore.pizza;

/**
 * @author Rain
 * @version 1.0
 * @date 2021/1/19 13:23
 */
public class GreekPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("给希腊披萨订购原材料");
    }
}
