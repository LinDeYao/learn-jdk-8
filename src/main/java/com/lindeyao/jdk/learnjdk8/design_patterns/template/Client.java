package com.lindeyao.jdk.learnjdk8.design_patterns.template;

/**
 * 场景调用类
 *
 * @author ldy
 * @create 2019-11-21 16:40
 */
public class Client {

    public static void main(String[] args) {
        AbstractHummerModel hummerModelH1 = new HummerH1Model();
        hummerModelH1.run();

        AbstractHummerModel hummerModelH2 = new HummerH2Model();
        hummerModelH2.run();

    }

    /**
     * 抽象是所有子类的共性封装。
     *
     * 模板方法：从上面的例子我们可以看到，run方法里面的实现逻辑跟具体类实际上没有联系，
     * 换句话说，在run方法里面，所有具体类都是一模一样的写法。
     * 那么，我们可以将run方法抽取到父类当中。为什么呢？因为本来抽象父类中已经实现的方法就已经共同说明了子类同一种行为。
     * 所有统一的行为由父类去实现，而不同的逻辑由子类继承并实现
     *
     * 这里的模板方法就是这个道理，将run方法实现抽取到父类当中。这里的run方法里面的逻辑就是模板方法的体现，具体的实现逻辑由子类去实现。
     *
     * 模板方法的优点：
     * 1：封装不变部分，扩展可变部分
     * 把认为不变的部分的算法封装到父类实现，而可变部分则通过继承来继续扩展。
     * 2：提取公共代码，便于维护
     * 3：行为由父类控制，子类实现，由子类实现基本方法，通过扩展增加相应功能，符合开闭原则
     *
     * 模板方法的缺点
     * 按照设计习惯，抽象类负责声明最抽象、最一般的事务属性和方法，实现类完成具体的事务属性和方法。
     * 但模板方法中，抽象类定义了部分抽象方法，由子类实现，子类执行的结果影响了父类的结果，也就是子类对父类产生了影响。
     *
     * 使用场景：
     * 1：多个子类有共有的方法，并且逻辑基本相同时
     * 2：
     *
     */
}
