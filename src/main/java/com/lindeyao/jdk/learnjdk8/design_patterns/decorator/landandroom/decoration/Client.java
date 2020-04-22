package com.lindeyao.jdk.learnjdk8.design_patterns.decorator.landandroom.decoration;

import com.lindeyao.jdk.learnjdk8.design_patterns.decorator.landandroom.normal.Land;
import com.lindeyao.jdk.learnjdk8.design_patterns.decorator.landandroom.normal.Room;

/**
 * 装饰者模式：使用场景
 *
 * @author ldy
 * @create 2020-04-22 14:27
 */
public class Client {

    public static void main(String[] args) {
        // 这里需要显示的传入需要被增强的对象，调用的装饰者的子类
        Land livingRoom = new LivingRoom(new Room());
        System.out.println("卧室的费用是:" + livingRoom.cost());

        // 这里需要显示的传入需要被增强的对象，调用的装饰者的子类
        Land diningRoom = new DiningRoom(new Room());
        System.out.println("客厅的费用是:" + diningRoom.cost());

        // 如何同时计算卧室跟客厅的费用呢？无需通过新建对象进行继承的方式
        Land diningLivingRoom = new DiningRoom(new LivingRoom(new Room()));
        System.out.println("卧室和客厅的费用是:" + diningLivingRoom.cost());
    }

    // 总结：与继承关系相比，关联关系的主要优势是不会破坏类的封装性，而且继承是一种耦合度比较大的静态关系，无法在程序运行时动态扩展。
    // 当然，关联关系的缺点是比继承关系要创建更多的对象。
    // 使用装饰模式来实现扩展比继承更加灵活，它以对客户透明的方式动态地给一个对象附加更多的责任。装饰模式可以在不需要创造更多子类的情况下，将对象的功能加以扩展。
    // 装饰模式与继承关系的目的都是要扩展对象的功能，但是装饰模式可以提供比继承更多的灵活性

}
