package com.lindeyao.jdk.learnjdk8.design_patterns.createmodel.builder.house;

/**
 * 建造者模式--楼房建造者
 *
 * @author ldy
 * @create 2020-09-03 15:10
 */
public class LouFangBuilder implements HouseBuilder {

    // 直接创建一个具体的房子
    private House house = new House();

    @Override
    public void doFoundation() {
        house.setFoundation("盖楼房的地基就打十米深");
    }

    @Override
    public void doFrame() {
        house.setFrame("楼房的框架要使用非常坚固钢筋混凝土");
    }

    @Override
    public void dpPouring() {
        house.setPouring("楼房拿个罐车把框架拿混凝土灌满即可");
    }

    @Override
    public House getHouse() {
        return this.house;
    }
}
