package com.lindeyao.jdk.learnjdk8.design_patterns.structuremodel.bridging.arearestaurant;

/**
 * 具体需求：评判一个地方红烧肉的口味，出现了两个维度的变化：地域和餐馆品牌
 * 桥接模式： Implementor角色--餐厅维度抽象接口
 * 这里主要是：餐馆的抽象
 *
 * @author lindeyao
 * @create 2020-04-17-11:16
 */
public interface Restaurant {

    // 评价
    public String taste();

}
