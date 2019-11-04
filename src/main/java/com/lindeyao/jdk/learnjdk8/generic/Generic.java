package com.lindeyao.jdk.learnjdk8.generic;

import java.lang.reflect.Array;

/**
 * 泛型设计
 *
 * @author ldy
 * @create 2019-09-09 17:12
 */
public class Generic<T> {

    private T[] arr;

    // 泛型不能直接实例化
    //private T t = new T();

    public Generic(Class<T> type, int i) {
        this.arr = (T[]) Array.newInstance(type, i);
    }

    public T get(int i) {
        return arr[i];
    }

    public void set(int i, T t) {
        this.arr[i] = t;
    }

    // 泛型方法，泛型参数可以不用在类上面声明
    public <U> void getU(U u) {
        System.out.println(u);
    }

    public static void main(String[] args) {
        Generic<String> arr = new Generic<>(String.class, 2);
        arr.set(0, "测试泛型");

        String o = arr.get(0);
        System.out.println(o);

        arr.getU("测试泛型方法");
    }
}
