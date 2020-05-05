package com.lindeyao.jdk.learnjdk8.design_patterns.objectbehavior.strategy.calculation;

/**
 * 策略模式：计算（加减乘除）抽象行为
 *
 * @author ldy
 * @create 2020-05-05-10:28
 */
interface Strategy {

    // 加减乘除，抽象成一个行为：计算
    int calculate(int numberA, int numberB);

}
