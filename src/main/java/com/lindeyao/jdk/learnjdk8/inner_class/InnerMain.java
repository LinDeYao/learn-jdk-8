package com.lindeyao.jdk.learnjdk8.inner_class;

/**
 * 内部类学习--主执行类
 *
 * @author ldy
 * @create 2019-10-10 15:15
 */
public class InnerMain {

    public static void main(String[] args) {
        Goods goods = new Goods();

        // 隐藏了同一个包下面的类，从代码中我们并不知道里面的实现逻辑
        Contents c = goods.cont();

        // 访问内部类变量必须要先创建内部类对象
        Destination d = goods.dest("beijing");
    }

}
