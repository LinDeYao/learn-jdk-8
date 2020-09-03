package com.lindeyao.jdk.learnjdk8.design_patterns.createmodel.builder.house;

/**
 * 建造者模式---特例，如果只有一类产品需要建造，可以省略抽象建造和指挥者类
 * 同时，将具体建造者类合并进入产品类当中。
 *
 * @author ldy
 * @create 2020-09-03 15:37
 */
public class Product {

    // 属性如下，也就是组件有
    private String cpu;           // cpu
    private String powerSupplier; // 电源
    private String mainBoard;     // 主板

    public Product() {
    }

    // 产品类充当指挥者的角色，实际上就是指挥建造者进行建造，也就是设置对象的属性
    public Product(ProductBuilder builder) {
        this.cpu = builder.cpu;
        this.powerSupplier = builder.powerSupplier;
        this.mainBoard = builder.mainBoard;
    }

    // 将建造者加入到产品类当中
    public static class ProductBuilder {
        private String cpu;           // cpu
        private String powerSupplier; // 电源
        private String mainBoard;     // 主板

        public ProductBuilder setCpu(String cpu) {
            this.cpu = cpu;
            return this;
        }

        public ProductBuilder setPowerSupplier(String powerSupplier) {
            this.powerSupplier = powerSupplier;
            return this;
        }

        public ProductBuilder setMainBoard(String mainBoard) {
            this.mainBoard = mainBoard;
            return this;
        }

        // 建造者需要承担建造对象的责任
        public Product build() {
            return new Product(this);
        }
    }

}
