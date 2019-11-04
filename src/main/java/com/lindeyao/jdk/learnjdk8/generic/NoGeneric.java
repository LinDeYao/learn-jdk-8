package com.lindeyao.jdk.learnjdk8.generic;

/**
 * 没有使用泛型的情况
 *
 * @author ldy
 * @create 2019-09-09 15:54
 */
public class NoGeneric {

    private Object [] arr;

    public NoGeneric(int i) {
        this.arr = new Object[i];
    }

    public Object getObject(int i) {
        return arr[i];
    }

    public void setObj(int i, Object o) {
        this.arr[i] = o;
    }

    public static void main(String[] args) {
        NoGeneric arr = new NoGeneric(3);
        arr.setObj(0, "我是泛型");

        // 取出数据需要进行类型强制转换
        String data = (String) arr.getObject(0);
        System.out.println(data);
    }
}
