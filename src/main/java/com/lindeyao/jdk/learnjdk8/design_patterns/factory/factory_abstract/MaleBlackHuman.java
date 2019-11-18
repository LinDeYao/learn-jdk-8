package com.lindeyao.jdk.learnjdk8.design_patterns.factory.factory_abstract;

/**
 * 抽象工厂--具体黑人类--男性
 *
 * @author ldy
 * @create 2019-11-18 15:53
 */
public class MaleBlackHuman extends AbstractBlackHuman {

    @Override
    public void getSex() {
        System.out.println("黑人男性");
    }
}
