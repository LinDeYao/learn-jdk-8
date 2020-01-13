package com.lindeyao.jdk.learnjdk8.design_patterns.builder.computer;

/**
 * 建造者模式--导演类，用来指挥装机过程，也就是组装电脑的过程
 *
 * @author DeeLin
 * @create 2020-01-13 22:12
 */
public class Director {

    // 持有建造者引用，就可以指挥建造者
    private Builder builder;
    // 引入引用对象
    public Director(Builder builder) {
        this.builder = builder;
    }
    // 指挥具体建造者，使用对应的零部件来创建电脑
    public Computer createComputer(String cpu, String memory) {
        this.builder.createCpu(cpu);
        this.builder.createMemory(memory);
        return this.builder.createComputer();
    }
}
