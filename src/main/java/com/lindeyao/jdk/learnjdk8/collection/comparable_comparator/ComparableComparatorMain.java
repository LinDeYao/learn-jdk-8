package com.lindeyao.jdk.learnjdk8.collection.comparable_comparator;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * 主执行类
 *
 * @author ldy
 * @create 2019-10-18 14:55
 */
public class ComparableComparatorMain {

    @Test
    public void test() {

        // Comparable例子：
        PersonWithComparable person = new PersonWithComparable("first", 10);
        PersonWithComparable person1 = new PersonWithComparable("second", 20);
        PersonWithComparable person2 = new PersonWithComparable("third", 16);
        List<PersonWithComparable> list = new ArrayList<>();
        list.add(person);
        list.add(person1);
        list.add(person2);
        // 结合了 Collections.sort(list)，可以默认进行排序
        // 而排序规则根据Person类实现Comparable中的方法来
        // 但是如果需要修改规则，我们则需要修改Person类。
        System.out.println("Comparable排序前："+list);
        Collections.sort(list);
        System.out.println("Comparable排序后："+list);


        //============================= 上面是Comparable例子,下面是Comparator比较器的例子  =====================
        PersonWithComparator comparator = new PersonWithComparator("first",10);
        PersonWithComparator comparator1 = new PersonWithComparator("second",20);
        PersonWithComparator comparator2 = new PersonWithComparator("third",16);
        // 当PersonWithComparator无法修改时(不能实现Comparable接口)，
        // 而我们又想对PersonWithComparator类的对象进行年龄的排序，我们要怎么做？
        // 这个时候，我们可以定义PersonWithComparator类的比较器，通过比较器，我们可以自定义排序规则，如下：
        List<PersonWithComparator> comparators = new ArrayList<>();
        comparators.add(comparator);
        comparators.add(comparator1);
        comparators.add(comparator2);
        System.out.println("Comparator排序前："+comparators);
        Collections.sort(comparators, new Comparator<PersonWithComparator>() {
            // 上面定义了PersonWithComparator类的比较器，规则在compare方法中
            @Override
            public int compare(PersonWithComparator o1, PersonWithComparator o2) {
                return o1.getAge()-o2.getAge(); // 根据年龄排序
            }
        });
        System.out.println("Comparator排序后："+comparators);
    }

}
