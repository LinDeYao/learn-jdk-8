package com.lindeyao.jdk.learnjdk8.design_patterns.builder.kfc;

/**
 * 建造者模式，主食：汉堡
 *
 * @author DeeLin
 * @create 2020-04-04 21:09
 */
public class Hamburger implements Food {

    @Override
    public void name() {
        System.out.println("主食汉堡！");
    }
}
