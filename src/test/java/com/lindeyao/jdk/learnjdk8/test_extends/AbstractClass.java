package com.lindeyao.jdk.learnjdk8.test_extends;

/**
 * 抽象类
 *
 * @author ldy
 * @create 2019-10-17 11:07
 */
public abstract class AbstractClass<T> implements InterfaceClass<T>{

    T t;

    @Override
    public T getObject() {
        return t;
    }
}
