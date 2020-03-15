package com.lindeyao.jdk.learnjdk8.thread;

/**
 * 多线程 Thread学习, 使用多线程非常简单，只要继承 Thread 并执行 run 方法
 *
 * @author DeeLin
 * @create 2020-03-15 15:48
 */
public class LearnThread extends Thread {

    private String threadName;

    public LearnThread(String threadName) {
        this.threadName = threadName;
    }

    @Override
    public void run() {
        for (int i = 0; i < 500; i++) {
            System.out.println(threadName + "运行  :  " + i);
            try {
                sleep((int) Math.random() * 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        LearnThread learnThread1 = new LearnThread("线程1");
        LearnThread learnThread2 = new LearnThread("线程2");

        learnThread1.start();
        learnThread2.start();

        // 启动main的时候，java虚拟机启动一个进程，主线程main在main()调用的时候被创建，随着 learnThread1和
        // learnThread2的start方法的启动，整个程序在多线程的环境下运行。
        // start()方法调用之后，并不会立即执行多线程代码(即run方法体中的业务逻辑代码)，而是使得该线程变为可执行状态
        // 从输出结果可看到，多线程程序是乱序执行的，完全取决于操作系统的调度。
    }

}
