package com.lindeyao.jdk.learnjdk8.design_patterns.builder.kfc;

import java.time.format.DateTimeFormatter;

/**
 * 建造者模式：实体建造者：套餐1
 *
 * @author DeeLin
 * @create 2020-04-04 21:25
 */
public class ConcreteMealBuilder implements MealBuilder {

    // 返回套餐1对象
    @Override
    public Meal getInstance() {
        Meal meal = new Meal();
        meal.setFood(this.getFoodInstance());
        meal.setWater(this.getWaterInstance());

        //DateTimeFormatter

        return meal;
    }

    // 汉堡1
    @Override
    public Food getFoodInstance() {
        return new Hamburger();
    }

    // 咖啡饮料
    @Override
    public Water getWaterInstance() {
        return new Coffee();
    }


}
