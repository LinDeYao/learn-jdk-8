package com.lindeyao.jdk.learnjdk8.design_patterns.builder.kfc;

import lombok.Data;

/**
 * 建造者模式：产品对象：KFC套餐
 *
 * 套餐对象
 *
 * @author DeeLin
 * @create 2020-04-04 20:54
 */
@Data
public class Meal {

    // 套餐里面有主食和饮料
    private Food food;
    private Water water;

}
