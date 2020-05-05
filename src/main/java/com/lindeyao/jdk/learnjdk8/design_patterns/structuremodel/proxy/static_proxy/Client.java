package com.lindeyao.jdk.learnjdk8.design_patterns.structuremodel.proxy.static_proxy;

/**
 * 静态代理：客户场景调用类
 *
 * @author DeeLin
 * @create 2020-04-26 14:31
 */
class Client {


    public static void main(String[] args) {
        HelloService helloServiceProxy = new HelloServiceProxy(new HelloServiceImpl());
        helloServiceProxy.sayHello("ldy, come on");
        helloServiceProxy.sysHi("ldy, you can");
    }

}
