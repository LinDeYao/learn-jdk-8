package com.lindeyao.jdk.learnjdk8.design_patterns.factory.factory_abstract;

/**
 * 抽象工厂方法--黄人抽象类，只实现了肤色和语言。
 * 剩下的性别属性由具体的产品类实现
 *
 * @author ldy
 * @create 2019-11-18 15:55
 */
public abstract class AbstractYellowHuman implements IHuman {

    @Override
    public void getColor() {
        System.out.println("黄色人种的皮肤是黄色的");
    }

    @Override
    public void talk() {
        System.out.println("黄种人会说话，说的一般都是双字节的！");
    }
}
