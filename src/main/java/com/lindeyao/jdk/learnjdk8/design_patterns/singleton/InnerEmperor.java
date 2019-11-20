package com.lindeyao.jdk.learnjdk8.design_patterns.singleton;

/**
 * 单例模式--静态内部类实现单例模式
 *
 * @author ldy
 * @create 2019-11-20 14:41
 */
public class InnerEmperor {

    // 构造函数私有化
    private InnerEmperor() {

    }

    // 创建一个内部类
    private static class LazyHolder {
        // 使用内部类创建外部类对象，只有在方法第一次调用的时候才初始化，也属于懒汉式
        private static final InnerEmperor INNER_EMPEROR = new InnerEmperor();
    }

    // 静态工厂方法模式
    protected static InnerEmperor getInstance() {
        return LazyHolder.INNER_EMPEROR;
    }

    protected void say() {
        System.out.println("我是静态内部类，皇帝某某某...");
    }
}
