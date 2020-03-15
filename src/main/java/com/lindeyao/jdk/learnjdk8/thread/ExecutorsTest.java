package com.lindeyao.jdk.learnjdk8.thread;

import java.util.concurrent.Executors;

/**
 * JDK1.5之后提供了创建线程池的几种方式
 *
 * @author DeeLin
 * @create 2020-03-12 21:21
 */
public class ExecutorsTest {

    public static void main(String[] args) {

        // 创建一个固定线程数的线程池
        Executors.newFixedThreadPool(5);

        // 创建一个只有单个线程的线程池(用于顺序执行一些任务)
        Executors.newSingleThreadExecutor();

        // 创建一个无限线程的线程池
        Executors.newCachedThreadPool();

    }
}
