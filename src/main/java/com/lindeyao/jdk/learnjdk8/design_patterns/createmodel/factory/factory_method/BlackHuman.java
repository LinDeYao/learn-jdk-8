package com.lindeyao.jdk.learnjdk8.design_patterns.createmodel.factory.factory_method;

/**
 * 黑色人种(对应具体产品)
 *
 * @author DeeLin
 * @create 2019-11-12 22:42
 */
public class BlackHuman implements Human{

    @Override
    public void getColor() {
        System.out.println("黑色人种的皮肤一般都是黑色的！");
    }

    @Override
    public void talk() {
        System.out.println("黑人会说话，一般说的话听不懂！");
    }
}
