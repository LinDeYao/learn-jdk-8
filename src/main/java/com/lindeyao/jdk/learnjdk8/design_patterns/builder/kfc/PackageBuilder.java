package com.lindeyao.jdk.learnjdk8.design_patterns.builder.kfc;

/**
 * 建造者模式--套餐建造者接口
 *
 * @author DeeLin
 * @create 2020-04-11-16:36
 */
public interface PackageBuilder {

    // 组建成了一个完整的对象
    public Package buildPackgeInstance();

    // 将产品对象的属性暴露出来，供外部设置
    public PackageBuilder setFood(String foodName);
    // 将产品对象的属性暴露出来，供外部设置
    public PackageBuilder setWater(String waterName);


}
