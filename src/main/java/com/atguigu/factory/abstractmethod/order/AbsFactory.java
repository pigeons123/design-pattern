package com.atguigu.factory.abstractmethod.order;

import com.atguigu.factory.abstractmethod.pizza.Pizza;

/**
 * @author Rain
 * @version 1.0
 * @date 2021/1/19 16:26
 */
public interface AbsFactory {
    public Pizza createPizza(String orderType);

}
