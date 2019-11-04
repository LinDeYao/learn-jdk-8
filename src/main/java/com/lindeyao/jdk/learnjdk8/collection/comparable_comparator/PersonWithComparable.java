package com.lindeyao.jdk.learnjdk8.collection.comparable_comparator;

import lombok.Data;

/**
 * Comparable 接口的 demo
 * 实现了Comparable接口，该类会以compareTo方法规则来排序
 *
 * @author ldy
 * @create 2019-10-18 14:45
 */
@Data
public class PersonWithComparable implements Comparable<PersonWithComparable> {

    private String name;
    private int age;

    PersonWithComparable() {

    }

    PersonWithComparable(String name, int age) {
        this.age = age;
        this.name = name;
    }


    // 需求：如果用到集合并要求年龄排序的时候，年龄从小到大排序
    // 特点：compareTo已经确定了排序规则，代码是什么样，排序就是怎样。
    // 对于该类，我们已经自定义好了排序规则，如果我们修改排序规则，是不是改下这个类就行了，
    // 但如果该类你无法进行修改，那该怎么办呢？
    @Override
    public int compareTo(PersonWithComparable person) {
        return this.age-person.getAge();
    }
}
