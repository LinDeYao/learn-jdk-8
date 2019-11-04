package com.lindeyao.jdk.learnjdk8.collection.map;

import java.util.*;

/**
 * HashMap测试类
 *
 * @author ldy
 * @create 2019-10-17 16:18
 */
public class HashMapDemo {

    public static void main(String[] args) {

        // 测试
        Map hashMap = new HashMap();
        hashMap.put("3", "Value3");
        hashMap.put("1", "Value1");
        hashMap.put("2", "Value2");
        hashMap.put("b", "ValueB");
        hashMap.put("a", "ValueA");

        // iterator 遍历
        Iterator iterator = hashMap.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String,String> entry = (Map.Entry<String, String>) iterator.next();
            System.out.println("key="+entry.getKey()+"; value="+entry.getValue());
        }

        // foreach 遍历
        hashMap.forEach((key, value)-> {
            System.out.println("key="+key+"; value="+value);
        });

        /**
         * 遍历结果：
         * key=1; value=Value1
         * key=a; value=ValueA
         * key=2; value=Value2
         * key=b; value=ValueB
         * key=3; value=Value3
         * 可以看出，HashMap并没有维护插入数据的顺序(随机取)
         */

        // HashMap本身不是线程安全的，
        // 可以借助 Collections工具类的synchronizedxx转换成线程安全的。
        // 其原理只是在方法加上synchronized
        hashMap = Collections.synchronizedMap(hashMap);

        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(1);
        list.add(3);
        System.out.println(list);
        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return 0;
            }
        });
        System.out.println(list);

        /*Collections.reverse(list);
        System.out.println(list);
        Collections.shuffle(list);*/

    }
}
