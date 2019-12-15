package com.lindeyao.jdk.learnjdk8.virtual_machine.classloader;

/**
 * 初始化阶段Demo，父类
 *
 * @author DeeLin
 * @create 2019-12-15 11:02
 */
public class Parent {
    // 类变量
    public static int A = 1;
    // 静态代码块
    static {
        A = 2;
    }
}
