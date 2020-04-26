package com.lindeyao.jdk.learnjdk8.design_patterns.createmodel.singleton;

/**
 * 单例模式--场景调用类
 *
 * @author ldy
 * @create 2019-11-20 11:40
 */
public class Client {

    public static void main(String[] args) {

        // 采用双重检测机制
        LazyEmperor lazyEmperor = LazyEmperor.getInstance();
        lazyEmperor.say();

        // 内部静态类
        InnerEmperor innerEmperor = InnerEmperor.getInstance();
        innerEmperor.say();

    }

}
