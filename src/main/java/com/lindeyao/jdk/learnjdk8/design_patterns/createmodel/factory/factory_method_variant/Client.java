package com.lindeyao.jdk.learnjdk8.design_patterns.createmodel.factory.factory_method_variant;

import com.lindeyao.jdk.learnjdk8.design_patterns.createmodel.factory.factory_method.Human;

/**
 * 工厂方法模式扩展--多具体工厂方法模式
 * 具体的产品由具体的工厂生产
 *
 * @author ldy
 * @create 2019-11-15 14:36
 */
public class Client {

    public static void main(String[] args) {
        // 产生白人
        AbstractHumanFactory whiteHumanFactory = new WhiteHumanFactory();
        Human whiteHuman = whiteHumanFactory.createHuman();
        whiteHuman.getColor();
        whiteHuman.talk();
        // 生产黄种人
        AbstractHumanFactory yellowHumanFactory = new YellowHumanFactory();
        Human yellowHuman = yellowHumanFactory.createHuman();
        yellowHuman.getColor();
        yellowHuman.talk();
    }

    /**
     * 工厂方法模式扩展--多具体工厂模式(也是单一产品类)
     * 特点：与标准的工厂方法模式相比，多具体工厂模式对应着每个具体的产品类都对应一个具体的工厂类。
     * 只要多一种具体产品，就需要新增一个对应的工厂类。
     *
     * 好处是：符合单一职责，创建类的职责非常清晰，而且结构简单，但是扩展性有影响，
     * 为什么这么说，因为每新增一个产品类，就需要建立一个相应的工厂类，增加了扩展的难度。
     *
     */
}
