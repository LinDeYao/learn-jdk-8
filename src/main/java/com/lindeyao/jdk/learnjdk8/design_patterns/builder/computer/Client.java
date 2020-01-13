package com.lindeyao.jdk.learnjdk8.design_patterns.builder.computer;

/**
 * 建造者模式--场景类
 *
 * @author DeeLin
 * @create 2020-01-13 22:22
 */
public class Client {

    public static void main(String[] args) {
        // 装机人员
        Builder builder = new AssemblerBuilder();
        // 创建老板,将装机需求给装机人员
        Director director = new Director(builder);
        // 老板提供了零部件,然后拿到组装后的电脑
        Computer computer = director.createComputer("Intel", "500G");
        System.out.println("这台电脑使用的是:" + computer);
    }

}
