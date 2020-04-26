package com.lindeyao.jdk.learnjdk8.design_patterns.structuremodel.proxy;

/**
 * 静态代理--wx代理(代理类)
 *
 * @author ldy
 * @create 2019-10-09 13:54
 */
public class StaticBusinessAgent implements Sell{

    // 采用组合的模式
    private Sell vendor;

    public StaticBusinessAgent(Sell vendor) {
        this.vendor = vendor;
    }

    @Override
    public void sell() {
        System.out.println("代理类：在执行实际方法之前，先执行想要添加的逻辑");
        // 实际执行的是委托类的方法
        vendor.sell();
        System.out.println("代理类：在执行实际方法之后，执行想要添加的逻辑");
    }
}
