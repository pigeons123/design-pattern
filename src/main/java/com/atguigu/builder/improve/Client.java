package com.atguigu.builder.improve;

/**
 * @author Rain
 * @version 1.0
 * @date 2021/1/20 16:06
 */
public class Client {
    public static void main(String[] args) {
        CommonHourse commonHourse = new CommonHourse();
        new HourseDirector(commonHourse).constructHouse();
        System.out.println("************************************************");
        HighBuilding highBuilding = new HighBuilding();
        new HourseDirector(highBuilding).constructHouse();
    }
}
