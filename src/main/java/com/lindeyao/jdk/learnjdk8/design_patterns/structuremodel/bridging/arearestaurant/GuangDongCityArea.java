package com.lindeyao.jdk.learnjdk8.design_patterns.structuremodel.bridging.arearestaurant;

/**
 * 桥接模式：RefinedAbstraction角色--广东，扩展地区类
 *
 * @author ldy
 * @create 2020-04-17 11:32
 */
public class GuangDongCityArea extends AbstractCityArea {

    // 通过构造方法获取Restaurant对象引用
    public GuangDongCityArea(Restaurant restaurant) {
        super(restaurant);
    }

    @Override
    public void commentTaste() {
        // 实现自己的方法(自己的纬度)，同时扩展餐馆接口(另外一个纬度)
        System.out.println("广东的"+super.restaurant.taste());
    }
}
