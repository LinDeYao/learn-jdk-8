package com.lindeyao.jdk.learnjdk8.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * Java8内置函数接口
 *
 * 主要学会jdk8中内置的函数接口即可，至于如何使用，如下：
 *
 * 1：查看对应的函数接口，并找到对应的接口抽象方法
 * 2：首先查看是否有入参参数，如果有，是多少个入参。
 * 3：查看是否有返回值，如果有，值的类型是什么。
 * 注意：
 *      函数接口中抽象方法的方法名在编写lambda中不会使用到，没有实际的意义。
 * 4：书写lambda表达式，从上面得知需要几个入参，是否有返回值，然后在：{ }中书写自己的业务即可。
 *
 * @author ldy
 * @create 2019-09-12 11:38
 */
public class Java8BuiltInInterface {

    // 内置函数1： Supplier<T>, 入参：无， 返回类型：T
    // 主要作用是：无输入，有输出，用于生产某值
    public static <T> T newInstance(Supplier<T> supplier) {
        return supplier.get();
    }

    // 内置函数2： Predicate<T>, 入参：T, 返回类型 boolean
    // 主要作用是：对输入的值是否符合条件，并返回boolean值
    public void predicateDemo() {
        Predicate<Integer> filter = (t)-> t%2==0;
        ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9));
        list.forEach(num -> {
            if(filter.test(num)) {
                System.out.println("Predicate：过滤偶数:" + num);
            }
        });
    }

    // 内置函数3: Consumer<T>, 入参: T, 返回： void
    // 主要作用: 输入某个值，没有输出，用于消费某值
    public <T> void ConsumerDemo(Consumer<T> consumer, T t) {
        consumer.accept(t);
    }


    public static void main(String[] args) {
        // 测试：Supplier，生产某值：创建类的实例
        // 方式一：
        Java8BuiltInInterface built = Java8BuiltInInterface.newInstance(()-> new Java8BuiltInInterface());
        // 方式二：
        //Java8BuiltInInterface built = Java8BuiltInInterface.newInstance(Java8BuiltInInterface::new);
        System.out.println("Supplier：创建的实例" + built);

        //测试：Predicate，是否符合条件
        built.predicateDemo();


        built.ConsumerDemo((t)->{
            System.out.println(t);
        }, "测试Consumer");

    }
}
