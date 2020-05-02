package com.lindeyao.jdk.learnjdk8.design_patterns.objectbehavior.observer.weatherreport;


/**
 * 观察者模式：主题（被观察者、发布者）,本身会拥有数据变化的接口。
 * 同时，还必须拥有一系列观察者的对象(可以动态增删)，用于数据变化时，可以通知观察者(观察者会有一个接收通知的接口)
 * 天气预报：当天气变化时，能实时通知客户端
 *
 * @author ldy
 * @create 2020-05-02-14:55
 */
interface Subject {

    /**
     * 注册观察者
     * @param myObserver
     */
    void registerObserver(MyObserver myObserver);

    /**
     * 移除观察者
     * @param myObserver
     */
    void removeObserver(MyObserver myObserver);

    /**
     * 通知观察者
     */
    void notifyObservers();

}
