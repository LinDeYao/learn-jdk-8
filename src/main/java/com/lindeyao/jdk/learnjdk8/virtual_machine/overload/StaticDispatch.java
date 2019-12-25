package com.lindeyao.jdk.learnjdk8.virtual_machine.overload;

/**
 * 方法静态分派演示
 * 其实主要演示：重载方法
 * @author DeeLin
 * @create 2019-12-25 21:04
 */
public class StaticDispatch {

    static abstract class Human {
    }

    static class Man extends Human {
    }

    static class Women extends Human {
    }

    // 重载方法一
    public void sayHello(Human guy) {
        System.out.println("hello,guy!");
    }
    // 重载方法二
    public void sayHello(Man guy) {
        System.out.println("hello,gentleman!");
    }
    // 重载方法三
    public void sayHello(Women guy) {
        System.out.println("hello,lady!");
    }

    public static void main(String[] args) {
        Human man = new Man();
        Human women = new Women();
        StaticDispatch staticDispatch = new StaticDispatch();
        staticDispatch.sayHello(man);
        staticDispatch.sayHello(women);
        /*staticDispatch.sayHello((Man) man);
        staticDispatch.sayHello((Women) women);*/

        /**
         * 输出结果都是：hello,guy!
         *
         * 我们先了解两个概念：
         * Human man = new Man();
         * 上面代码中的"Human"称为变量的静态类型(static Type)，后面的"Man"则为变量的实际类型
         * 静态类型和实际类型在程序中都可以发生一些变化，区别是静态类型的变化仅仅在使用时发生，
         * 变量本身的静态类型不会被改变，并且最终的静态类型是在编译期可知的；
         * 而实际类型变化的结果在运行期才可确定，编译器在编译程序的时候，并不知道一个对象的实际类型
         * 是什么
         *
         * // 实际类型变化
         * Human man = new Man(); // 实际类型是Man
         * man = new Women();  // 实际类型变成了Women，只有在运行期才可确定
         * // 静态类型变化
         * sr.sayHello((Man) man) // 本身man变量的静态类型并没有改变
         *
         * 再回到上面的输出结果，我们采用哪个重载版本，完全取决于传入参数的数量和数据类型。
         * // 重点
         * 虚拟机在重载的时候是通过参数的静态类型而不是实际类型作为判定依据的。并且静态类型是编译期
         * 可知的，所以在编译阶段，javac会根据参数的静态类型决定使用哪个重载版本。
         */

    }
}
