package com.atguigu.factory.factorymethod.pizzastore.pizza;

/**
 * @author Rain
 * @version 1.0
 * @date 2021/1/19 15:04
 */
public class BJPepperPizza extends Pizza {

    @Override
    public void prepare() {
        setName("北京的胡椒pizza" );
        System.out.println("北京的胡椒pizza 准备原材料");
    }
}
