package com.lindeyao.jdk.learnjdk8.design_patterns.factory.factory_abstract;

/**
 * 抽象工厂--具体黄人类--男性
 *
 * @author ldy
 * @create 2019-11-18 15:58
 */
public class MaleYellowHuman extends AbstractYellowHuman {

    @Override
    public void getSex() {
        System.out.println("黄人男性");
    }
}
