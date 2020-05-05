package com.lindeyao.jdk.learnjdk8.design_patterns.objectbehavior.strategy.calculation;

/**
 * 策略模式： 具体场景类
 *
 * @author ldy
 * @create 2020-05-05 10:33
 */
public class Client {

    public static void main(String[] args) {

        // 进行加法计算
        Context context = new Context(new OperationAdd());
        System.out.println("进行加法运算：2 + 1 = " + context.executeStrategy(2, 1));

        // 进行减法运算
        context = new Context(new OperationSubstract());
        System.out.println("进行减法运算：2 - 1 = " + context.executeStrategy(2, 1));

        // 进行乘法运算
        context = new Context(new OperationMultiply());
        System.out.println("进行乘法运算：2 * 1 = " + context.executeStrategy(2, 1));
    }

    /**
     * 总结： 从上面的代码中可以看出，一个类的具体行为是根据具体策略的不同选择，行为结果截然不同，而方法的调用过程都不没有变化过。
     * 把行为都封装到具体的策略类中，至此，可以根据不同的需求，在运行期间动态的选择不同策略。
     *
     * 策略类需要有三个不同的角色：1：策略行为抽象：抽象行为类； 2：不同算法行为的具体类：具体策略行为类； 3：环境(Context)角色：持有策略抽象类的一个引用
     */
}
