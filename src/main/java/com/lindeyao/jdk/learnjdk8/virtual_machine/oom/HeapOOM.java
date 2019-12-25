package com.lindeyao.jdk.learnjdk8.virtual_machine.oom;

import java.util.ArrayList;
import java.util.List;

/**
 * java堆内存溢出
 *
 * Java堆主要是用来存储对象实例，如果要让堆内存造成内存溢出异常，只要保证以下两个条件：
 * 1：我们只要不断地创建新对象
 * 2：保证GC Roots到对象之间有可达路径来避免垃圾回收机制清除新创建的对象，当达到最大堆容量限制后，就会产生内存溢出异常(避免垃圾回收器回收对象)。
 *
 * 我们需要设置虚拟机，堆内存的大小，比较容易看到异常结果
 * (将堆的最小值：-Xms参数 与 最大值：-Xmx参数设置为一样，可避免堆自动扩展)
 *
 * 通过参数 -XX：+HeapDump OnOutOfMemoryError
 * 可以让虚拟机在出现内存溢出异常时Dump出当前的内存堆转储快照以便事后分析
 *
 * @author ldy
 * @create 2019-12-06 11:39
 */
public class HeapOOM {

   static class OOMObject {

   }

    /**
     * 设置虚拟机堆内存大小为20m，且不可扩展：Run->Edit Configurations->VM Options选项
     * -Xms20m -Xmx20m -XX:+HeapDumpOnOutOfMemoryError
     *
     * @param args
     */
   public static void main(String[] args) {
       List<OOMObject> list = new ArrayList<>();

       while (true) {
           list.add(new OOMObject());
       }
   }

}
