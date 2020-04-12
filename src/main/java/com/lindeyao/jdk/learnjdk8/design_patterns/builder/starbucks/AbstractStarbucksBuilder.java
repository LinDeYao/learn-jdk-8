package com.lindeyao.jdk.learnjdk8.design_patterns.builder.starbucks;

/**
 * 建造者模式--建造者抽象类：店员
 *
 * @author DeeLin
 * @create 2020-04-11 21:14
 */
public abstract class AbstractStarbucksBuilder {

    Starbucks starbucks;

    public Starbucks getStarbucks() {
        return this.starbucks;
    }

    public abstract void buildSize(String size);

    public abstract void buildSuger(Boolean isNeedSuger);

}
