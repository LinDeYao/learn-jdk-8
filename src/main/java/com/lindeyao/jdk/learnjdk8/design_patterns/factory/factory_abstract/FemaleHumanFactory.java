package com.lindeyao.jdk.learnjdk8.design_patterns.factory.factory_abstract;

/**
 * 抽象工厂方法--具体工厂类，专门生产女性
 *
 * @author ldy
 * @create 2019-11-18 16:34
 */
public class FemaleHumanFactory implements HumanFactory{

    @Override
    public IHuman createYellowHuman() {
        return new FemalBlackHuman();
    }

    @Override
    public IHuman createWhiteHuman() {
        return new FemalWhiteHuman();
    }

    @Override
    public IHuman createBlackHuman() {
        return new FemalBlackHuman();
    }
}
