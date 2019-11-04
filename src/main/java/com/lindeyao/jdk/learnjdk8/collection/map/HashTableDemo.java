package com.lindeyao.jdk.learnjdk8.collection.map;

import java.util.Hashtable;
import java.util.Map;

/**
 * HashTable测试
 *
 * @author ldy
 * @create 2019-10-17 17:51
 */
public class HashTableDemo {

    public static void main(String[] args) {

        /**
         * 测试是否能插入键为null,因为Null的hashcode会报错
         * 本身会校验value是否为null。
         */
        Map map = new Hashtable();
        //map.put(null, "");    // 报错
        //map.put("1", null);   // 报错

        map.put("3", "Value3");
        map.put("1", "Value1");
        map.put("2", "Value2");
        map.put("b", "ValueB");
        map.put("a", "ValueA");

        // 从put源码中，可以看到方法加上了 synchronized，会导致对Hashtable的操作变慢。
        map.forEach((key, value)->{
            System.out.println("key="+key+"; value="+value);
        });

    }

}
