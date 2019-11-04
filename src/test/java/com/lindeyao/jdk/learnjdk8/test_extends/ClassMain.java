package com.lindeyao.jdk.learnjdk8.test_extends;

/**
 * 主执行类
 *
 * @author ldy
 * @create 2019-10-17 11:14
 */
public class ClassMain {

    public static void main(String[] args) {
        InterfaceClass<String> aClass = new NormalClass<String>();
        aClass.setObject("11");
        System.out.println(aClass.getObject());
    }
}
