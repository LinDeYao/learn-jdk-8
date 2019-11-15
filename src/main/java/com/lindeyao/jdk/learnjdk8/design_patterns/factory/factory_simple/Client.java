package com.lindeyao.jdk.learnjdk8.design_patterns.factory.factory_simple;

import com.lindeyao.jdk.learnjdk8.design_patterns.factory.factory_method.Human;
import com.lindeyao.jdk.learnjdk8.design_patterns.factory.factory_method.WhiteHuman;
import com.lindeyao.jdk.learnjdk8.design_patterns.factory.factory_method.YellowHuman;

/**
 * 场景调用类(简单工厂)
 *
 * @author ldy
 * @create 2019-11-13 12:46
 */
public class Client {

    public static void main(String[] args) {
        // 生产白人
        Human whiteHuman = HumanFactory.createHuman(WhiteHuman.class);
        whiteHuman.getColor();
        whiteHuman.talk();
        // 生产黄种人
        Human yellowHuman = HumanFactory.createHuman(YellowHuman.class);
        yellowHuman.getColor();
        yellowHuman.talk();

    }

    /**
     * 总结：
     *
     * 通过与上面工厂方法模式相对比，扩展后的工厂有两点变化：1：缺少了抽象工厂的约束；2：对外提供了静态方法。
     * 该模式是工厂方法模式的弱化，因为简单，所以被称为简单工厂模式，也叫静态工厂模式。
     *
     * 在实际项目中，采用该模式还是比较多的。
     * 缺点是：工厂类的扩展比较困难，不符合开闭原则，但仍然是一个非常实用的设计模式。
     *
     */

}
