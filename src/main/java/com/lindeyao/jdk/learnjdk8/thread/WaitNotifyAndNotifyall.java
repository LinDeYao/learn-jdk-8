package com.lindeyao.jdk.learnjdk8.thread;

import org.junit.Test;

import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * 多线程编程中的wait()，notify()和notifyAll()
 *
 * 典型的生产者、消费者模式
 *
 * @author ldy
 * @create 2020-03-18 13:56
 */
public class WaitNotifyAndNotifyall {

    public WaitNotifyAndNotifyall(){}

    private Object lock = new Object();

    // 产品数量，开始为0
    private int count = 0;

    // 生产者
    class producer implements Runnable {

        @Override
        public void run() {

            // 永远只有一个线程进来
            synchronized (lock) {
                // 无线循环
                while (true) {
                    // 当生产数量超过限制时，生产线程加入 lock 等待池中，暂停生产
                    if (count > 9) {
                        try {
                            System.out.println("唤醒消费者 consumer");
                            // 唤醒等待池中一个线程
                            lock.notify();
                            System.out.println("producer 执行等待");
                            lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    count++;

                    // 暂停1s
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    System.out.println(Thread.currentThread().getName() + "开始生产产品：" + count);
                }
            }
        }
    }

    // 消费者
    class consumer implements Runnable {

        @Override
        public void run() {

            // 永远只有一个线程进来
            synchronized (lock) {
                // 无线循环
                while (true) {
                    // 没有数量了，需要暂停
                    if (count < 1) {
                        try {
                            System.out.println("唤醒生产者 producer");
                            // 唤醒等待池中一个线程
                            lock.notify();
                            System.out.println("consumer 执行等待");
                            lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    count--;

                    // 暂停1s
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    System.out.println(Thread.currentThread().getName() + "开始消费产品：" + count);
                }
            }
        }
    }



    @Test
    public void testWait() throws InterruptedException {

        Thread thread1 = new Thread(new producer());
        Thread thread2 = new Thread(new producer());
        Thread thread3 =new Thread(new consumer());
        Thread thread4 =new Thread(new consumer());
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();

        thread1.join();
        thread2.join();
    }


    public static void main(String[] args) throws InterruptedException {

        // 网上示例1
        /*SynchLock lock = new SynchLock();
        PrintA a = new PrintA(lock,"A","B");
        PrintA b = new PrintA(lock,"B","C");
        PrintA c = new PrintA(lock,"C","A");
        a.start();
        b.start();
        c.start();*/


        // 网上示例2
        AtomicInteger synObj = new AtomicInteger(0);
        TestPrint a = new TestPrint(synObj, "A", 0);
        TestPrint b = new TestPrint(synObj, "B", 1);
        TestPrint c = new TestPrint(synObj, "C", 2);

        a.start();
		b.start();
		c.start();
    }


    // 网上多线程实现业务：多线程轮流顺序打印 a,b,c三个线程按顺序打印数字1-96 线程a打印1,b打印2,c打印3
    static class SynchLock {
        private volatile String active = "A";
        int count = 0;

        public void add() {
            synchronized (SynchLock.class) {
                count = count + 1;
            }
        }
    }
    static class PrintA extends Thread {
        private SynchLock lock;
        private String name;
        private String next;

        PrintA(SynchLock lock, String name, String next) {
            this.lock = lock;
            this.name = name;
            this.next = next;
        }

        @Override
        public void run() {
            while (true) {
                synchronized (lock) {
                    if (this.name.equals(lock.active)) {
                        if ("A".equals(this.name) && lock.count >= 3) {
                            break;
                        }

                        System.out.println(this.getName() + " " + this.name);
                        lock.active = this.next;
                        if ("A".equals(this.name)) {
                            lock.add();
                        }
                        lock.notifyAll();
                    } else {
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            // TODO Auto-generated catch block
                            e.printStackTrace();
                        }
                    }
                }
            }

        }
    }


    // 对上面例子的优化
    static class TestPrint extends Thread {
        private AtomicInteger synObj;
        private String name;
        private int flag;
        private int count = 0;
        public TestPrint(AtomicInteger synObj, String name, int flag) {
            this.synObj = synObj;
            this.name = name;
            this.flag = flag;
        }
        @Override
        public void run() {
            while (true) {
                synchronized (synObj) {//锁同一个对象
                    if (synObj.get() % 3 == flag) {//等 于自己
                        synObj.set(synObj.get() + 1);
                        System.out.println(name);
                        count++;
                        synObj.notifyAll();
                        if (count == 10) {
                            break;
                        }
                    } else {
                        try {
                            synObj.wait();
                        } catch (InterruptedException e) {
                            // TODO Auto-generated catch block
                            e.printStackTrace();
                        }
                    }
                }
            }
        }
    }

}
