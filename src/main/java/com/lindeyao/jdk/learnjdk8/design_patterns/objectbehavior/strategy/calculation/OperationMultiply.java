package com.lindeyao.jdk.learnjdk8.design_patterns.objectbehavior.strategy.calculation;

/**
 * 策略模式：行为是两者相乘
 *
 * @author ldy
 * @create 2020-05-05 10:32
 */
class OperationMultiply implements Strategy {

    @Override
    public int calculate(int numberA, int numberB) {
        return numberA * numberB;
    }
}
