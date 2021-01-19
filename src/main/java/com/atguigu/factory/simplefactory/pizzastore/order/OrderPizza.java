package com.atguigu.factory.simplefactory.pizzastore.order;

import com.atguigu.factory.simplefactory.pizzastore.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Rain
 * @version 1.0
 * @date 2021/1/19 13:23
 */
public class OrderPizza {
/*    public OrderPizza(){
        Pizza pizza=null;
        String orderType;
        do{
            orderType=getType();
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
            else{
                break;
            }
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        }while (true);
    }*/
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
    SimpleFactory simpleFactory;
    Pizza pizza=null;
    public void setFactory(SimpleFactory simpleFactory) {
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
    }
}
