package com.lindeyao.jdk.learnjdk8.design_patterns.builder.starbucks;

import lombok.Data;

/**
 * 建造者模式--产品类：星巴克
 *
 * @author DeeLin
 * @create 2020-04-11 21:11
 */
@Data
public class Starbucks {

    // 大小杯
    private String size;
    // 是否加糖
    private boolean suger;

}
