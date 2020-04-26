package com.lindeyao.jdk.learnjdk8.design_patterns.createmodel.factory.factory_method_variant;

import com.lindeyao.jdk.learnjdk8.design_patterns.createmodel.factory.factory_method.Human;
import com.lindeyao.jdk.learnjdk8.design_patterns.createmodel.factory.factory_method.WhiteHuman;

/**
 * 白人工厂（具体工厂）
 * 白人工厂直接创建白人的对象，职责非常明确，而且单一，符合单一职责。
 *
 * @author ldy
 * @create 2019-11-15 14:31
 */
public class WhiteHumanFactory extends AbstractHumanFactory{

    @Override
    Human createHuman() {
        return new WhiteHuman();
    }

}
