package com.lindeyao.jdk.learnjdk8.design_patterns.factory.factory_method_replaceSingleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * 工厂方法模式，替换单例模式生成单例对象
 *
 * @author ldy
 * @create 2019-11-15 15:25
 */
public class SingletonFactory {

    private static Singleton singleton;

    static {
        try {
            Class aClass = Class.forName(Singleton.class.getName());

            // getDeclaredXX：获取当前类所有访问类型的方法(public、private、protect)，但并不包含从父类继承过来的方法
            // getXX：获取类中所有public访问修饰符的方法，包括从父类继承过来的public方法
            // 此处是获取 private 构造方法
            Constructor<Singleton> constructor = aClass.getDeclaredConstructor();

            // 使用暴力，让构造函数能够被通过，因为构造函数是 private 修饰的
            constructor.setAccessible(true);
            // 直接创建实例
            singleton = constructor.newInstance();

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }

    public static Singleton getSingleton() {
        return singleton;
    }
}
