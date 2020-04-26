package com.lindeyao.jdk.learnjdk8.design_patterns.createmodel.factory.factory_abstract;

import com.lindeyao.jdk.learnjdk8.design_patterns.createmodel.factory.factory_method.Human;

/**
 * 抽象工厂方法-- 人类（抽象出来），新增了sex属性
 *
 * @author lindeyao
 * @create 2019-11-18-15:35
 */
interface IHuman extends Human {

    // 获取性别
    void getSex();

}
