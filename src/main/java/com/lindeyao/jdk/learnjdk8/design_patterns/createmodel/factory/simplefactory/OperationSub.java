package com.lindeyao.jdk.learnjdk8.design_patterns.createmodel.factory.simplefactory;

/**
 * 操作减法
 *
 * @author ldy
 * @create 2020-08-11 11:35
 */
public class OperationSub extends AbstractOperation {

    @Override
    public int getResult() {
        return super.getNumberA() - super.getNumberB();
    }

}
