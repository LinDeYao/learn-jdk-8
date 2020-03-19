package com.lindeyao.jdk.learnjdk8.thread;

import org.junit.Test;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * BlockingQueue即阻塞队列，从阻塞这个词可以看出,在某种情况下对队列的操作会造成阻塞
 *
 * 根据业务需要，可以调用不同的方法，对阻塞的结果进行选择：
 * 1：ThrowsException：直接抛异常，如果操作不能立马进行，则抛出异常
 * 2：SpecialValue：返回特殊值，如果操作不能立马进行，将返回一个特殊值，一般是true或者false
 * 3：Blocks：阻塞，如果操作不能立马进行，操作将会被阻塞
 * 4：TimesOut：阻塞指定时间内。如果操作不能立马进行，操作将开始阻塞并倒计时，在指定时间内还没执行，则返回一个特殊值，一般是true或者false
 *
 * 以下例子：用来实现生产者和消费者，使用的是 Blocks结果，让线程无限期阻塞
 *
 * @author ldy
 * @create 2020-03-19 11:35
 */
public class BlockingQueueTest {

    private BlockingQueue blockingQueue = new ArrayBlockingQueue<>(10);  // 队列中只有10个容量

    private AtomicInteger atomicInteger = new AtomicInteger(0);

    class producer implements Runnable {
        @Override
        public void run() {
            // 无限循环
            while (true) {
                try {
                    blockingQueue.put(1);   // 无需加锁，本来就是阻塞，只要队列中数量满了，当前线程会阻塞
                    atomicInteger.addAndGet(1);
                    System.out.println(Thread.currentThread().getName() + "生产者生产，目前总共有" + atomicInteger.get());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    class consumer implements Runnable {
        @Override
        public void run() {
            // 无限循环
            while (true) {
                try {
                    blockingQueue.take();   // 无需加锁，本来就是阻塞，只要队列中数量空了，当前线程会阻塞
                    atomicInteger.decrementAndGet();
                    System.out.println(Thread.currentThread().getName() + "消费者消费，目前还剩下" + atomicInteger.get());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    @Test
    public void test() throws InterruptedException {
        Thread thread1 = new Thread(new producer());
        Thread thread2 = new Thread(new consumer());

        thread1.start();
        thread2.start();

        thread1.join();

    }

}
