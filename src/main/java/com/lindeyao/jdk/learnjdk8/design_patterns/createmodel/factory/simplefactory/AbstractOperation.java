package com.lindeyao.jdk.learnjdk8.design_patterns.createmodel.factory.simplefactory;

import lombok.Getter;
import lombok.Setter;

/**
 * 操作抽象类
 *
 * @author ldy
 * @create 2020-08-11 11:32
 */
public abstract class AbstractOperation {

    @Getter
    @Setter
    private int numberA;

    @Getter
    @Setter
    private int numberB;

    public abstract int getResult();

}
