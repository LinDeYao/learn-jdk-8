package com.lindeyao.jdk.learnjdk8.design_patterns.createmodel.factory.factory_abstract;

/**
 * 抽象工厂方法--具体黄人类--女性
 *
 * @author ldy
 * @create 2019-11-18 15:57
 */
public class FemalYellowHuman extends AbstractYellowHuman {

    @Override
    public void getSex() {
        System.out.println("黄人女性");
    }
}
