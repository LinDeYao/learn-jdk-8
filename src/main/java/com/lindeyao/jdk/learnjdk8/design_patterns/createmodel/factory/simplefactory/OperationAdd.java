package com.lindeyao.jdk.learnjdk8.design_patterns.createmodel.factory.simplefactory;

/**
 * 操作加法
 *
 * @author ldy
 * @create 2020-08-11 11:34
 */
public class OperationAdd extends AbstractOperation {

    @Override
    public int getResult() {
        return super.getNumberA() + super.getNumberB();
    }

}
