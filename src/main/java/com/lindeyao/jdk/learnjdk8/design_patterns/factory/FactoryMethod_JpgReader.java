package com.lindeyao.jdk.learnjdk8.design_patterns.factory;

/**
 * 工厂方法模式--JGP读取器实体类
 *
 * @author ldy
 * @create 2019-10-12 11:26
 */
public class FactoryMethod_JpgReader implements FactoryMethod_Reader{

    @Override
    public void read() {
        System.out.print("read jpg");
    }

}
