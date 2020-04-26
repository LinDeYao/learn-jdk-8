package com.lindeyao.jdk.learnjdk8.design_patterns.createmodel.builder.house;

import lombok.Data;

/**
 * 建造者模式例子--房子，建造的产品对象
 *
 * @author ldy
 * @create 2020-01-14 17:49
 */
@Data
public class House {

    // 打地基
    private String foundation;
    // 盖框架
    private String frame;
    // 浇筑
    private String pouring;

}
