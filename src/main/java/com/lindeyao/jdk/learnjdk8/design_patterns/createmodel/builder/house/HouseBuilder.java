package com.lindeyao.jdk.learnjdk8.design_patterns.createmodel.builder.house;

/**
 * 建造者模式例子--抽象建造者[包工头]，房屋建造
 *
 * @author ldy
 * @create 2020-09-03-15:04
 */
public interface HouseBuilder {

    // 打地基
    void doFoundation();

    // 盖框架
    void doFrame();

    // 浇筑
    void dpPouring();

    // 获得房子
    House getHouse();

}
