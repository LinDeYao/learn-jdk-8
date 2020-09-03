package com.lindeyao.jdk.learnjdk8.design_patterns.createmodel.builder.house;

/**
 * 客户端
 *
 * @author ldy
 * @create 2020-09-03 15:17
 */
public class Client {

    public static void main(String[] args) {
        // 自己盖房子，亲力亲为,也就是自己new一个对象，自己设置属性
        // 大部分客户端都是这么使用的
        House house = new House();
        house.setFoundation("用户自己建造房子：打地基");
        house.setFrame("用户自己建造房子：盖框架");
        house.setPouring("用户自己建造房子：浇筑");

        System.out.println(house.getFoundation());
        System.out.println(house.getFrame());
        System.out.println(house.getPouring());

        // 方式二、客户找一个建造者盖一个平房「充当包工头角色」，但是要知道如何盖房子「调用建造者盖房子的顺序」
        HouseBuilder builder = new PingFangBuilder();
        // 让包工头开始进行建造,其实就是设置属性(本身还扮演着指挥者的角色)，并返回建好的房子
        builder.doFoundation();
        builder.doFrame();
        builder.dpPouring();
        House builderHouse = builder.getHouse();

        System.out.println(builderHouse.getFoundation());
        System.out.println(builderHouse.getFrame());
        System.out.println(builderHouse.getPouring());

        // 方式三、使用建造者模式，找一个设计师「设计师拉一帮建造者去干活」，告诉他我想要什么样的房子，最后客户只问设计师要房子即可
        // 其实就是客户端跟设计师打交道,设计师指挥包工头干活,包工头弄完交给客户
        HouseDirector houseDirector = new HouseDirector();
        HouseBuilder louFangBuilder = new LouFangBuilder();
        houseDirector.buildHouse(louFangBuilder);
        House louFangBuilderHouse = louFangBuilder.getHouse();

        System.out.println(louFangBuilderHouse.getFoundation());
        System.out.println(louFangBuilderHouse.getFrame());
        System.out.println(louFangBuilderHouse.getPouring());

    }

}
