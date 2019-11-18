package com.lindeyao.jdk.learnjdk8.design_patterns.factory.factory_abstract;

/**
 * 抽象工厂--具体白人类--男性
 *
 * @author ldy
 * @create 2019-11-18 16:14
 */
public class MaleWhiteHuman extends AbstractWhiteHuman{

    @Override
    public void getSex() {
        System.out.println("白人男性");
    }
}
