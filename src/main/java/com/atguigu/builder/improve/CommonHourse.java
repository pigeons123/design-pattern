package com.atguigu.builder.improve;

/**
 * @author Rain
 * @version 1.0
 * @date 2021/1/20 15:56
 */
public class CommonHourse extends HouseBuilder {
    @Override
    public void buildBasic() {
        System.out.println("普通房子打地基");
    }

    @Override
    public void buildWalls() {
        System.out.println("普通房子砌墙");
    }

    @Override
    public void roofed() {
        System.out.println("普通房子盖屋顶");
    }
}
