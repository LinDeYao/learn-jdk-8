package com.lindeyao.jdk.learnjdk8.design_patterns.createmodel.factory.factory_abstract;

/**
 * 抽象工厂方法--具体黑人类--女性
 *
 * @author ldy
 * @create 2019-11-18 15:40
 */
public class FemalBlackHuman extends AbstractBlackHuman {

    @Override
    public void getSex() {
        System.out.println("黑人女性");
    }

}
