package com.lindeyao.jdk.learnjdk8.collection.fastfail_fastsafe;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 集合中fast-fail（快速失败机制）
 *
 * @author ldy
 * @create 2020-08-05 10:46
 */
public class FastFailTest {

    public static void main(String[] args) {
        // 集合
        List<Integer> list = new ArrayList<>();
        // 先新增部分数据
        for (int i = 0; i < 5; i++) {
            list.add(i);
        }

        testIterator(list);

//        testFor(list);
    }

    private static void testFor(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            if(i == 3) {
                list.remove(i);
            } else {
                // 打印数据
                System.out.println(i);
            }
        }
    }


    private static void testIterator(List<Integer> list) {
        // 遍历
        Iterator<Integer> iterator = list.iterator();

        // 记录遍历的下标
        int temp = 0;
        while (iterator.hasNext()) {
            Integer next = iterator.next();
            temp++;
            if(temp == 3) {
                // 对集合 list 的结构进行改变(insert或者delete)，如果只是对下标对应的值就行修改，则不会改变集合的结构
//                list.remove(temp);
                iterator.remove();
            } else{
                // 打印数据
                System.out.println(next);
            }
        }
    }
}
