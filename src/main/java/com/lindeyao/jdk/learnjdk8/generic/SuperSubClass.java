package com.lindeyao.jdk.learnjdk8.generic;

import java.util.ArrayList;

/**
 * 泛型类型限定测试
 *
 * @author ldy
 * @create 2019-09-11 11:26
 */
public class SuperSubClass <T extends SuperClass>{

    public static void test(ArrayList<SuperClass> classes) {
        System.out.println(classes);
    }

    public static void test2(ArrayList<? extends SuperClass> classes) {
        System.out.println(classes);
    }

    public static void main(String[] args) {

        // SuperSubClass<SubClass> 编译通过
        // 因为传递进来的SubClass刚好继承SuperClass
        SuperSubClass<SubClass> aClass = new SuperSubClass<>();

        // 报错，因为String并非SuperClass的子类
        //SuperSubClass<String> subClass = new SuperSubClass<String>();

        // 泛型通配符 ？ 测试1
        ArrayList<SubClass> subClasses = new ArrayList<>();
        // 不通过，因为 ArrayList<SubClass>跟ArrayList<SuperSubClass> 没有关系
        //SuperSubClass.test(subClasses);

        // 泛型通配符 ？ 测试2
        // 测试通过，因为? 表示主要传递的类型为SuperClass的子类或者实现类即可。
        SuperSubClass.test2(subClasses);
    }
}
