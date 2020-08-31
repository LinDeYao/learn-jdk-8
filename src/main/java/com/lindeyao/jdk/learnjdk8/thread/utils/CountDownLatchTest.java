package com.lindeyao.jdk.learnjdk8.thread.utils;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * CountDownLatch测试类
 *
 * @author ldy
 * @create 2020-07-06 9:54
 */
public class CountDownLatchTest {

    Lock lock = new ReentrantLock();

    final CountDownLatch countDownLatch = new CountDownLatch(3);

    public static void main(String[] args) throws InterruptedException {
        new CountDownLatchTest().go();
    }

    private void go() throws InterruptedException {
        new Thread(new Task(countDownLatch), "Thread1").start();
        new Thread(new Task(countDownLatch), "Thread2").start();
        new Thread(new Task(countDownLatch), "Thread3").start();
        System.out.println("所有线程都已经创建完成,主线程继续执行" + System.currentTimeMillis());
        // 让主线程等待计数器释放
        countDownLatch.await();
        System.out.println("所有线程已执行完成,主线程继续执行" + System.currentTimeMillis());
    }


    class Task implements Runnable {

        // 属性，可以通过构造函数进行赋值
        private CountDownLatch countDownLatch;

        public Task(CountDownLatch countDownLatch) {
            this.countDownLatch = countDownLatch;
        }

        @Override
        public void run() {
            // 让 Thread1 也等待计数器释放
//            if("Thread1".equals(Thread.currentThread().getName())) {
//                try {
//                    this.countDownLatch.await();
//                    System.out.println("线程" + Thread.currentThread().getName() + "已经到达" + System.currentTimeMillis());
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            } else {
                System.out.println("线程" + Thread.currentThread().getName() + "已经到达" + System.currentTimeMillis());
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                this.countDownLatch.countDown();
//            }
        }
    }

    // 总结一下：
    // CountDownLatch：俗称多线程的计数器
    // 构造方法：
    // public CountDownLatch(int count) {} ：这里的count就相当于计数器的总数，其中对象还提供一个countDown()的方法，可以对总数进行减1。
    // 主要方法有三个：
    // 1: public void countDown() {} :非常简单，看源码可以知道是对总数 count 进行减1。
    // 2: public void await() throws InterruptedException{} :调通 await 方法，当前的线程会被阻塞，只有等到 count 的值为0时才能继续执行。
    // 从上面的方法和例子可以得出 CountDownLatch 的作用：
    // 在多线程执行顺序不确定的情况下，当某个线程需要等待其他线程执行完成之后，才能继续自身下面的逻辑时，就可以使用 CountDownLatch 计算器进行辅助。
    // 实现如下：实例化CountDownLatch时，将需要等待的线程数量作为count参数传递进CountDownLatch，在其他线程执行完本身逻辑之后，调用 countDown 方法
    // 进行递减，表明当前的线程已经执行完本身的逻辑。需要等待的其他线程完成的线程直接调用 await 方法进行等待，等到 count 总数为0时，等待的线程会被唤醒执行。

}
