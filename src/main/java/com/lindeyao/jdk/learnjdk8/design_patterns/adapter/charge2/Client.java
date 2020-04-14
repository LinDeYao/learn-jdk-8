package com.lindeyao.jdk.learnjdk8.design_patterns.adapter.charge2;

import com.lindeyao.jdk.learnjdk8.design_patterns.adapter.charge.Mobile;
import com.lindeyao.jdk.learnjdk8.design_patterns.adapter.charge.Voltage220;

/**
 * 适配器模式：对象型适配器
 * 介绍：Client类：手机进行充电
 *
 * @author ldy
 * @create 2020-04-14 11:15
 */
public class Client {

    public static void main(String[] args) {
        Mobile mobile = new Mobile();
        mobile.charging(new VoltageAdapter(new Voltage220()));
    }

}
