package com.lindeyao.jdk.learnjdk8.design_patterns.decorator.landandroom.normal;

/**
 * 装饰者模式：场景操作类
 *
 * @author ldy
 * @create 2020-04-22 11:53
 */
class Client {

    public static void main(String[] args) {
        // 现在直接计算使用餐厅的费用
        Land livingRoom = new LivingRoom();
        System.out.println("卧室的费用是：" + livingRoom.cost());

        Land diningRoom = new DiningRoom();
        System.out.println("餐厅的费用是：" + diningRoom.cost());

        // 我们可以很容易地建造一间客厅和建造一间餐厅的费用，但是如果买的地比较小，只能把卧室和客厅建在同一个房间里。那怎么去计算费用呢？
        // 难道还要去新建一个包含客厅和卧室的 LivingDiningRoom 类？这样做的话除了麻烦，还会使代码产生重复。、

        // 我们是否可以使用装饰者模式来替代生成 LivingDiningRoom 类，请看 decoration包的例子

    }
}
