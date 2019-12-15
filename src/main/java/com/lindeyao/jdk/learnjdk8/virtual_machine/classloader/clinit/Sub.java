package com.lindeyao.jdk.learnjdk8.virtual_machine.classloader.clinit;

/**
 * 初始化阶段Demo，子类
 *
 * @author DeeLin
 * @create 2019-12-15 11:04
 */
public class Sub extends Parent{
    // 子类类变量，值从父类的类变量中获取
    public static int B = A;
}
