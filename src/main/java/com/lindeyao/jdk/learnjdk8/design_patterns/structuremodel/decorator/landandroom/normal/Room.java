package com.lindeyao.jdk.learnjdk8.design_patterns.structuremodel.decorator.landandroom.normal;

/**
 * 装饰者模式：房间的建造费用
 *
 * @author ldy
 * @create 2020-04-22 11:44
 */
public class Room extends Land {

    // 每个房间基础装修费用是1000
    private int money = 1000;

    @Override
    public int cost() {
        return this.money;
    }
}
