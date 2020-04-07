package com.lindeyao.jdk.learnjdk8.design_patterns.builder.kfc;

/**
 * 建造者模式：抽象建造者
 *
 * @author DeeLin
 * @create 2020-04-04-21:18
 */
public interface MealBuilder {

    // 返回一个产品对象，套餐
    Meal getInstance();

    // 选择套餐组成部件：主食
    Food getFoodInstance();

    // 选择套餐组成部件：饮料
    Water getWaterInstance();

}
