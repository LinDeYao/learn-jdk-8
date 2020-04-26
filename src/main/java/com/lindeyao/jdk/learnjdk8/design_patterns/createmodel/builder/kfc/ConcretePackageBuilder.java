package com.lindeyao.jdk.learnjdk8.design_patterns.createmodel.builder.kfc;

/**
 * 建造者模式--实体建造者
 *
 * @author DeeLin
 * @create 2020-04-11 16:40
 */
public class ConcretePackageBuilder implements PackageBuilder {

    private Package.Food food;
    private Package.Water water;

    // 构造套餐实体对象
    @Override
    public Package buildPackgeInstance() {
        ConcretePackage concretePackage = new ConcretePackage();
        concretePackage.setFood(this.food);
        concretePackage.setWater(this.water);
        return concretePackage;
    }

    @Override
    public PackageBuilder setFood(String foodName) {
        this.food = new Package.Hunberger(foodName);
        return this;
    }

    @Override
    public PackageBuilder setWater(String waterName) {
        this.water = new Package.Coffee(waterName);
        return this;
    }
}
