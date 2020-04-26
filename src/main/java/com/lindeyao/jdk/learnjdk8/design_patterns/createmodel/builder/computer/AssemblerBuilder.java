package com.lindeyao.jdk.learnjdk8.design_patterns.createmodel.builder.computer;

/**
 * 建造者模式例子--具体建造者，指商场的一个装机人员
 *
 * @author DeeLin
 * @create 2020-01-13 22:09
 */
public class AssemblerBuilder implements Builder{

    private Computer computer = new Computer() ;

    @Override
    public void createCpu(String cpu) {
        computer.setCpu(cpu);
    }

    @Override
    public void createMemory(String memory) {
        computer.setMemory(memory);
    }

    @Override
    public Computer createComputer() {
        return computer;
    }
}
