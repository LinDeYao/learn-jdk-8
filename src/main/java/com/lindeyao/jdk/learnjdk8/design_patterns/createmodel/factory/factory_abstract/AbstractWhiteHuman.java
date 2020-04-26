package com.lindeyao.jdk.learnjdk8.design_patterns.createmodel.factory.factory_abstract;

/**
 * 抽象工厂方法--白人抽象类，只实现了肤色和语言。
 * 剩下的性别属性由具体的产品类实现
 *
 * @author ldy
 * @create 2019-11-18 15:48
 */
public abstract class AbstractWhiteHuman implements IHuman {

    @Override
    public void getColor() {
        System.out.println("白色人种的皮肤是白色的！");
    }

    @Override
    public void talk() {
        System.out.println("白人会说话，说的一般都是单字符！");
    }
}
