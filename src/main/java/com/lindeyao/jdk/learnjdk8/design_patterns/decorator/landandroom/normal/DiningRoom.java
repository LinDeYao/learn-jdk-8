package com.lindeyao.jdk.learnjdk8.design_patterns.decorator.landandroom.normal;

/**
 * 装饰者模式：餐厅的建造费用
 * 除了自身的费用，还要加上餐厅中需要的其他费用，比如餐桌
 *
 * @author ldy
 * @create 2020-04-22 11:51
 */
class DiningRoom extends Room {

    // 重写父类的方法，扩展自己的需求
    @Override
    public int cost() {
        return super.cost() + 100;
    }

}
