package com.lindeyao.jdk.learnjdk8.design_patterns.builder.kfc;

/**
 * 建造者模式：具体产品子类饮料：咖啡
 *
 * @author DeeLin
 * @create 2020-04-04 21:13
 */
public class Coffee implements Water {

    @Override
    public void name() {
        System.out.println("我是咖啡！");
    }
}
