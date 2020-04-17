package com.lindeyao.jdk.learnjdk8.design_patterns.bridging.arearestaurant;

/**
 * 桥接模式：ConcreteImplementor角色--外婆家
 *
 * @author ldy
 * @create 2020-04-17 11:24
 */
public class WaiPoJiaRestaurant implements Restaurant {

    @Override
    public String taste() {
        return "红烧肉比较一般";
    }

}
