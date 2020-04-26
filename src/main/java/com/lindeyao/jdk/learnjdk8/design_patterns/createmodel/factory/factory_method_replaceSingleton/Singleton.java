package com.lindeyao.jdk.learnjdk8.design_patterns.createmodel.factory.factory_method_replaceSingleton;

/**
 * 单例实体（工厂方法扩展--替代单例模式）
 *
 * @author ldy
 * @create 2019-11-15 15:22
 */
public class Singleton {

    // 构造方法私有化，外部无法正常new该对象
    private Singleton(){

    }

    // 业务方法
    public void methoeInvoke() {
        System.out.println("私有类方法执行...");
    }
}
