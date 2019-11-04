package com.lindeyao.jdk.learnjdk8.collection.map;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

/**
 * TreeMap示例
 *
 * @author ldy
 * @create 2019-10-21 9:11
 */
public class TreeMapDemo {

    public static void main(String[] args) {

        Map<String, String> map = new TreeMap<>();
        map.put("a","dd");
        map.put("k", "ff");
        map.put("cc", "cc");
        map.put("bc", "bb");

        // TreeMap构造函数可以自定义一个比较器，根据自己的规则进行排序
        /*Map<String, String> map = new TreeMap<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        });*/

        // 从上图可看出，TreeMap默认会帮我们帮我们自动排序了
        map.forEach((key,value) -> {
            System.out.println("key="+key+",value="+value);
        });

    }

}
