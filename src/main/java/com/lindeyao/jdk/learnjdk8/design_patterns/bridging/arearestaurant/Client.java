package com.lindeyao.jdk.learnjdk8.design_patterns.bridging.arearestaurant;

/**
 * 桥接模式--客户端调用
 *
 * @author ldy
 * @create 2020-04-17 11:35
 */
public class Client {

    public static void main(String[] args) {
        // 评价广东(纬度1)的外婆家(纬度2)的产品味道
        AbstractCityArea guangDongCityArea = new GuangDongCityArea(new WaiPoJiaRestaurant());
        guangDongCityArea.commentTaste();

        // 评价上海的南国的产品味道
        AbstractCityArea shangHaiCityArea = new ShangHaiCityArea(new XiaoNanGuoRestaurant());
        shangHaiCityArea.commentTaste();

        // 也可以是广东+小南国，或者上海+外婆家，两个维度自由组合，这就是桥接模式的好处。
    }

    // 总结： 桥接模式，顾名思义，桥：就是把两边的关系建立起来，在java中表现为连接两个接口（不同纬度）。选择其中一个接口（一般为抽象类：Abstraction角色），
    // 并通过聚合关系(持有另外一个接口:Implementor角色 的引用)，这里就是所谓桥接的关键，进行两者关系的搭桥连接。
    // 抽象类中定义自身的接口，让子类去扩展（RefinedAbstraction角色），在扩展中可以调用：Implementor角色的方法。
    // Implementor角色的接口，让子类去实现(ConcreteImplementor角色)。
    // 在客户端进行调用的时候，使用 抽象类定义的接口对象，进行方法调用。 如上所示

    // 由此，我们知道，桥接模式一共会有4中角色定义： 1:Abstraction角色（抽象类，并持有另外一个纬度的接口（桥接））； 2：Implementor角色(纬度的抽象)
    // 3：RefinedAbstraction角色（Abstraction角色的实现） 4：ConcreteImplementor角色（Implementor角色的实现）

}
