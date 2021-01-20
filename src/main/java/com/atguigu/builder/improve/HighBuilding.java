package com.atguigu.builder.improve;

/**
 * @author Rain
 * @version 1.0
 * @date 2021/1/20 15:59
 */
public class HighBuilding extends HouseBuilder {
    @Override
    public void buildBasic() {
        System.out.println("高楼打地基");
    }

    @Override
    public void buildWalls() {
        System.out.println("高楼砌墙");
    }

    @Override
    public void roofed() {
        System.out.println("高楼盖屋顶");
    }
}
