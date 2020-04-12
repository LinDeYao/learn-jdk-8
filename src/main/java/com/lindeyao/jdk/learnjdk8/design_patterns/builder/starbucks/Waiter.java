package com.lindeyao.jdk.learnjdk8.design_patterns.builder.starbucks;

/**
 * 建造者模式--导演类--顾客
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
