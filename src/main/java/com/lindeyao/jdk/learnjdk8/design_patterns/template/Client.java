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
     * 封装不变部分，扩展可变部分
     *
     *
     *
     *
     */
}
