package com.lindeyao.jdk.learnjdk8.design_patterns.factory.factory_method;

/**
 * 黄色人种
 *
 * @author DeeLin
 * @create 2019-11-12 22:44
 */
public class YellowHuman implements Human{

    @Override
    public void getColor() {
        System.out.println("黄色人种的皮肤是黄色的");
    }

    @Override
    public void talk() {
        System.out.println("黄种人会说话，说的一般都是双字节的！");
    }
}
