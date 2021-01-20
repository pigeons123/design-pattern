package com.atguigu.adapter.classasadapter;

/**
 * @author Rain
 * @version 1.0
 * @date 2021/1/20 16:54
 */
public class Phone {
    public void charging(IVoltage5V iVoltage5V){
     if (iVoltage5V.output5V()==5){
         System.out.println("电压为5V,可以充电");
     }else if (iVoltage5V.output5V()>5){
         System.out.println("电压过高，无法充电");
     }
    }
}
