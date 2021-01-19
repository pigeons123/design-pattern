package com.atguigu.factory.abstractmethod.pizza;

/**
 * @author Rain
 * @version 1.0
 * @date 2021/1/19 15:04
 */
public class LDPepperPizza extends Pizza {

    @Override
    public void prepare() {
        setName("伦敦的胡椒pizza" );
        System.out.println("伦敦的胡椒pizza 准备原材料");
    }
}
