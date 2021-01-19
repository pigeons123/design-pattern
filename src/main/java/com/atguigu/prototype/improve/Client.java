package com.atguigu.prototype.improve;

/**
 * @author Rain
 * @version 1.0
 * @date 2021/1/19 17:22
 */
public class Client {
    public static void main(String[] args)  throws Exception{
        Sheep sheep = new Sheep("tom",1,"白色");
        sheep.frined=new Sheep("jack",2,"黑色");
        Sheep sheep1 = (Sheep) sheep.clone();
        Sheep sheep2 = (Sheep) sheep.clone();
        Sheep sheep3 = (Sheep) sheep.clone();
        Sheep sheep4 = (Sheep) sheep.clone();
        System.out.println(sheep);
        System.out.println(sheep.frined);
        System.out.println(sheep1);
        System.out.println(sheep.frined);
        System.out.println(sheep2);
        System.out.println(sheep.frined);
        System.out.println(sheep3);
        System.out.println(sheep4);
        System.out.println(sheep.frined==sheep1.frined);
    }
}
