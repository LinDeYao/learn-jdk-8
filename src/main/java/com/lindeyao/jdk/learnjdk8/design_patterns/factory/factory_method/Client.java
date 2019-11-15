package com.lindeyao.jdk.learnjdk8.design_patterns.factory.factory_method;

/**
 * 场景类
 *
 * @author DeeLin
 * @create 2019-11-12 22:53
 */
public class Client {

    public static void main(String[] args) {
        // 获取创建人类这一种产品的具体工厂实例
        AbstractHumanFactory abstractHumanFactory = new HumanFactory();
        // 生产白种人
        Human whiteHuman = abstractHumanFactory.createHuman(WhiteHuman.class);
        whiteHuman.getColor();
        whiteHuman.talk();
        // 生产黑种人
        Human blackHuman = abstractHumanFactory.createHuman(BlackHuman.class);
        blackHuman.getColor();
        blackHuman.talk();
        // 生产黄种人
        Human yellowHuman = abstractHumanFactory.createHuman(YellowHuman.class);
        yellowHuman.getColor();
        yellowHuman.talk();
    }

    /**
     * 总结：www原则(What，Why，How)
     *
     * What：工厂方法模式，定义了一个用来创建某一种类产品对象的工厂接口，由该产品的子类去决定实例化哪一个类。
     *       工厂方法使一个类的实例化延迟到其子类。
     *
     * Why：如一个调用者需要一个具体的产品对象，只要知道这个产品对象的类名就可以了，不用知道创建对象的艰辛过程，降低模块间的耦合度。
     *      屏蔽产品类：产品类的实现如何变化，调用者都不需要关心，只需要关注产品的接口，只要接口保持不变，系统上层模块就不需要发生改变。
     *
     * How：参与者有：1：抽象工厂类、 2：具体工厂类(实现了抽象工厂类)、3：抽象产品、4：具体产品(实现了抽象产品，有多个)
     *
     * 使用场景：
     *       1：对于new一个对象的场景，可以使用工厂方法模式进行替换，但要慎重考虑是否要增加一个工厂类进行管理，增加代理复杂度
     *       2：当需要灵活的、可扩展的框架时，可考虑采用工厂方法模式。
     *
     */


}
