package com.lindeyao.jdk.learnjdk8.design_patterns.structuremodel.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 测试JDK标准库通过Proxy.newInstace()动态生成的接口实现类的代码
 * 在运行期动态生成 Sell接口的一个实例对象： JDK做了两份工作，先生成 Sell接口的实现类，然后 new 一个实现类对象
 *
 * @author ldy
 * @create 2020-08-19 9:57
 */
public class TestProxyGenarate {

    public static void main(String[] args) {

        // 接口 Sell 在没有实现类的情况下，JDK标准库提供了 在运行时，动态创建接口的一个对象。JDK的这种方式被称为 动态代理
        // 那既然是 JDK帮我们生成的接口对象，对象执行接口方法的时候，该执行什么逻辑呢？
        // 实际上，JDK帮我们生成的字节码中含有 InvocationHandler 的一个实例，接口方法中的所有方法都是调用 InvocationHandler 的 invoke 方法
        // 也就是说，实际上执行的是 接口InvocationHandler实现类中的 invoke 方法
        // 总结来说，JDK通过 Proxy.newProxyInstance 动态生成了一个 接口对象，对象方法的调用请求会代理给 接口InvocationHandler实现类对象的 invoke 方法。
        Sell proxyInstance = (Sell) Proxy.newProxyInstance(TestProxyGenarate.class.getClassLoader(), new Class[]{Sell.class}, new Handler());

//        Sell proxyInstance = (Sell) Proxy.newProxyInstance(TestProxyGenarate.class.getClassLoader(), new Class[]{Sell.class}, new InvocationHandler() {
//            @Override
//            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
////                System.out.println(proxy);
//                System.out.println(method);
//                return null;
//            }
//        });
        proxyInstance.sell();

    }


    static class Handler implements InvocationHandler {
        @Override
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            System.out.println(proxy instanceof Proxy);
            System.out.println(proxy instanceof Sell);
            System.out.println(method);
            return proxy;
        }
    }
}
