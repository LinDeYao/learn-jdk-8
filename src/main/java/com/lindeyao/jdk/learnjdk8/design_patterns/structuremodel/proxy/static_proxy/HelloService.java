package com.lindeyao.jdk.learnjdk8.design_patterns.structuremodel.proxy.static_proxy;

/**
 * 静态代理模式： 静态代理接口
 * 分三个角色： 1：定义业务接口
 *
 * @author DeeLin
 * @create 2020-04-26-14:22
 */
interface HelloService {

    String sayHello(String name);

    String sysHi(String msg);
}
