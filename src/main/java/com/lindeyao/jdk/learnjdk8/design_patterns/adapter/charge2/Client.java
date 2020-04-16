package com.lindeyao.jdk.learnjdk8.design_patterns.adapter.charge2;

import com.lindeyao.jdk.learnjdk8.design_patterns.adapter.charge.Mobile;
import com.lindeyao.jdk.learnjdk8.design_patterns.adapter.charge.Voltage220;

/**
 * 适配器模式：对象型适配器
 * 介绍：Client类：手机进行充电
 *
 * @author ldy
 * @create 2020-04-14 11:15
 */
public class Client {

    public static void main(String[] args) {
        Mobile mobile = new Mobile();
        mobile.charging(new VoltageAdapter(new Voltage220()));
    }

    // 对象适配器和类适配器其实算是同一种思想，只不过实现方式不同。类适配器是通过继承关系拥有系统现有方法，
    // 对象适配器是通过关联关系(其中的一种关系：依赖关系)，使用原有系统的类的对象来执行现有方法。

    // 根据合成复用原则，组合大于继承，所以，采用对象适配器比较常用
    // 它解决了类适配器必须继承src的局限性问题，也不再强求dst必须是接口。
    // 同样的它使用成本更低，更灵活。


}
