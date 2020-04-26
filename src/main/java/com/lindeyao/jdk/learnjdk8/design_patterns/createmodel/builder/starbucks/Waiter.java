package com.lindeyao.jdk.learnjdk8.design_patterns.createmodel.builder.starbucks;

/**
 * 建造者模式--导演类--顾客
 * 导演类： 顾名思义，可以对不同的组件进行控制，包括顺序和零件是否需要。并指导建造者进行建造，组装对象。
 *
 * @author DeeLin
 * @create 2020-04-11 22:08
 */
public class Waiter {

    private AbstractStarbucksBuilder starbucksBuilder;

    Waiter(AbstractStarbucksBuilder starbucksBuilder) {
        this.starbucksBuilder = starbucksBuilder;
    }

    // 下订单
    public void placeOrderStarbucks() {
        // 大杯不加糖,建造者模式
        starbucksBuilder.buildSize("大杯");
        starbucksBuilder.buildSuger(false);
    }

    // 拿到星巴克
    public Starbucks getStarbuss() {
        return starbucksBuilder.getStarbucks();
    }
}
