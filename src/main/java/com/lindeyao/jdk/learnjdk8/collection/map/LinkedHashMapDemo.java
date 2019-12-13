package com.lindeyao.jdk.learnjdk8.collection.map;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * LinkedHashMap测试类
 *
 * @author ldy
 * @create 2019-10-17 18:26
 */
public class LinkedHashMapDemo {

    public static void main(String[] args) {

        Map<String, String> linkedHashMap = new LinkedHashMap();

        // key和value都可以为null
        //linkedHashMap.put(null, null);
        linkedHashMap.put("cc", "23");
        linkedHashMap.put("ab", "12");
        linkedHashMap.put("fd", "32");
        linkedHashMap.put("ff", "43");

        // stream转换成成set遍历
        linkedHashMap.entrySet().stream().forEach(entry->{
            System.out.println("key="+entry.getKey()+",value="+entry.getValue());
        });

        System.out.println("map的foreach直接遍历开始");

        // map的foreach直接遍历
        linkedHashMap.forEach((key,value)->{
            System.out.println("key="+key+",value="+value);
        });
    }

}
