package com.atguigu.factory.abstractmethod.order;

import com.atguigu.factory.abstractmethod.pizza.BJCheesePizza;
import com.atguigu.factory.abstractmethod.pizza.BJPepperPizza;
import com.atguigu.factory.abstractmethod.pizza.Pizza;

/**
 * @author Rain
 * @version 1.0
 * @date 2021/1/19 16:27
 */
public class BJFactory implements AbsFactory {
    @Override
    public Pizza createPizza(String orderType) {
        System.out.println("使用的是抽象工厂的模式");
        Pizza pizza=null;
        if (orderType.equals("cheese")){
            pizza=new BJCheesePizza();
        }else if (orderType.equals("pepper")){
            pizza=new BJPepperPizza();
        }
        return pizza;
    }
}
