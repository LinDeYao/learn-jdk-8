package com.lindeyao.jdk.learnjdk8.design_patterns.factory;

/**
 * 工厂方法模式--PNG读取器工厂，实现了接口对应的抽象工厂
 *
 * @author ldy
 * @create 2019-10-12 14:03
 */
public class FactoryMethod_PngReaderFactory implements FactoryMethod_ReaderFactory{

    @Override
    public FactoryMethod_Reader createReader() {
        return new FactoryMethod_PngReader();
    }
}
