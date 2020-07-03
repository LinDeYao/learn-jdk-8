package com.lindeyao.jdk.learnjdk8.thread;

/**
 * @author ldy
 * @create 2020-06-01 11:38
 */
public class SyncBlock {

    private int i;

    public void increase() {
        synchronized (this) {
            i++;
        }
    }

}
