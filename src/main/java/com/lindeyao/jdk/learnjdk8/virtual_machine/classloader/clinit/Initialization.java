package com.lindeyao.jdk.learnjdk8.virtual_machine.classloader.clinit;

/**
 * 类加载过程中的初始化阶段
 * 查看类初始化时，执行<clinit>过程的先后顺序
 * 主要执行类变量的赋值工作，包括static变量和static代码块
 *
 * @author DeeLin
 * @create 2019-12-15 10:59
 */
public class Initialization {

    public static void main(String[] args) {
        System.out.println(Sub.B);
    }

    // 输出的结果为2
    /**
     *
     * 从虚拟机执行结果来看，我们来分析下字节码执行过程：
     * 主执行类(Initialization.class，包含了main方法)，虚拟机会先加载并初始化Initialization类
     * 执行过程中，发现调用了(Sub类的getstatic指令，获取静态变量B)，那虚拟机会初始化Sub类(执行<clinit>方法)
     * 而子类在初始化时，会先初始化父类Parent，执行父类的<clinit>方法，也就是对类变量A赋值为1，再执行static代码块，将类变量A赋值为2。
     * 接着执行子类的<clinit>方法，将类变量B进行赋值，从父类中继承的类变量A，赋值给B，因此，变量B的值输出为2。执行完毕。
     *
     */
}
