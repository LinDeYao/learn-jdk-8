package com.lindeyao.jdk.learnjdk8.virtual_machine.overload;

/**
 * 方法动态分派演示
 *
 * 这里主要演示：重写(override)
 * @author DeeLin
 * @create 2019-12-25 22:48
 */
public class DynamicDispatch {

    static abstract class Human {
        protected abstract void sayHello();
    }
    static class Man extends Human {
        @Override
        protected void sayHello() {
            System.out.println("man say hello");
        }
    }
    static class Women extends Human {
        @Override
        protected void sayHello() {
            System.out.println("Women say hello");
        }
    }

    public static void main(String[] args) {
        Human man = new Man();
        Human women = new Women();
        man.sayHello();
        women.sayHello();
        man = new Women();
        man.sayHello();

        /**
         * 输入结果：man say hello
         * 输入结果：Women say hello
         *
         * 静态类型相同的两个变量，最终执行结果却不相同，可知，是因为变量的实际类型不同，产生不同的结果
         * 因此，重写调用的结果，主要看变量的实际类型。
         * 重载，主要看方法的参数类型和数量，参数类型主要参考变量的静态类型
         *
         * 重载是静态，重写是动态的，只有重写才算是多态性的体现
         */
    }
}
