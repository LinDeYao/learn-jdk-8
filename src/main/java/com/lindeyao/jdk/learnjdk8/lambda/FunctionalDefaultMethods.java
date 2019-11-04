package com.lindeyao.jdk.learnjdk8.lambda;

/**
 * JDK8 特点： 函数接口demo
 *
 * @author lindeyao
 * @create 2019-09-05-10:43
 */
@FunctionalInterface
public interface FunctionalDefaultMethods {

    void method();

    // 函数接口特点：只能有一个方法，如果存在多个方法，编译器会报出异常，如下：
    /*void ortherMethod();*/

    // 但是可以增加静态方法和默认方法，如下：
    static void staticMethod() {

    }

    // 默认方法
    default void defaultMethod() {

    }
}
