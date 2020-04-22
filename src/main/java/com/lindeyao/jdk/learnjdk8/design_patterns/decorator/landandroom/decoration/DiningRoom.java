package com.lindeyao.jdk.learnjdk8.design_patterns.decorator.landandroom.decoration;

import com.lindeyao.jdk.learnjdk8.design_patterns.decorator.landandroom.normal.Land;

/**
 * 装饰者模式：餐厅类，不再继承Room类，而是继承装饰者类
 *
 * @author ldy
 * @create 2020-04-22 14:26
 */
public class DiningRoom extends RoomDecorator {

    public DiningRoom(Land land) {
        this.land = land;
    }

    // 对方法进行增强
    @Override
    public int cost() {
        return this.land.cost() + 100;
    }
}
