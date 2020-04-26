package com.lindeyao.jdk.learnjdk8.design_patterns.createmodel.factory.factory_method_replaceSingleton;

/**
 * 场景调用类，让工厂方法模式替换单例模式
 *
 * @author ldy
 * @create 2019-11-15 16:11
 */
public class Client {

    public static void main(String[] args) {
        // 获取创建单例实例的工厂，直接获取实例
        Singleton singleton = SingletonFactory.getSingleton();
        // 单例执行方法
        singleton.methoeInvoke();
    }

}
