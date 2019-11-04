package com.lindeyao.jdk.learnjdk8.design_patterns.proxy;

import java.lang.reflect.*;

/**
 * 主执行类
 *
 * @author ldy
 * @create 2019-10-09 13:56
 */
public class ProxyMain {

    public static void main(String[] args) {


        // 静态代理测试
        /**
         * 静态代理类：StaticBusinessAgent，特点：
         * 1：在程序运行之前就已经创建好了
         * 2：代理类跟委托类(被代理类)都实现了同一个接口: Sell
         * 3：代理类一般采用组合的方式，创建了一个委托类的实例变量，由构造方法传入
         */
        Sell sell = new StaticBusinessAgent(new StaticVendor());
        sell.sell();


        // ========================= 下面先一步一步演示动态代理 ===============================================


        // 动态代理，我们不需要编写代理类，也就是不需要创建 StaticBusinessAgent，那我们如何根据 Sell 编写代理类呢？
        /**
         * JDK提供的Proxy类,它能够根据传递进来的Class复制出Class,比如它的一个静态方法：getProxyClass，能根据 类加载器和接口Class，复制一份内部结构跟接口一致的Class
         * 根据复制出来的Class副本对象，创建与目标类(委托类)一样的对象
         */
        Class sellProxyClazz = Proxy.getProxyClass(ProxyMain.class.getClassLoader(), Sell.class);
        try {
            // 获取带有参数的构造函数
            Constructor constructor = sellProxyClazz.getConstructor(InvocationHandler.class);
            // 反射创建代理对象,该对象拥有与目标对象一致方法
            Sell sellProxy = (Sell) constructor.newInstance(new InvocationHandler() {
                @Override
                public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                    System.out.println("动态代理方法开始执行");
                    // 实例化目标类，属于硬编码，不可取，那就由程序传递进来，看最下面方法
                    method.invoke(new StaticVendor());
                    System.out.println("动态代理方法执行结束");
                    return null;
                }
            });

            /**
             * 为什么代理对象执行每一个方法，都会调用上面构造方法中的invoke方法
             * 原理：上面构造方法不是传递了一个InvocationHandler实例对象吗？那说明了代理对象中有一个InvocationHandler类型的实例变量:invocationHandler
             * 在代理对象的所有方法中，都会调用 invocationHandler.invoke()方法
             */
            sellProxy.sell();
            //System.out.println(sellProxy.getClass());

        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

        // 上面的例子需要硬编码到方法内部，耦合性太强,下面的getProxy方法对上面的方法进行了优化，可以传递任何类型的对象
        try {
            Sell proxySell = (Sell) getProxy(new StaticVendor());
            proxySell.sell();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }

        // 再次精简下面的getProxy方法，Proxy提供了一个直接创建对象的方法:newProxyInstance，看下面的getProxySimple方法
        Sell proxySimpleSell = (Sell) getProxySimple(new StaticVendor());
        proxySimpleSell.sell();

        // 至此，动态代理学习完毕
    }

    /**
     * 传递目标对象，就可以构造出目标对象一致的代理
     * @param target
     * @return
     * @throws NoSuchMethodException
     * @throws IllegalAccessException
     * @throws InvocationTargetException
     * @throws InstantiationException
     */
    private static Object getProxy(final Object target) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class proxyClass = Proxy.getProxyClass(target.getClass().getClassLoader(), target.getClass().getInterfaces());
        Constructor constructor = proxyClass.getConstructor(InvocationHandler.class);
        Object proxy = constructor.newInstance(new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                //方法前添加逻辑
                System.out.println(method.getName() + "方法开始执行...");
                Object result = method.invoke(target, args);
                //方法后添加逻辑
                System.out.println(result);
                System.out.println(method.getName() + "方法执行结束...");
                return result;
            }
        });
        return proxy;
    }

    /**
     * Proxy类提供了直接创建代理对象的方法：newProxyInstance
     * 将上面的获取构造器和根据构造器创建对象这个两个步骤都统一起来了
     * @param target
     * @return
     */
    private static Object getProxySimple(final Object target) {
        Object proxy = Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println(method.getName() + "方法开始执行...");
                Object result = method.invoke(target, args);
                System.out.println(result);
                System.out.println(method.getName() + "方法执行结束...");
                return result;
            }
        });

        return proxy;
    }

}
