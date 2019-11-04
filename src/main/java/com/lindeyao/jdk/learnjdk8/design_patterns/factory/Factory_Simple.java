package com.lindeyao.jdk.learnjdk8.design_patterns.factory;

import org.junit.Test;

/**
 * 简单工厂模式
 * 定义：只有对应一个工厂类，根据传递参数的不同返回不同的实例对象，对象所对应的类具有共同的父类或者接口
 *
 *
 * @author ldy
 * @create 2019-10-12 9:58
 */
public class Factory_Simple {

    /**
     * 定义统一行为的接口：Shape形状
     */
    private interface Shape {
        // 画图
        void draw();
    }

    /**
     * 实体类: 圆形
     */
    private class CircleShape implements Shape {
        public CircleShape() {
            System.out.println("created: CircleShape");
        }

        @Override
        public void draw() {
            System.out.println("draw: CircleShape");
        }
    }

    /**
     * 实体类: 三角形
     */
    private class RectShape implements Shape {
        public RectShape() {
            System.out.println("created: RectShape");
        }

        @Override
        public void draw() {
            System.out.println("draw: RectShape");
        }
    }

    /**
     * 简单工厂实现
     * 从代码中，可以得到几个缺点：
     * 1：如果创建对象的类型非常多，那么对应的创建对象逻辑也会跟着增长(越来越多的if else)
     * 2：如果新增一个类型，那么工厂类也要跟着修改
     * 3：调用者还需要找到类所对应的传参类型，需要看源码才知道
     */
    private class ShapeFactory {

        /**
         * 核心方法：根据不同类型返回不同的对象
         * @param type
         * @return
         */
        public Shape createShape(String type) {
            if(type.equalsIgnoreCase("circle")) {
                return new CircleShape();
            } else if(type.equalsIgnoreCase("rect")) {
                return new RectShape();
            }
            return null;
        }
    }

    @Test
    public void test() {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape shape = shapeFactory.createShape("circle");
        shape.draw();
    }
}
