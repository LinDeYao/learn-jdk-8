package com.lindeyao.jdk.learnjdk8.design_patterns.createmodel.singleton;

/**
 * 单例模式--懒汉模式
 *
 * @author ldy
 * @create 2019-11-20 13:54
 */
public class LazyEmperor {

    //private static LazyEmperor lazyEmperor = null; //单例对象,没有加上volatile关键字可能会有问题，具体看下面讲解

    private static volatile LazyEmperor lazyEmperor = null; //单例对象

    // 构造方法私有化，外部无法正常执行new操作
    private LazyEmperor() {

    }

    // 静态工厂方法
    protected static LazyEmperor getInstance() {
        if(lazyEmperor == null) {   // 双重检测机制
            synchronized (LazyEmperor.class) {  // 同步锁
                if(lazyEmperor == null) {  // 双重检测机制
                    lazyEmperor = new LazyEmperor();
                }
            }
        }

        return lazyEmperor;
    }

    protected void say() {
        System.out.println("我是双重检测机制，皇帝某某某...");
    }

    /**
     * 上面提供的静态工厂方法看似没什么问题，虽然中间加上了同步锁机制，但是实际上获取到的实例对象有可能还在初始化当中
     *
     * 假设现在有两个线程(A和B)同时访问静态工厂方法，并走到同步锁这这一步。假设此时线程A获得锁，进入方法并执行了new LazyEmperor()步骤，
     * new关键字帮我们做了很多底层的工作，对于开发者来说，只是看着一个简单的步骤，但对于底层虚拟机来说，分为三个步骤：
     *  memory = allocate(); //1：分配对象的内存空间
     *  ctorInstance(memory); //2：初始化对象
     *  lazyEmperor = memory; //3：设置lazyEmperor变量指向刚分配的内存地址
     *
     * 由于JVM编译器的指令重排，意思就是上面的执行顺序不固定，虚拟机会根据底层的优化，将顺序打乱执行，只要执行结果跟顺序执行的结果一致就行。
     *  所以可能出现下面这种情况：
     *  memory = allocate(); //1：分配对象的内存空间
     *  lazyEmperor = memory; //2：设置lazyEmperor变量指向刚分配的内存地址  -->当执行到这里的时候，线程B抢占了CPU的执行时间
     *  ctorInstance(memory); //3：初始化对象
     *
     *  当2执行完之后，线程B开始执行，发现lazyEmperor变量不为空，线程直接返回，实际上，lazyEmperor的初始化还未完成。
     *
     *  产生上述情况需要两个必要条件：
     *  1：多线程共同抢占同一个资源
     *  2：new关键字创建对象，底层需要执行非常多步骤，由于JVM指令重排导致执行过程不确定，有可能对象还在初始化时，就已经返回给其他线程。
     *
     *  解决方案是：  lazyEmperor 属性加上 volatile 关键字，可以让对象的初始化过程顺序执行，保证返回的是初始化完成后的对象。
     */

}
