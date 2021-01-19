package com.atguigu.factory.abstractmethod.order;


/**
 * @author Rain
 * @version 1.0
 * @date 2021/1/19 16:42
 */
public class PizzaStore {
    public static void main(String[] args) {
//        new OrderPizza(new BJFactory());
        new OrderPizza(new LDFactory());
    }
}
