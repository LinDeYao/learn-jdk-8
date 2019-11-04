package com.lindeyao.jdk.learnjdk8.generic;

/**
 * 泛型例子
 *
 * @author ldy
 * @create 2019-09-09 11:31
 */
public class Foo <T> {

    // 约定实例变量的类型
    private T data;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public static void main(String[] args) {
        Foo<String> s = new Foo<>();
    }
}
