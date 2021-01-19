package com.atguigu.factory.factorymethod.pizzastore.order;

import com.atguigu.factory.factorymethod.pizzastore.pizza.LDCheesePizza;
import com.atguigu.factory.factorymethod.pizzastore.pizza.LDPepperPizza;
import com.atguigu.factory.factorymethod.pizzastore.pizza.Pizza;

/**
 * @author Rain
 * @version 1.0
 * @date 2021/1/19 16:07
 */
public class LDOrderPizza extends OrderPizza {
    @Override
    Pizza createPizza(String orderType) {
        Pizza pizza=null;
        if (orderType.equals("cheese")){
            pizza=new LDCheesePizza();
        }else if (orderType.equals("pepper")){
            pizza=new LDPepperPizza();
        }
        return pizza;
    }
}
