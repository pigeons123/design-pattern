package com.atguigu.factory.factorymethod.pizzastore.pizza;

/**
 * @author Rain
 * @version 1.0
 * @date 2021/1/19 15:04
 */
public class LDCheesePizza extends Pizza {

    @Override
    public void prepare() {
        setName("伦敦的奶酪pizza" );
        System.out.println("伦敦的奶酪pizza 准备原材料");
    }
}
