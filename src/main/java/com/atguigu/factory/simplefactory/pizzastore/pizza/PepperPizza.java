package com.atguigu.factory.simplefactory.pizzastore.pizza;

/**
 * @author Rain
 * @version 1.0
 * @date 2021/1/19 13:40
 */
public class PepperPizza extends Pizza{
    @Override
    public void prepare() {
        System.out.println("给胡椒披萨准备原材料");
    }
}
