package com.lindeyao.jdk.learnjdk8.design_patterns.structuremodel.facede.powerSupply;

/**
 * 主执行类
 *
 * @author ldy
 * @create 2020-08-24 17:10
 */
public class MainClass {

    public static void main(String[] args) {
        // 在没有门面对象的情况下，关闭所有电源
        new Fridge().turnOff();
        new Television().turnOff();

        // 使用门面对象的情况下：
        new ElectricBrake().turnOffAll();
    }

    // 门面对象封装了子系统中所有需要使用到的业务对象，这样客户端只需要与门面对象直接交互即可，简单方便。
    // 只要子系统不会影响到门面模式的使用，那么子系统如何变化已经与客户端没有任何关系。
}
