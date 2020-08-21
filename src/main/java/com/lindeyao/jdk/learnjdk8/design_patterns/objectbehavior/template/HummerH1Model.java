package com.lindeyao.jdk.learnjdk8.design_patterns.objectbehavior.template;

/**
 * H1型号悍马模型
 *
 * @author ldy
 * @create 2019-11-21 16:22
 */
public class HummerH1Model extends AbstractHummerModel {

    @Override
    void start() {
        System.out.println("悍马H1启动");
    }

    @Override
    void alarm() {
        System.out.println("悍马H1响声");
    }

    @Override
    void stop() {
        System.out.println("悍马H1停止");
    }

    /*@Override
    public void run() {
        // 开始启动
        this.start();
        // 机器发出响声
        this.alarm();
        // 到达目的地停止
        this.stop();
    }*/
}
