package com.lindeyao.jdk.learnjdk8.design_patterns.objectbehavior.template.bank_bussiness;

/**
 * 模板方法--场景调用类
 *
 * @author ldy
 * @create 2020-01-09 15:42
 */
public class Client {

    public static void main(String[] args) {
        AbstractBankBussinessProcess bankBussiness_1 = new BankBusinesser_1();
        // 人员1办理业务
        bankBussiness_1.bankBussinessProcess();
        // 人员2办理业务
        AbstractBankBussinessProcess bankBussiness_2 = new BankBusinesser_2();
        bankBussiness_2.bankBussinessProcess();
    }

}
