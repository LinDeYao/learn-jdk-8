package com.lindeyao.jdk.learnjdk8.design_patterns.structuremodel.adapter.charge;

/**
 * 介绍：Apater类，通过继承src，实现dst来实现适配器功能
 * 这里介绍的就是： 类适配器(根据使用的src是类来命名)，通过继承来拥有src的方法，可以重写，也可以直接使用父类方法
 * @author ldy
 * @create 2020-04-14 10:55
 */
class VoltageAdapter extends Voltage220 implements Voltage5 {

    @Override
    public int output5V() {
        // 通过继承，拥有src类的方法，同时可以进行重写实现不一样的逻辑
        int src = super.output220V();  // 系统现有的方法
        System.out.println("适配器工作开始适配电压");
        int dst = src / 44;
        System.out.println("适配完成后输出电压：" + dst);
        return dst;
    }

    // 总结：java通过这种单继承的方式，那么dst就必须是接口，有一定的局限性。
    // 但同时由于继承了src，所以适配器可以根据需求重新src的方法，增加了灵活性
    // 根据“合成复用原则”，在系统中尽量使用 关联关系 来替代 继承关系。
    // 所以，我们可以使用另外文件中的例子来看，如何使用关联关系来实现适配器(常用)

}
