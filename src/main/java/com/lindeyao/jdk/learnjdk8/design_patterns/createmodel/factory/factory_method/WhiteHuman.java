package com.lindeyao.jdk.learnjdk8.design_patterns.createmodel.factory.factory_method;

/**
 * 白色人种(对应具体产品)
 *
 * @author DeeLin
 * @create 2019-11-12 22:40
 */
public class WhiteHuman implements Human{

    @Override
    public void getColor() {
        System.out.println("白色人种的皮肤是白色的！");
    }

    @Override
    public void talk() {
        System.out.println("白人会说话，说的一般都是单字符！");
    }
}
