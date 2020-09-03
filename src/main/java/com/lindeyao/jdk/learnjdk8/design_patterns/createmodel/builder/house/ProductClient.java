package com.lindeyao.jdk.learnjdk8.design_patterns.createmodel.builder.house;

/**
 * @author ldy
 * @create 2020-09-03 15:46
 */
public class ProductClient {

    public static void main(String[] args) {
        Product.ProductBuilder productBuilder = new Product.ProductBuilder();

        // 建造者模式，流式代码，非常简洁。
        Product build = productBuilder.setCpu("英特尔").setMainBoard("主板").setPowerSupplier("显示器").build();

        System.out.println(build);

    }


}
