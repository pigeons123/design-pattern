package com.atguigu.factory.factorymethod.pizzastore.pizza;

/**
 * @author Rain
 * @version 1.0
 * @date 2021/1/19 13:17
 */
/*
    做成抽象类
*/
public abstract class Pizza {
    protected String name;
    public abstract void prepare();
    public void bake(){
        System.out.println(name+"baking:");
    }
    public void box(){
        System.out.println(name+"boxing:");
    }
    public void setName(String name){
        this.name=name;
    }
    public void cut(){
        System.out.println(name+"cuting");
    }
}
