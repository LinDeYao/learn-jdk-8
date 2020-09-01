package com.lindeyao.jdk.learnjdk8.thread.utils;

import java.util.concurrent.Semaphore;

/**
 * 线程同步工具类：Semaphore的使用说明
 * <p>
 * 场景说明：
 * 当去银行办理业务的时候，办理窗口与客户数量的关系，假设现在一共有2个办理业务窗口，而客户却有8个人
 * 这个时候，窗口数量有限，可以并行处理，但是多出来的客户就需要进行等待。这个时候使用Semaphore这个类就比较符合现在的情况
 *
 * @author ldy
 * @create 2020-08-31 17:49
 */
public class SemaphoreTest {

    // 可以并发处理的窗口
    private static final Semaphore SEMAPHORE = new Semaphore(2);

    public static void main(String[] args) {
        // 一共有8个客户
        for (int i = 1; i < 8; i++) {
            new Bussiness(SEMAPHORE, i).start();
        }
        System.out.println("主线程执行完毕");
    }

    // 去银行办理的业务员
    static class Bussiness extends Thread {
        private Semaphore semaphore;
        private Integer number;

        public Bussiness(Semaphore semaphore, Integer number) {
            this.semaphore = semaphore;
            this.number = number;
        }

        @Override
        public void run() {
            System.out.println("客户：" + this.number + "来到窗口前查看是否有空闲的窗口");
            try {
//                if(this.semaphore.tryAcquire()){
//                    System.out.println("客户：" + this.number + "等到了空闲的窗口，开始办理业务...");
//                    Thread.sleep(1000);
//                    System.out.println("客户：" + this.number + "办理完了业务...");
//                    this.semaphore.release();
//                } else {
//                    System.out.println("客户：" + this.number + "等不了，走了...");
//                }
                // 先获得许可，有许可之后才能继续运行，不然则阻塞
                this.semaphore.acquire();
                System.out.println("客户：" + this.number + "等到了空闲的窗口，开始办理业务...");
                Thread.sleep(1000);
                System.out.println("客户：" + this.number + "办理完了业务...");
                // 执行完成之后，释放拿到的许可，让其他线程可以重新争夺许可并运行
                this.semaphore.release();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    // 总结： Semaphore 俗称为：信号量，底层维护了一个int类型的state属性，代表了可以同时执行的线程个数。
    // 通过 acquire 方法获取一个执行许可（底层实际上是判断state值是否大于0，如果是，则CAS进行减1操作；如果state等于0，则线程在对象上进行阻塞）
    // 通过 release 方法释放一个执行许可(底层实现是CAS将state值自增1，并唤醒在对象上阻塞等待的线程进行争夺重新获得许可)
    // 先看下 Semaphore 的构造函数：
    // public Semaphore(int permits) {} ： permits实际上是赋值给了状态属性：state
    // 主要有三个方法，有多个重载版本
    // 获取许可方法：acquire(): public void acquire() throws InterruptedException {} :主要是将state值减1，如果为0，则进行阻塞等待
    // 尝试获取许可方法：tryAcquire(): public boolean tryAcquire() {} ：尝试去获取信号量立即返回结果，不会被阻塞，如果获取失败，则返回 false，成功则直接获取到并返回：true
    // 释放许可方法：release(): public void release() {} :主要实现是将state值加进行1操作，并通知在该对象上阻塞等待的线程。
    // 从上面的功能来看：
    // Semaphore对象中的state属性维护了一个总信号量功能，并提供了acquire方法实现自减功能（如果总信号量为0则在对象上进行阻塞），
    // 提供release方法实现自增功能，并唤醒在该对象上阻塞等待的线程。有增有减，表明了可以同时并发执行的线程总量为总信号量，
    // 在没有获取到许可的情况下，线程等待，知道其他线程执行完成之后释放许可，阻塞的线程才重新去争夺许可，获得许可的线程才能继续运行。

}
