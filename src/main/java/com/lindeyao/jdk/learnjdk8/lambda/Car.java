package com.lindeyao.jdk.learnjdk8.lambda;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * JDK8 特点：方法引用
 *
 * @author ldy
 * @create 2019-09-05 11:49
 */
public class Car {

    // 第一种方法引用的类型是: 构造器引用,注意没有带参数
    public static Car create(Supplier<Car> supplier) {
        return supplier.get();
    }

    // 第二种方法引用是静态类型引用
    public static void drive() {
        System.out.println("drive a car");
    }

    public void repair() {
        System.out.println( "Repaired " + this.toString() );
    }


    public static void main(String[] args) {
        Car car = Car.create(Car::new);
        System.out.println(car);

        List< Car > cars = Arrays.asList( car );
        cars.forEach(Car::repair);

        //Collection;
        //Function
    }
}
