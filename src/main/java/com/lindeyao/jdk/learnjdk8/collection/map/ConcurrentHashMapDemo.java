package com.lindeyao.jdk.learnjdk8.collection.map;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * ConcurrentHashMap测试
 *
 * @author ldy
 * @create 2019-12-13 13:57
 */
public class ConcurrentHashMapDemo {

    public static void main(String[] args) {

        Map<String, String> map = new ConcurrentHashMap<>();
        map.put("aa", "12");
        map.put("cd", "23");
        map.put("ad", "15");

        // JDK1.8版本的ConcurrentHashMap跟HashMap已经非常接近，使用方式都一样
        // 内部实现了并发安全控制
        map.forEach((key, value)->{
            System.out.println("key="+key+",value="+value);
        });

        System.out.println("map的stream直接遍历开始");

        // 使用流stream操作
        map.entrySet().stream().forEach(entry->{
            System.out.println("key="+entry.getKey()+",value="+entry.getValue());
        });
    }

}
