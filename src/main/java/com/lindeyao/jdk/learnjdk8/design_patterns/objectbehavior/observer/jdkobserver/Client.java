package com.lindeyao.jdk.learnjdk8.design_patterns.objectbehavior.observer.jdkobserver;

import java.util.Observable;
import java.util.Observer;

/**
 * JDK自带的观察者模式：场景类
 *
 * @author ldy
 * @create 2020-05-02 22:53
 */
class Client {

    public static void main(String[] args) {
        // 新建一个主题(通知者)
        MyObservable observable = new MyObservable();
        // 新建一个观察者
        Observer observer = new MyObserver();
        // 将观察者注册到主题中，以备可以监听被观察者的变化事件,已经注册的，可以实现实时监听
        observable.addObserver(observer);

        System.out.println("被观察者修改前的值为：" + observable.getNumber());
        // 修改主题数据,将被监听者的值number修改成2，看看观察者是否监听到变化事件
        observable.setNumber(2);
        System.out.println("被观察者修改值为：" + observable.getNumber());
        // 通知所有观察者
        observable.notifyObservers(observable.getNumber());

    }

}
