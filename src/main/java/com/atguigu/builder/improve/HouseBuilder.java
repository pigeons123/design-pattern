package com.atguigu.builder.improve;

/**
 * @author Rain
 * @version 1.0
 * @date 2021/1/20 15:52
 */
public abstract class HouseBuilder {
    protected House house=new House();
    public abstract void buildBasic();
    public abstract void buildWalls();
    public abstract void roofed();
    public House buildHourse(){
        return house;
    }
}
