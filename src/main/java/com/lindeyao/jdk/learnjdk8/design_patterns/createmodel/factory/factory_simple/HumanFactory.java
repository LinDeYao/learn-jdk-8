package com.lindeyao.jdk.learnjdk8.design_patterns.createmodel.factory.factory_simple;

import com.lindeyao.jdk.learnjdk8.design_patterns.createmodel.factory.factory_method.Human;

/**
 * 专门生产人类（单一种产品）的简单工厂
 * 只有实体类，没有继承或者实现抽象工厂
 * 而且方法是static，开放出去了
 *
 * @author ldy
 * @create 2019-11-13 12:41
 */
public class HumanFactory {

    public static <T extends Human> T createHuman(Class<? extends Human> tClass) {
        Human human = null;
        try {
            human = (Human) Class.forName(tClass.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return (T)human;
    }

}
