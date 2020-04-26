package com.lindeyao.jdk.learnjdk8.design_patterns.createmodel.factory.factory_abstract;

/**
 * 抽象工厂方法--场景类
 *
 * @author ldy
 * @create 2019-11-18 16:25
 */
public class Client {

    public static void main(String[] args) {

        // 生产男性的工厂
        HumanFactory maleHumanFactory = new MaleHumanFactory();
        // 生产女性的工厂
        HumanFactory femaleHumanFactory = new FemaleHumanFactory();

        // 开始生产黑人：
        // 男性--黑人，女性--黑人
        IHuman maleBlackHuman = maleHumanFactory.createBlackHuman();
        IHuman femaleBlackHuman = femaleHumanFactory.createBlackHuman();
        maleBlackHuman.getColor();
        maleBlackHuman.talk();
        maleBlackHuman.getSex();
        femaleBlackHuman.getColor();
        femaleBlackHuman.talk();
        femaleBlackHuman.getSex();
    }

    /**
     * 抽象工厂方法总结：
     *
     * 定义：为创建一组相关或相互依赖的对象提供一个接口(HumanFactory.java，提供了肤色和语言相关的3种不同类型人种)，
     * 而且无需指定它们的具体类。
     *
     *
     *
     */

}
