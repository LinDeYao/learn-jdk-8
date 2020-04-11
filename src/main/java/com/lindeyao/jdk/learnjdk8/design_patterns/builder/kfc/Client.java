package com.lindeyao.jdk.learnjdk8.design_patterns.builder.kfc;

/**
 * 建造者模式--执行者
 *
 * @author DeeLin
 * @create 2020-04-11 17:16
 */
public class Client {

    public static void main(String[] args) {

        //
        PackageBuilder packageBuilder = new ConcretePackageBuilder();

        Director director = new Director(packageBuilder);

        director.constructPackage("汉堡", "咖啡");

        Package aPackage = director.getPackage();

        System.out.println(aPackage);

    }

}
