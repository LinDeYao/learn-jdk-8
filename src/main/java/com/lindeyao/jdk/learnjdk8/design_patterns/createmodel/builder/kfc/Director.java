package com.lindeyao.jdk.learnjdk8.design_patterns.createmodel.builder.kfc;

/**
 * 建造者模式--导演者
 *
 * @author DeeLin
 * @create 2020-04-11 17:06
 */
public class Director {

    private PackageBuilder packageBuilder;

    public Director(PackageBuilder packageBuilder) {
        this.packageBuilder = packageBuilder;
    }

    public Package getPackage() {
        return packageBuilder.buildPackgeInstance();
    }

    public void constructPackage(String foodName, String waterName) {
        packageBuilder.setFood(foodName);
        packageBuilder.setWater(waterName);
    }
}
