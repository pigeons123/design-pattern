package com.atguigu.factory.abstractmethod.order;


import com.atguigu.factory.abstractmethod.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Rain
 * @version 1.0
 * @date 2021/1/19 16:30
 */
public class OrderPizza {
    AbsFactory factory;

    public OrderPizza(AbsFactory factory) {
        setfactory(factory);
    }

    private void setfactory(AbsFactory factory){
        this.factory=factory;
        Pizza pizza=null;
        String orderType="";
        this.factory=factory;
        do{
            orderType= getType();
            pizza=this.factory.createPizza(orderType);
            if (pizza!=null){
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            }else {
                System.out.println("订购失败");
                break;
            }
        }while (true);
    }
    private String getType(){
        try {
            BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("input pizza type:");
            String str = strin.readLine();
            return str;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
