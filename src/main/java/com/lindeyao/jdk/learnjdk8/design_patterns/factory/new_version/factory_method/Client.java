package com.lindeyao.jdk.learnjdk8.design_patterns.factory.new_version.factory_method;

/**
 * 场景类
 *
 * @author DeeLin
 * @create 2019-11-12 22:53
 */
public class Client {

    public static void main(String[] args) {
        // 获取创建人类这一种产品的工厂实例
        AbstractHumanFactory abstractHumanFactory = new HumanFactory();
        // 生产白种人
        Human whiteHuman = abstractHumanFactory.createHuman(WhiteHuman.class);
        whiteHuman.getColor();
        whiteHuman.talk();
        // 生产黑种人
        Human blackHuman = abstractHumanFactory.createHuman(BlackHuman.class);
        blackHuman.getColor();
        blackHuman.talk();
        // 生产黄种人
        Human yellowHuman = abstractHumanFactory.createHuman(YellowHuman.class);
        yellowHuman.getColor();
        yellowHuman.talk();
    }

    /**
     * 总结：www原则
     *
     */
}
