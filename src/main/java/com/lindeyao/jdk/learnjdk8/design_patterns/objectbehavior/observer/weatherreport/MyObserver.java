package com.lindeyao.jdk.learnjdk8.design_patterns.objectbehavior.observer.weatherreport;

/**
 * 观察者：被动接收需要变化的事件
 * 该类必须有一个当(被观察者)变化时,可以接收事件通知的方法
 *
 * @author DeeLin
 * @create 2020-05-02-15:04
 */
interface MyObserver {

    // 接收被观察者变化时的，事件通知的方法
    void update();

}
