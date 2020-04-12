package com.lindeyao.jdk.learnjdk8.design_patterns.builder.starbucks;

/**
 * 建造者--客户端
 *
 * @author DeeLin
 * @create 2020-04-11 22:02
 */
public class Client {

    public static void main(String[] args) {

        // 客户端需要知道创建者是谁
        AbstractStarbucksBuilder starbucksBuilder = new StarbucksBuilder();
        Waiter waiter = new Waiter(starbucksBuilder);

        // 下单
        waiter.placeOrderStarbucks();
        // 拿到饮料
        Starbucks starbucks = waiter.getStarbuss();

        System.out.println(starbucks);
    }

}
