package com.lindeyao.jdk.learnjdk8.design_patterns.createmodel.builder.computer;

/**
 * 建造者模式例子--电脑抽象建造者
 * 至于安装什么型号的cpu，主板都不是我关心的，而是具体建造者关心的
 * @author DeeLin
 * @create 2020-01-13-22:04
 */
public interface Builder {
    // 创建cpu
    public void createCpu(String cpu);
    // memory
    public void createMemory(String memory);
    // 组装电脑
    Computer createComputer();
}
