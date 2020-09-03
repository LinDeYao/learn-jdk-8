package com.lindeyao.jdk.learnjdk8.design_patterns.createmodel.builder.house;

/**
 * 建造者模式例子--具体建造者：平房建造者
 *
 * @author ldy
 * @create 2020-09-03 15:06
 */
public class PingFangBuilder implements HouseBuilder {

    // 直接创建一个具体的房子
    private House house = new House();

    @Override
    public void doFoundation() {
        house.setFoundation("盖平房的地基");
    }

    @Override
    public void doFrame() {
        house.setFrame("盖平房的框架");
    }

    @Override
    public void dpPouring() {
        house.setPouring("盖平房不用浇灌，直接人工手刷就可以");
    }

    @Override
    public House getHouse() {
        return this.house;
    }
}
