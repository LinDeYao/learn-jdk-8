package com.lindeyao.jdk.learnjdk8.design_patterns.structuremodel.proxy.static_proxy;

/**
 * 静态代理模式：静态代理类
 * 实现被代理者相同的接口或者继承相同的抽象类,同时，持有被代理者的对象实例
 *
 * @author DeeLin
 * @create 2020-04-26 14:26
 */
public class HelloServiceProxy implements HelloService {

    // 持有被代理者对象的实例，具体业务的执行者
    private HelloService helloService;

    public HelloServiceProxy(HelloService helloService) {
        super();
        this.helloService = helloService;
    }

    @Override
    public String sayHello(String name) {
        System.out.println("预处理...");
        // 实际业务还是由被代理者执行
        String result = helloService.sayHello(name);
        System.out.println(result);
        System.out.println("后处理...");
        return result;
    }

    @Override
    public String sysHi(String msg) {
        System.out.println("预处理...");
        String result = helloService.sysHi(msg);
        System.out.println(result);
        System.out.println("后处理...");
        return result;
    }
}
