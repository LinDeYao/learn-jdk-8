package com.lindeyao.jdk.learnjdk8.design_patterns.structuremodel.decorator.landandroom.decoration;

import com.lindeyao.jdk.learnjdk8.design_patterns.structuremodel.decorator.landandroom.normal.Land;

/**
 * 装饰者模式：卧室类
 *
 * @author ldy
 * @create 2020-04-22 14:23
 */
public class LivingRoom extends RoomDecorator {

    public LivingRoom(Land land) {
        this.land = land;
    }

    @Override
    public int cost() {
        return this.land.cost() + 200;
    }

}
