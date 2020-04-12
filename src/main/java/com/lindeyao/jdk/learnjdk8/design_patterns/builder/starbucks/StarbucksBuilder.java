package com.lindeyao.jdk.learnjdk8.design_patterns.builder.starbucks;

/**
 * 建造者模式--具体建造者:店内某一个操作人员
 *
 * @author DeeLin
 * @create 2020-04-11 21:21
 */
public class StarbucksBuilder extends AbstractStarbucksBuilder {

    public StarbucksBuilder() {
        this.starbucks = new Starbucks();
    }

    @Override
    public void buildSize(String size) {
        this.starbucks.setSize(size);
    }

    @Override
    public void buildSuger(Boolean isNeedSuger) {
        this.starbucks.setSuger(isNeedSuger);
    }

}
