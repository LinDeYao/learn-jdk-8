package com.lindeyao.jdk.learnjdk8.design_patterns.factory.factory_abstract;

/**
 * 抽象工厂方法--黑人抽象类，只实现了肤色和语言。
 * 剩下的性别属性由具体的产品类实现
 *
 * @author ldy
 * @create 2019-11-18 15:37
 */
public abstract class AbstractBlackHuman implements IHuman {

    @Override
    public void getColor() {
        System.out.println("黑色人种的皮肤一般都是黑色的！");
    }

    @Override
    public void talk() {
        System.out.println("黑人会说话，一般说的话听不懂！");
    }

}
