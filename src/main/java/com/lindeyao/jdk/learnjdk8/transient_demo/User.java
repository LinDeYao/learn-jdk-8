package com.lindeyao.jdk.learnjdk8.transient_demo;

import lombok.Data;

import java.io.Serializable;

/**
 * 用户
 * Serializable 接口之所以定义为空，是因为它只起到了一个标识的作用，告诉程序实现了它的对象是可以被序列化的
 * 但真正序列化和反序列化的操作并不需要它来完成
 * @author ldy
 * @create 2019-09-29 10:21
 */
@Data
public class User implements Serializable {

    private static final long serialVersionUID = 8294180014912103005L;

    private static String para = "我是静态变量，可以序列化保存吗？";

    private String name;
    private transient String password;  //序列化的时候，不想被保存

}
