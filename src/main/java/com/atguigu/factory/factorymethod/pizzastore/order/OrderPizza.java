package com.atguigu.factory.factorymethod.pizzastore.order;



import com.atguigu.factory.factorymethod.pizzastore.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Rain
 * @version 1.0
 * @date 2021/1/19 13:23
 */
public abstract class OrderPizza {
    abstract Pizza createPizza(String orderType);
    public OrderPizza(){
        Pizza pizza=null;
        String orderType;
        do{
            orderType=getType();
           pizza=createPizza(orderType);
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
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
   /* public void setFactory(SimpleFactory simpleFactory) {
       String orderType="";
       this.simpleFactory=simpleFactory;
       do {
           orderType=getType();
           pizza=this.simpleFactory.createPizza(orderType);
           if (pizza!=null){
               pizza.prepare();
               pizza.bake();
               pizza.cut();
               pizza.box();
           }else {
               System.out.println("订购披萨失败");
               break;
           }
       }while (true);
    }
    public OrderPizza(SimpleFactory simpleFactory){
        setFactory(simpleFactory);
    }*/
}
