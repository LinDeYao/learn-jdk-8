package com.lindeyao.jdk.learnjdk8.design_patterns.decorator.landandroom.normal;

/**
 * 装饰器模式：需要被装饰的抽象类
 * 需求：一块地在上面建设房间，每间房间的装修费用都不同，现在就定义需要建造的金额
 *
 * @author ldy
 * @create 2020-04-22 11:36
 */
public abstract class Land {

    // 房间费用
    abstract public int cost();

}
