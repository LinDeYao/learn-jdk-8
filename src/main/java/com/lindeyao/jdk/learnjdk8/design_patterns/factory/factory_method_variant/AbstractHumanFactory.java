package com.lindeyao.jdk.learnjdk8.design_patterns.factory.factory_method_variant;

import com.lindeyao.jdk.learnjdk8.design_patterns.factory.factory_method.Human;

/**
 * 标准工厂方法变种,抽象类--（多具体工厂模式）
 *
 * @author ldy
 * @create 2019-11-15 14:28
 */
public abstract class AbstractHumanFactory {

    abstract Human createHuman();

}
