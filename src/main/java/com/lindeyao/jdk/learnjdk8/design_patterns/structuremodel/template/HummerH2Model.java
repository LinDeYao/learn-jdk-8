package com.lindeyao.jdk.learnjdk8.design_patterns.structuremodel.template;

/**
 * H2型号悍马模型
 *
 * @author ldy
 * @create 2019-11-21 16:50
 */
public class HummerH2Model extends AbstractHummerModel{

    @Override
    void start() {
        System.out.println("悍马H2启动");
    }

    @Override
    void alarm() {
        System.out.println("悍马H2响声");
    }

    @Override
    void stop() {
        System.out.println("悍马H2停止");
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
