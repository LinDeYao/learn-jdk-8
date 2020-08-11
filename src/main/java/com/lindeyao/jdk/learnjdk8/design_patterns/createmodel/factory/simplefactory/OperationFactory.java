package com.lindeyao.jdk.learnjdk8.design_patterns.createmodel.factory.simplefactory;

/**
 * 简单工厂生产操作对象
 *
 * @author ldy
 * @create 2020-08-11 11:36
 */
public class OperationFactory {

    public static AbstractOperation createOperation(String type) {
        switch (String.valueOf(type)) {
            case "+":
                return new OperationAdd();
            case "-":
                return new OperationSub();
        }
        return null;
    }

}
