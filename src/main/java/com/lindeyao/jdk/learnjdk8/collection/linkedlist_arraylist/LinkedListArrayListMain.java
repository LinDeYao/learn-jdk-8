package com.lindeyao.jdk.learnjdk8.collection.linkedlist_arraylist;

import java.util.*;

/**
 * 主执行类
 *
 * @author ldy
 * @create 2019-10-11 10:35
 */
public class LinkedListArrayListMain {

    public static void main(String[] args) {

        //ArrayList

        ArrayList<String> arr = new ArrayList<>();
        arr.add("1");
        arr.add("2");
        arr.add("3");

        //LinkedList

        LinkedList<String> list = new LinkedList<>();
        //list.add();


        Set hashSet = new HashSet();
        hashSet.add(null);
        hashSet.add(null);
        for (int i = 0; i < 100; i++) {
            hashSet.add(i);
        }
        hashSet.forEach(e-> {
            System.out.println(e);
        });

        Set linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(null);
        linkedHashSet.add("1");
        linkedHashSet.add("2");
        linkedHashSet.forEach(e-> {
            System.out.println(e);
        });

        //TreeSet
    }

}
