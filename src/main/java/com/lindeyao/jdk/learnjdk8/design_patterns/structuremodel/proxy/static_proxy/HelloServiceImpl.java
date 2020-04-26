package com.lindeyao.jdk.learnjdk8.design_patterns.structuremodel.proxy.static_proxy;

/**
 * 静态代理模式：静态代理接口实现
 * 分三个角色： 1：定义业务接口； 2：实现业务接口； 3：创建代理类
 *
 * @author DeeLin
 * @create 2020-04-26 14:24
 */
class HelloServiceImpl implements HelloService {

    @Override
    public String sayHello(String name) {
        return "Hello " + name;
    }

    @Override
    public String sysHi(String msg) {
        return "Hi, " + msg;
    }
}
