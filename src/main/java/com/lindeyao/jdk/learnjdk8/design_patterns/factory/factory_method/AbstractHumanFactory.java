package com.lindeyao.jdk.learnjdk8.design_patterns.factory.factory_method;

/**
 * 制造人类的抽象工厂类(针对的是人类这一种产品)
 *
 * @author DeeLin
 * @create 2019-11-12 22:35
 */
abstract class AbstractHumanFactory {

    // 创建对象的抽象方法
    public abstract <T extends Human> T createHuman(Class<T> tClass);

}
