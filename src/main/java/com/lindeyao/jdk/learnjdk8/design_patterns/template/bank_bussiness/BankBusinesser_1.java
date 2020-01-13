package com.lindeyao.jdk.learnjdk8.design_patterns.template.bank_bussiness;

/**
 * 模板方法--业务办理人员
 * 通过继承的方式，实现模板方法
 *
 * @author ldy
 * @create 2020-01-09 15:38
 */
public class BankBusinesser_1 extends AbstractBankBussinessProcess {

    @Override
    protected void doBussiness() {
        System.out.println("业务人员1办理“办卡业务”");
    }

    @Override
    protected String assess() {
        System.out.println("业务人员1评价“满分”");
        return "";
    }
}
