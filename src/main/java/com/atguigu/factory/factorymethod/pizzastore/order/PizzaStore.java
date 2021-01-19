package com.atguigu.factory.factorymethod.pizzastore.order;

import java.util.Scanner;

/**
 * @author Rain
 * @version 1.0
 * @date 2021/1/19 16:13
 */
public class PizzaStore {
    public static void main(String[] args) {
        System.out.println("请输入地区编号:");
        Scanner scanner = new Scanner(System.in);
        String ioc=scanner.nextLine();
        if (ioc.equals("bj")){
          new BJOrderPizza();
      }else if (ioc.equals("ld")){
          new LDOrderPizza();
      }
    }
}
