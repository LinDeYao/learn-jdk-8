package com.lindeyao.jdk.learnjdk8.design_patterns.createmodel.builder.starbucks;

/**
 * 建造者模式--建造者抽象类：店员
 * 抽象建造者：主要负责不同组件的构建过程，具体构件由具体建造者执行
 *
 * @author DeeLin
 * @create 2020-04-11 21:14
 */
public abstract class AbstractStarbucksBuilder {

    protected Starbucks starbucks;

    public Starbucks getStarbucks() {
        return this.starbucks;
    }

    public abstract void buildSize(String size);

    public abstract void buildSuger(Boolean isNeedSuger);

}
