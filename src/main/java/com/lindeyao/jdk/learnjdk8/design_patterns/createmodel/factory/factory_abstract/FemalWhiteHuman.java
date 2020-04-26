package com.lindeyao.jdk.learnjdk8.design_patterns.createmodel.factory.factory_abstract;

/**
 * 抽象工厂方法--具体白人类--女性
 *
 * @author ldy
 * @create 2019-11-18 16:11
 */
public class FemalWhiteHuman extends AbstractWhiteHuman{

    @Override
    public void getSex() {
        System.out.println("白人女性");
    }
}
