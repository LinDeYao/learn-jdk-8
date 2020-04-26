package com.lindeyao.jdk.learnjdk8.design_patterns.createmodel.factory.factory_method_variant;


import com.lindeyao.jdk.learnjdk8.design_patterns.createmodel.factory.factory_method.BlackHuman;
import com.lindeyao.jdk.learnjdk8.design_patterns.createmodel.factory.factory_method.Human;

/**
 * 黑人工厂（具体工厂）
 * 只生产黑人，职责单一明确，符合单一职责
 *
 * @author ldy
 * @create 2019-11-15 14:34
 */
public class BlackHumanFactory extends AbstractHumanFactory {

    @Override
    Human createHuman() {
        return new BlackHuman();
    }
}
