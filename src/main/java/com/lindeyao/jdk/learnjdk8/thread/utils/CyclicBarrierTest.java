package com.lindeyao.jdk.learnjdk8.thread.utils;

import java.util.concurrent.CyclicBarrier;

/**
 * 多线程同步工具类：CyclicBarrier测试
 *
 * 模拟场景：
 * 篮球场需要3V3进行篮球友谊比赛，现在6个人正在宿舍换衣服，然后陆续到达篮球场进行等待开场，这里模拟的就是运动员换衣服到篮球场并等待开场的过程：
 * 只有等6个人都到齐的时候，才能进行开场打篮球。
 *
 * @author ldy
 * @create 2020-08-31 16:02
 */
public class CyclicBarrierTest {

    final static CyclicBarrier cyclicBarrier = new CyclicBarrier(5);

    public static void main(String[] args) {

        for (int i = 1; i < 6; i++) {
            new Player(cyclicBarrier, i).start();
        }

        System.out.println("主线程执行完毕");
    }

    static class Player extends Thread {
        private Integer number;
        private CyclicBarrier cyclicBarrier;

        public Player(CyclicBarrier cyclicBarrier, Integer number) {
            this.cyclicBarrier = cyclicBarrier;
            this.number = number;
        }

        @Override
        public void run() {
            System.out.println("用户：" + number + "：" + Thread.currentThread().getName() + "开始去篮球场");
            try {
                Thread.sleep(number * 1000);
                System.out.println("用户：" + number + "：" + Thread.currentThread().getName() + "已到达篮球场");
                // 开始等其他打篮球的用户
                this.cyclicBarrier.await();
            } catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println("所有人都已经到达篮球场，准备开场...");
        }
    }

    // 根据运行结果总结一下：
    // 从源码中可以知道： CyclicBarrier 底层维护了一个int属性：count，主要维护对象的状态，对象实例化的时候赋值。
    // public CyclicBarrier(int parties) {} ：parties表示需要等待所有线程都达到某个状态的线程数量
    // 而主要方法就一个，非常的简单：
    // public int await() throws InterruptedException, BrokenBarrierException {} ：执行这个方法会让状态量（count）减1。
    // 如果状态量不等于0，执行该方法的线程会进行阻塞。只有当 count为0时，说明状态发生了变化，那么阻塞在 CyclicBarrier 对象上的所有线程
    // 都会得到执行。

    // 简单点说，CyclicBarrier对象维护一个count属性叫做状态量，所有线程调用 CyclicBarrier对象的await方法会进行阻塞，并将 count 值减1，
    // 只有在 count等于0时，阻塞在 CyclicBarrier对象上的所有线程会执行下一步操作。
    // 从功能上来说：就是辅助 所有线程都到达某个状态后(调用await会进行等待，因为状态量不是0的情况下)，(只有当状态量递减为0的时候)所有线程才继续执行下一步。

}
