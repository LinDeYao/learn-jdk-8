package com.lindeyao.jdk.learnjdk8.design_patterns.structuremodel.template.bank_bussiness;

/**
 * 模板方法--银行业务流程抽象: 具体业务：取号排队 -> 办理具体业务 -> 对银行工作人员进行评分
 *
 * @author ldy
 * @create 2020-01-09 15:14
 */
public abstract class AbstractBankBussinessProcess {

    private static int orderNumber = 0; // 号

    /**
     * 排队取号
     * 由于排队取号具体逻辑所有人都是一样，不会改变，所有由父类自己实现
     * @return
     */
    private void getOrderNumber() {
        System.out.println("开始取号：" + (++orderNumber));
    }

    /**
     * 办理业务
     * 具体办理什么业务，只有到具体场景下才知道，延迟到子类自己去实现
     * 声明为protect是为了让子类能够覆写该方法，其他类访问不到，降低方法的访问权限
     */
    protected abstract void doBussiness();

    /**
     * 评价
     * 具体对业务进行什么评价，由用户自己去决定，延迟到子类去实现(不同的人不同的评价)
     * @return
     */
    protected abstract String assess();

    /**
     * 算法结构(业务)，这是重点，算法顺序是不会改变的。这里就是模板方法，非常简单
     *
     * 提供给外部人员调用，所以声明为 public, 声明为final，防止子类重写该算法。
     */
    public final void bankBussinessProcess() {
        // 取号排队
        this.getOrderNumber();
        // 办理业务
        this.doBussiness();
        // 业务人员评价
        this.assess();
    }
}
