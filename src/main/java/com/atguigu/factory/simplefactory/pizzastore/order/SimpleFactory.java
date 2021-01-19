package com.atguigu.factory.simplefactory.pizzastore.order;

import com.atguigu.factory.simplefactory.pizzastore.pizza.ChessPizza;
import com.atguigu.factory.simplefactory.pizzastore.pizza.GreekPizza;
import com.atguigu.factory.simplefactory.pizzastore.pizza.PepperPizza;
import com.atguigu.factory.simplefactory.pizzastore.pizza.Pizza;

/**
 * @author Rain
 * @version 1.0
 * @date 2021/1/19 13:49
 */
//简单工厂类
public class SimpleFactory {
    public Pizza createPizza(String orderType){
        Pizza pizza=null;
        if (orderType.equals("greek")){
            pizza=new GreekPizza();
            pizza.setName(orderType);
        }else if (orderType.equals("chess")){
            pizza=new ChessPizza();
            pizza.setName(orderType);
        }else if (orderType.equals("pepper")){
            pizza=new PepperPizza();
            pizza.setName(orderType);
        }
        return pizza;
    }
    public static Pizza createPizza2(String orderType){
        Pizza pizza=null;
        if (orderType.equals("greek")){
            pizza=new GreekPizza();
            pizza.setName(orderType);
        }else if (orderType.equals("chess")){
            pizza=new ChessPizza();
            pizza.setName(orderType);
        }else if (orderType.equals("pepper")){
            pizza=new PepperPizza();
            pizza.setName(orderType);
        }
        return pizza;
    }
}
