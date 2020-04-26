package com.lindeyao.jdk.learnjdk8.design_patterns.createmodel.factory.factory_method_variant;

import com.lindeyao.jdk.learnjdk8.design_patterns.createmodel.factory.factory_method.Human;
import com.lindeyao.jdk.learnjdk8.design_patterns.createmodel.factory.factory_method.YellowHuman;

/**
 * 白人工厂（具体工厂）
 * 符合单一职责
 * @author ldy
 * @create 2019-11-15 14:35
 */
public class YellowHumanFactory extends AbstractHumanFactory {

    @Override
    Human createHuman() {
        return new YellowHuman();
    }
}
