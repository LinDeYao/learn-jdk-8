package com.lindeyao.jdk.learnjdk8.design_patterns.objectbehavior.strategy.calculation;

/**
 * 策略模式：Context类
 *
 * @author ldy
 * @create 2020-05-05 10:34
 */
class Context {

    // 拥有策略接口对象实例
    private Strategy strategy;

    // 通过构造方法进行传参
    Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public int executeStrategy(int num1, int num2) {
        return this.strategy.calculate(num1, num2);
    }

}
