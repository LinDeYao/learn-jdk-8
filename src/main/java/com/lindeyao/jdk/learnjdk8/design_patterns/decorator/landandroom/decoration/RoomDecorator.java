package com.lindeyao.jdk.learnjdk8.design_patterns.decorator.landandroom.decoration;

import com.lindeyao.jdk.learnjdk8.design_patterns.decorator.landandroom.normal.Land;

/**
 * 装饰者模式： 主要看这个类，与需要被装饰对象一样，实现相同的父类或者接口，
 * 并持有接口的引用(用于执行被装饰者对象的方法，并进行相应扩展，使方法达到增强)
 *
 * @author ldy
 * @create 2020-04-22 14:18
 */
public abstract class RoomDecorator extends Land {

    // protected可以让子类使用，同时，拥有装饰者对象，写在这里，主要是不用每个装饰者的子类都写一遍。
    protected Land land;

    // 一般都是通过构造者模式注入
    public RoomDecorator(Land land) {
        super();
        this.land = land;
    }

    public RoomDecorator() { }

}
