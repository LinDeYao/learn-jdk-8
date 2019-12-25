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
    }
}
