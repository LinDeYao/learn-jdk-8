package com.lindeyao.jdk.learnjdk8.design_patterns.structuremodel.bridging.arearestaurant;

/**
 * 桥接模式： ConcreteImplementor角色--小南国餐厅
 *
 * @author ldy
 * @create 2020-04-17 11:22
 */
public class XiaoNanGuoRestaurant implements Restaurant {

    @Override
    public String taste() {
        return "红烧肉比较好吃";
    }

}
