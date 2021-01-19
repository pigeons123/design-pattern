package com.atguigu.factory.factorymethod.pizzastore.order;

import com.atguigu.factory.factorymethod.pizzastore.pizza.BJCheesePizza;
import com.atguigu.factory.factorymethod.pizzastore.pizza.BJPepperPizza;
import com.atguigu.factory.factorymethod.pizzastore.pizza.Pizza;

/**
 * @author Rain
 * @version 1.0
 * @date 2021/1/19 16:07
 */
public class BJOrderPizza extends OrderPizza {
    @Override
    Pizza createPizza(String orderType) {
        Pizza pizza=null;
        if (orderType.equals("cheese")){
            pizza=new BJCheesePizza();
        }else if (orderType.equals("pepper")){
            pizza=new BJPepperPizza();
        }
        return pizza;
    }
}
