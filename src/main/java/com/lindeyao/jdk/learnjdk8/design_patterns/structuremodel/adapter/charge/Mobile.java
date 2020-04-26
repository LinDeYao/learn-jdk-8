package com.lindeyao.jdk.learnjdk8.design_patterns.structuremodel.adapter.charge;

/**
 * 适配器模式：手机充电
 *
 * @author ldy
 * @create 2020-04-14 11:18
 */
public class Mobile {

    public void charging(Voltage5 voltage5) {
        if (voltage5.output5V() == 5) {
            System.out.println("电压刚刚好5V，开始充电");
        } else if (voltage5.output5V() > 5) {
            System.out.println("电压超过5V，都闪开 我要变成note7了");
        }
    }

}
