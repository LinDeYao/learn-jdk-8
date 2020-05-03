package com.lindeyao.jdk.learnjdk8.design_patterns.objectbehavior.observer.jdkobserver;

import java.util.Observable;
import java.util.Observer;

/**
 * 使用JDK自带的Observer，成为观察者
 *
 * @author ldy
 * @create 2020-05-02 22:37
 */
class MyObserver implements Observer {

    // Observable对象
    @Override
    public void update(Observable o, Object arg) {
        System.out.println("接收到主题发送的事件通知：最新值"+ arg);
    }
}
