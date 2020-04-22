package com.lindeyao.jdk.learnjdk8.design_patterns.decorator.landandroom.normal;

/**
 * 装饰者模式：卧室的建造费用
 * 再原有基础费用上，加上自身需要的费用，比如买沙发，电视
 *
 * @author ldy
 * @create 2020-04-22 11:48
 */
class LivingRoom extends Room {

    // 重写了父类的功能，扩展了自己的需求 +200
    @Override
    public int cost() {
        return super.cost() + 200;
    }

}
