package com.lindeyao.jdk.learnjdk8.design_patterns.objectbehavior.observer.jdkobserver;

import lombok.Getter;
import lombok.Setter;

import java.util.Observable;

/**
 * JDK自带的通知者类
 *
 * @author ldy
 * @create 2020-05-02 22:44
 */
class MyObservable extends Observable {

    @Getter
    int number;

    MyObservable() {
        // 默认初始值为 1；
        this.number = 1;
    }

    // 设置值，当变化的时候，通知观察者
    void setNumber(int number) {
        this.number = number;
        this.setChanged();
    }

}
