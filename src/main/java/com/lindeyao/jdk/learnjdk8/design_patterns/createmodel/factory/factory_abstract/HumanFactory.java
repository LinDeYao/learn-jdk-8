package com.lindeyao.jdk.learnjdk8.design_patterns.createmodel.factory.factory_abstract;

/**
 * 抽象工厂方法--抽象工厂类
 *
 * @author lindeyao
 * @create 2019-11-18-16:26
 */
public interface HumanFactory {

    // 创建一个黄色人种
    public IHuman createYellowHuman();

    // 创建一个白色人种
    public IHuman createWhiteHuman();

    // 创建一个黑色人种
    public IHuman createBlackHuman();

}
