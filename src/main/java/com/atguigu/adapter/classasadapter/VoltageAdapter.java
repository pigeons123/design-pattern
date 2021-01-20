package com.atguigu.adapter.classasadapter;

/**
 * @author Rain
 * @version 1.0
 * @date 2021/1/20 16:51
 */
public class VoltageAdapter extends Voltage220V implements IVoltage5V {
    @Override
    public int output5V() {
        int src=output220V();
        int dst=src/40;
        return dst;
    }
}
