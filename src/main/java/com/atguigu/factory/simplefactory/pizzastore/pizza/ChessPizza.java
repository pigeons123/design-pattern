package com.atguigu.factory.simplefactory.pizzastore.pizza;

/**
 * @author Rain
 * @version 1.0
 * @date 2021/1/19 13:17
 */
public class ChessPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("给制作奶酪准备原材料");
    }

}
