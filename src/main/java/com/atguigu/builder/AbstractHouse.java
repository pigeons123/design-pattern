package com.atguigu.builder;

/**
 * @author Rain
 * @version 1.0
 * @date 2021/1/20 15:31
 */
public abstract class AbstractHouse {
    public abstract void buildBasic();
    public abstract void buildWalls();
    public abstract void roofed();
    public void build(){
        buildBasic();
        buildWalls();
        roofed();
    }
}
