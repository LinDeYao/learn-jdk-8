package com.lindeyao.jdk.learnjdk8.design_patterns.factory;

/**
 * 工厂方法模式--读取器接口抽象工厂，用于返回读取器对象
 *
 * @author lindeyao
 * @create 2019-10-12-11:30
 */
public interface FactoryMethod_ReaderFactory {

    // 创建读取器
    FactoryMethod_Reader createReader();

}
