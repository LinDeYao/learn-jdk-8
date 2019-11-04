package com.lindeyao.jdk.learnjdk8.inner_class;

/**
 * 内部类学习--实体类
 *
 * @author ldy
 * @create 2019-10-10 15:08
 */
public class Goods {

    // 创建内部类并实现接口
    private class Content implements Contents {
        private int i = 11;
        @Override
        public int value() {
            return i;
        }
    }

    // 创建内部类2并实现接口
    protected class GDestination implements Destination {
        private String label;

        private GDestination(String whereTo) {
            label = whereTo;
        }

        @Override
        public String readLabel() {
            return label;
        }
    }

    public Destination dest(String s) {
        return new GDestination(s);
    }

    public Contents cont() {
        return new Content();
    }

}
