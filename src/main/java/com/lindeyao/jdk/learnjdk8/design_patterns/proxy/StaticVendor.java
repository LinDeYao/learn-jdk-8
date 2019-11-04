package com.lindeyao.jdk.learnjdk8.design_patterns.proxy;

/**
 * 静态代理--生产厂家
 *
 * @author ldy
 * @create 2019-10-09 11:44
 */
public class StaticVendor implements Sell{

    @Override
    public void sell() {
        System.out.println("excute sell method of StaticVendor");
    }
}
