package com.atguigu.builder.improve;

/**
 * @author Rain
 * @version 1.0
 * @date 2021/1/20 16:01
 */
public class HourseDirector {
    HouseBuilder houseBuilder=null;

    public HourseDirector(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    public void setHouseBuilder(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }
    public House constructHouse(){
        houseBuilder.buildBasic();
        houseBuilder.buildWalls();
        houseBuilder.roofed();
        return houseBuilder.buildHourse();
    }
}
