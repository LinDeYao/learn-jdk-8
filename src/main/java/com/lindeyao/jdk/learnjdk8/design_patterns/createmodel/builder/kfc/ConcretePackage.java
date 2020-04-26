package com.lindeyao.jdk.learnjdk8.design_patterns.createmodel.builder.kfc;

import lombok.Getter;
import lombok.Setter;

/**
 * 建造者模式--套餐实体
 *
 * @author DeeLin
 * @create 2020-04-11 16:24
 */
@Getter
@Setter
public class ConcretePackage implements Package {

    // Package
    private Water water;
    // 套餐包含--食物
    private Food food;

    @Override
    public String toString() {
        return "ConcretePackage{" +
                "water=" + water +
                ", food=" + food +
                '}';
    }
}
