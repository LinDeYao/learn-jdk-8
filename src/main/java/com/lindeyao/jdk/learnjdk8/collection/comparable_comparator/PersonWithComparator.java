package com.lindeyao.jdk.learnjdk8.collection.comparable_comparator;

import lombok.Data;

/**
 * 比较器Comparator demo
 * 该类添加了final，说明不能被继承和修改，此时，我们如果要对该类的对象进行排序，怎么办？
 *
 * @author ldy
 * @create 2019-10-18 15:46
 */
@Data
public final class PersonWithComparator {

    private String name;
    private int age;

    PersonWithComparator(String name,int age) {
        this.age = age;
        this.name = name;
    }

}
