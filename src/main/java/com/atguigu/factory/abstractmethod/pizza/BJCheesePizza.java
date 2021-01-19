package com.atguigu.factory.abstractmethod.pizza;

/**
 * @author Rain
 * @version 1.0
 * @date 2021/1/19 15:04
 */
public class BJCheesePizza extends Pizza {

    @Override
    public void prepare() {
        setName("北京的奶酪pizza" );
        System.out.println("北京的奶酪pizza 准备原材料");
    }
}
