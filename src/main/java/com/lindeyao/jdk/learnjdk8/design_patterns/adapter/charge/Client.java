package com.lindeyao.jdk.learnjdk8.design_patterns.adapter.charge;

/**
 * 适配器模式：类适配器
 * 介绍：Client类：手机进行充电
 *
 * @author ldy
 * @create 2020-04-14 11:15
 */
class Client {

    public static void main(String[] args) {
        Mobile mobile = new Mobile();
        mobile.charging(new VoltageAdapter());
    }

}
