package com.atguigu.factory.abstractmethod.order;


import com.atguigu.factory.abstractmethod.pizza.LDCheesePizza;
import com.atguigu.factory.abstractmethod.pizza.LDPepperPizza;
import com.atguigu.factory.abstractmethod.pizza.Pizza;

/**
 * @author Rain
 * @version 1.0
 * @date 2021/1/19 16:27
 */
public class LDFactory implements AbsFactory {
    @Override
    public Pizza createPizza(String orderType) {
        System.out.println("使用的是抽象工厂的模式");
        Pizza pizza=null;
        if (orderType.equals("cheese")){
            pizza=new LDCheesePizza();
        }else if (orderType.equals("pepper")){
            pizza=new LDPepperPizza();
        }
        return pizza;
    }
}
