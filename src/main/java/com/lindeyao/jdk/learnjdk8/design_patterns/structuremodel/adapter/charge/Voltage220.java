package com.lindeyao.jdk.learnjdk8.design_patterns.structuremodel.adapter.charge;

/**
 * 适配器模式：系统已存在的类（src）
 * 提供电压220的电流
 *
 * @author ldy
 * @create 2020-04-13 19:34
 */
public class Voltage220 {

    public int output220V() {
        int src = 220;
        System.out.println("我是" + src + "V电压");
        return src;
    }

}
