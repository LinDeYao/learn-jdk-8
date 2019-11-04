package com.lindeyao.jdk.learnjdk8.stream;

import com.sun.org.apache.regexp.internal.RE;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Stream测试
 *
 * @author ldy
 * @create 2019-10-31 18:56
 */
public class StreamTest {

    public static void main(String[] args) {

        // 数组构造和转换 方式一：内部其实调用的也是Arrays.stream();
        Stream<String> stream = Stream.of("c","a","b");
        stream.sorted().forEach(System.out::println);
        // 数组构造和转换 方式二：
        String[] arr = {"2","1","3"};
        Stream<String> arrStream = Arrays.stream(arr);
        arrStream.sorted().forEach(System.out::println);
        // 集合的流构造
        List<String> list = Arrays.asList(arr);
        Stream<String> listStream = list.stream();

        // 流转换成数组
        Stream<String> arrayStream = Stream.of("c","a","b");
        String[] strArray1 = arrayStream.toArray(String[]::new);
        // 流转换成列表
        List<String> list1 = listStream.collect(Collectors.toList());
        System.out.println(list1);

        // 观察map方法：将元素中的每一个元素都映射成另外一个种元素
        map();
    }

    // 将数组中的元素都变成大写
    public static void map() {
        Stream<String> stream = Stream.of("c","a","b");
        stream.map(String::toUpperCase).sorted().forEach(System.out::print);
    }

}
