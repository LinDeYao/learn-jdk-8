package com.lindeyao.jdk.learnjdk8.design_patterns.createmodel.singleton;

/**
 * 单例模式--皇帝类(皇帝只有一个)
 *
 * @author ldy
 * @create 2019-11-20 11:33
 */
public class Emperor {

    private static final Emperor EMPEROR = new Emperor();  // 饿汉模式，类加载的时候直接实例化了

    // 构造函数私有化，外部调用函数即不能用new关键字
    private Emperor() {

    }

    protected static Emperor getInstance() {
        return EMPEROR;
    }

    protected void say() {
        System.out.println("我是皇帝某某某...");
    }
}
