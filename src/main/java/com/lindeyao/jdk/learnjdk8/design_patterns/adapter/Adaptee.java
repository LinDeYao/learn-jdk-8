package com.lindeyao.jdk.learnjdk8.design_patterns.adapter;

/**
 * 已存在的将被适配的类
 *
 * @author ldy
 * @create 2019-10-30 17:52
 */
public class Adaptee {

    public void adapteeRequest() {
        System.out.println("被适配者的方法");
        System.out.println("测试");
    }

}
