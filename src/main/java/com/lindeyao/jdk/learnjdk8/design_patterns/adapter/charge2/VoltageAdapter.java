package com.lindeyao.jdk.learnjdk8.design_patterns.adapter.charge2;

import com.lindeyao.jdk.learnjdk8.design_patterns.adapter.charge.Voltage220;
import com.lindeyao.jdk.learnjdk8.design_patterns.adapter.charge.Voltage5;

/**
 * 适配器模式：对象型适配器，采用关联关系
 *
 * @author ldy
 * @create 2020-04-14 13:57
 */
public class VoltageAdapter implements Voltage5 {

    // 采用引用的关联关系(依赖关系--组合关系)
    private Voltage220 voltage220;

    public VoltageAdapter(Voltage220 voltage220) {
        this.voltage220 = voltage220;
    }

    @Override
    public int output5V() {
        // 通过继承，拥有src类的方法，同时可以进行重写实现不一样的逻辑
        int src = this.voltage220.output220V();  // 系统现有的方法
        System.out.println("适配器工作开始适配电压");
        int dst = src / 44;
        System.out.println("适配完成后输出电压：" + dst);
        return dst;
    }
}
