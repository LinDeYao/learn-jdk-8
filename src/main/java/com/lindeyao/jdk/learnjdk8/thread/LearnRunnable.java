package com.lindeyao.jdk.learnjdk8.thread;

/**
 * 学习多线程 Runnable，实现Runnable接口。
 *
 * @author DeeLin
 * @create 2020-03-15 16:20
 */
public class LearnRunnable implements Runnable {

    private String threadName;

    public LearnRunnable(String threadName) {
        this.threadName = threadName;
    }

    @Override
    public void run() {
        for (int i = 0; i < 500; i++) {
            System.out.println(threadName + "运行  :  " + i);
            try {
                Thread.sleep((int) Math.random() * 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        new Thread(new LearnRunnable("线程1")).start();
        new Thread(new LearnRunnable("线程2")).start();

    }
}
