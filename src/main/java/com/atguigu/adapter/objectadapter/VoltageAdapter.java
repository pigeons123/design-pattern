package com.atguigu.adapter.objectadapter;


/**
 * @author Rain
 * @version 1.0
 * @date 2021/1/20 16:51
 */
public class VoltageAdapter implements IVoltage5V {
    Voltage220V voltage220V=null;

    public VoltageAdapter(Voltage220V voltage220V) {
        this.voltage220V = voltage220V;
    }

    @Override
    public int output5V() {
      int dst=0;
      if (voltage220V!=null){
          int src=voltage220V.output220V();
          dst=src/40;
      }
      return dst;
    }
}
