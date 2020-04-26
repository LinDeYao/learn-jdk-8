package com.lindeyao.jdk.learnjdk8.design_patterns.structuremodel.bridging.arearestaurant;

/**
 * 具体需求：评判一个地方红烧肉的口味，出现了两个维度的变化：地域和餐馆品牌
 * 桥接模式： Abstraction角色--地域维度的抽象
 * 这里主要指地区的抽象，同时拥有餐馆的引用，而不是直接实现餐馆接口
 *
 * @author ldy
 * @create 2020-04-17 11:14
 */
public abstract class AbstractCityArea {

    // 持有餐馆的对象
    protected Restaurant restaurant;

    public AbstractCityArea(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    // 定义抽象接口，地区自己本身的业务接口--评价
    public abstract void commentTaste();

}
