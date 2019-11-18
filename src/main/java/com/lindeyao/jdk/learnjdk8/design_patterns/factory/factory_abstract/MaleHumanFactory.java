package com.lindeyao.jdk.learnjdk8.design_patterns.factory.factory_abstract;

/**
 * 抽象工厂方法--具体工厂类，专门生产男性
 *
 * @author ldy
 * @create 2019-11-18 16:37
 */
public class MaleHumanFactory implements HumanFactory{

    @Override
    public IHuman createYellowHuman() {
        return new MaleYellowHuman();
    }

    @Override
    public IHuman createWhiteHuman() {
        return new MaleWhiteHuman();
    }

    @Override
    public IHuman createBlackHuman() {
        return new MaleBlackHuman();
    }
}
